package com.example.thuchanh5.controller;

import com.example.thuchanh5.model.Customer;
import com.example.thuchanh5.service.SimpleCustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    public SimpleCustomerServiceImpl customerService = new SimpleCustomerServiceImpl();
    @GetMapping()
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("list");
        List<Customer> customers = customerService.findAll();
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }

    @GetMapping("/{id}")
    public ModelAndView showInformation(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("info");
        Customer customer = customerService.findById(id);
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }

    @PostMapping
    public ModelAndView updateCustomer(Customer customer) {
        ModelAndView modelAndView = new ModelAndView("list");
        customerService.save(customer);
        RedirectView redirectView = new RedirectView("customer");
        List<Customer> customerList = customerService.findAll();
        modelAndView.addObject("customers",customerList);
        return modelAndView.addObject(redirectView);
    }

    @GetMapping("/add")
    public ModelAndView showAddForm(){
        ModelAndView modelAndView = new ModelAndView("add");
        return modelAndView;
    }

    @PostMapping("/add")
    public ModelAndView addCustomer(Customer customer){
        ModelAndView modelAndView = new ModelAndView("list");
        customerService.save(customer);
        RedirectView redirectView = new RedirectView("customer");
        List<Customer> customerList = customerService.findAll();
        modelAndView.addObject("customers",customerList);
        return modelAndView.addObject(redirectView);
    }


}
