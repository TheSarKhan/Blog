package az.sarkhan.blogwebsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class IndexController {

    @GetMapping(path = { "/index","/","/home"})
    public String GetIndex() {
        return "index";
    }
}
