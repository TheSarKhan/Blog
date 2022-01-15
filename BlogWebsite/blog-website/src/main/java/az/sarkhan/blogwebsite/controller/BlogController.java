package az.sarkhan.blogwebsite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import az.sarkhan.blogwebsite.model.Content;
import az.sarkhan.blogwebsite.repo.ContentRepo;
@Controller
public class BlogController {
    @Autowired
    public ContentRepo contentRepo;
    @GetMapping(path = "/blog")
    public String GetBlogPage(Model model){
       List<Content>contents=contentRepo.findAll();
        model.addAttribute("contents", contents);
    return "blog";
    }
}
