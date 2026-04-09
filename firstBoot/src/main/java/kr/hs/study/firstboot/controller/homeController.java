package kr.hs.study.firstboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class homeController {
    @GetMapping("/")
    public String home(){
        return "index";
    }

    // test1 < get 방식의 접속
    @GetMapping("/test1")
    public String test1(){
        return "test1"; // welcome test1
    }

    @GetMapping("/login")
    public String login_form(){
        return "login";
    }

    @PostMapping("/login")
    public String login_result(){
        return "login_result";
    }
}
