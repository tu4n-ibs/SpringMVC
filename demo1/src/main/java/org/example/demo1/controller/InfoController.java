package org.example.demo1.controller;

import org.example.demo1.model.Customer;
import org.example.demo1.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class InfoController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers/info")
    public String showList(HttpServletRequest request){
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = customerService.findCustomer(id);
        request.setAttribute("customer",customer);
        return "customers/info.jsp";
    }
}
