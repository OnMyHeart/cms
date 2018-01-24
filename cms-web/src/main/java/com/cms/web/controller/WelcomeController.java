package com.cms.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

    @RequestMapping({"","/","/welcome"})
    public String  login(ModelMap modelMap){
        return "/login";
    }

}
