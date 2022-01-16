package az.sarkhan.blogwebsite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import az.sarkhan.blogwebsite.model.Content;
import az.sarkhan.blogwebsite.model.Image;
import az.sarkhan.blogwebsite.repo.ContentRepo;
import az.sarkhan.blogwebsite.repo.ImageRepo;
@Controller
public class PhotosController {
    @Autowired
    public ContentRepo contentRepo;
    @Autowired
    public ImageRepo imageRepo;
    @GetMapping(path = "/photos")
    public String GetPhotosPage(Model model){
        List<Image>images=imageRepo.findAll();
        model.addAttribute("images", images);
        return "photos";
    
    }
}
