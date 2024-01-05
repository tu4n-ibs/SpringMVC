package com.example.thuchanh5.service;

import com.example.thuchanh5.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    Customer findById(int id);

    void save(Customer customer);
}
