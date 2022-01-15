package az.sarkhan.blogwebsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class PhotosController {
    @GetMapping(path = "/photos")
    public String GetPhotosPage(){
        return "photos";
    
    }
}