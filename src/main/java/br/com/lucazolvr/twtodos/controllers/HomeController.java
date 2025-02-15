package br.com.lucazolvr.twtodos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping("/")
    public ModelAndView home(){
        var ModelAndView = new ModelAndView("home");
        return ModelAndView;
    }
    
}
