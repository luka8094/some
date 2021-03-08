package kea.some.controllers;

import kea.some.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class SomeController {

    //Attributer
    ArrayList<Post> arrayList = new ArrayList<Post>();

    //
    //public SomeController(){}

    //Metoder
    @GetMapping("/submit")
    public String renderSubmit(){

        return "submit.html";
    }

    @PostMapping("/submit")
    public String renderSubmit(Model model){


        return "redirect:/submit-post.html";
    }

    @GetMapping("/submit-post")
    public String renderSubmitPost(){

        return "submit-post.html";
    }

    @GetMapping("/dashboard")
    public String renderDashboard(){

        return "dashboard.html";
    }



}
