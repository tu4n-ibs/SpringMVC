package com.example.baitap1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MoneyConversionController {

    @GetMapping("/home")
    public String show(){
        return "home";
    }
    @GetMapping("/money")
    public ModelAndView Conversion (@RequestParam("money") int usd, @RequestParam("rate") int rate){
        int result = usd * rate;
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("result",result);
        return modelAndView;
    }
}
