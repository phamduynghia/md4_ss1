package com.ra.md4_ss1_bt1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class IHomeController {
    @GetMapping
    public String home() {
        return "home";
    }

}
