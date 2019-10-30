package com.springmvc_demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {


    @RequestMapping("/showForm")
    public String showForm(Model model){
        //create student
        Student theStudent = new Student();
        //add student object to the model
        model.addAttribute("student", theStudent);
        return "student-Form";
    }

    @RequestMapping("/processForm")
public String processForm (
        @ModelAttribute("student")Student student, Model model){

        //log the input data
        System.out.println("Student: " + student.getFirstName() + " " + student.getLastName());

    return "student-confirmation";
}

}
