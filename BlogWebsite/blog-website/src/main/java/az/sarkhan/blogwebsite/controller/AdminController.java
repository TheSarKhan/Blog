package az.sarkhan.blogwebsite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import az.sarkhan.blogwebsite.file.StorageService;
import az.sarkhan.blogwebsite.model.Content;
import az.sarkhan.blogwebsite.model.Image;
import az.sarkhan.blogwebsite.repo.ContentRepo;
import az.sarkhan.blogwebsite.repo.ImageRepo;
 
@Controller
public class AdminController {
    @Autowired
    public StorageService storageService;
    @Autowired
    public ImageRepo imageRepo;
    @Autowired
    public ContentRepo contentRepo; 
    @GetMapping(path = "/admin")
    public String GetAdminPage(Model model){
        Content content=new Content();
        model.addAttribute("content", content);
        return "admin";
    }
    @PostMapping(value="/new-content")
    public String saveContent( @ModelAttribute(name = "content") Content content,  Model model) {   
            content.setHeader(content.getHeader());
            content.setText(content.getText()); 
          contentRepo.save(content); 
        
            List<Content> contents=contentRepo.findAll(); 
        model.addAttribute("contents", contents);
        return "redirect:/blog";
    }
      @PostMapping(path = "/new-photo")
      public String savePhoto( @ModelAttribute(name = "content") MultipartFile file,Image image,Model model){
 
 image.setImage(storageService.store(file));
imageRepo.save(image);
List<Image> images=imageRepo.findAll(); 
model.addAttribute("images", images);

        return "redirect:/photos";
      }

    } 
