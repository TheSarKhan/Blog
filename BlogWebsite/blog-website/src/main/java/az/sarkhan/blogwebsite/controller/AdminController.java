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

import az.sarkhan.blogwebsite.model.Content;
import az.sarkhan.blogwebsite.repo.ContentRepo;

@Controller
public class AdminController {
    @Autowired
    public ContentRepo contentRepo;
    @GetMapping(path = "/admin")
    public String GetAdminPage(Model model){
        Content content=new Content();
        model.addAttribute("content", content);
        return "admin";
    }
    @PostMapping(value="/new-content")
    public String saveContent( @ModelAttribute(name = "computer") Content content,  Model model) {   
            content.setHeader(content.getHeader());
            content.setText(content.getText()); 
          contentRepo.save(content); 
        
            List<Content> contents=contentRepo.findAll(); 
        model.addAttribute("contents", contents);
        return "redirect:/blog";
    }
}
