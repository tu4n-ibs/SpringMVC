package com.example.caculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CaculatorController {
    @GetMapping("/home")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("home");
        return modelAndView;
    }

    @RequestMapping(value = "caculator", method = RequestMethod.POST)
    public ModelAndView addition(@RequestParam(name = "addition", required = false) String addition,
                                 @RequestParam(name = "subtraction", required = false) String subtraction,
                                 @RequestParam(name = "multiplication", required = false) String multiplication,
                                 @RequestParam(name = "division", required = false) String division,
                                 @RequestParam("number1") int number1,
                                 @RequestParam("number2") int number2) {
        ModelAndView modelAndView = new ModelAndView("home");
        int total = 0;
        if (addition != null) {
            total = number1 + number2;
        }
        if (subtraction != null) {
            total = number1 - number2;
        }
        if (multiplication != null) {
            total = number1 * number2;
        }
        if (division != null) {
            total = number1 / number2;
        }
        modelAndView.addObject("result", total);
        return modelAndView;
    }

}
