package com.xumilk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactUsController {

    @RequestMapping("/contactus")
    public String order() {

        return "contactus";
    }
}
