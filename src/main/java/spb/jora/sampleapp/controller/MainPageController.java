package spb.jora.sampleapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPageController {

    @GetMapping("main")
    public String mainPage() {
        return "index";
    }


    @GetMapping("user")
    public String userPage() {
        return "user";
    }
}
