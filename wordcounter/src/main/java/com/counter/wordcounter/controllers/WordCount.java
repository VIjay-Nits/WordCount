package com.counter.wordcounter.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WordCount {

    @RequestMapping("/home")
    public String test(){
        System.out.println("Home Page");
        return "index";
    }

    @RequestMapping(path="/count",method = RequestMethod.POST)
    public String countWords(@RequestParam("textInput") String input,
                             Model model){

        //System.out.println(input);
        model.addAttribute("count",input.split(" ").length);
        model.addAttribute("output",input);
        return "index";
    }
}
