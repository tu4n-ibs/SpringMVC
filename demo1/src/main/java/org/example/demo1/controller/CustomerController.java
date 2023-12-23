package org.example.demo1.controller;

import org.example.demo1.model.Customer;
import org.example.demo1.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService service;

    //    @GetMapping("/customers")
//    public String showList(HttpServletRequest request){
//        List<Customer> customers = service.findAll();
//        request.setAttribute("customers",customers);
//        return "customers/list.jsp";
//    }
    @GetMapping("/customers")
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("customers/list.jsp");
        List<Customer> customers = service.findAll();
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }

   

}
