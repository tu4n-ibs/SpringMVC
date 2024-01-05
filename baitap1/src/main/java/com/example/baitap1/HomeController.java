package com.example.baitap1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping("/home")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("home");
        return modelAndView;
    }

    @PostMapping("/save")
    public ModelAndView save(@RequestParam("condiment") String[] condiment) {
        ModelAndView modelAndView = new ModelAndView("result");
        String result = "";
        for (int i = 0; i < condiment.length; i++) {
            if (!condiment[i].equals("") && condiment[i] != null) {
                result += condiment[i] + " ";
            }
        }
        if (result.equals("")) {
            modelAndView.addObject("message", "null");
        } else {
            modelAndView.addObject("condiment", result);
        }
        return modelAndView;
    }
}
