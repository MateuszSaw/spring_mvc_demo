package com.springmvc_demo;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm(){
        return"helloworld-form";
    }


    @RequestMapping("/processForm")
    public String processForm(){
        return"helloworld";
    }

    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model){

        String theName = request.getParameter("studentName");

        theName = theName.toUpperCase();

        String result = "Yo! Yo! " + theName;

        model.addAttribute("message", result);
        return "helloworld";



    }

}
