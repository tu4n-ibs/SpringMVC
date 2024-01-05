package com.example.thuchanh2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
public class HomeController {
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private static Pattern pattern;

    public HomeController() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }
    @GetMapping("/home")
    public ModelAndView Home(){
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

    private boolean validate(String email){
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    @PostMapping("/validate")
    public ModelAndView user(@RequestParam("email") String email){
        ModelAndView modelAndView;
        boolean isValid = this.validate(email);
        if (!isValid){
            modelAndView = new ModelAndView("index");
            modelAndView.addObject("message","Email is invalid");
            return modelAndView;
        }
        modelAndView = new ModelAndView("success");
        modelAndView.addObject("email",email);
        return modelAndView;
    }
}
