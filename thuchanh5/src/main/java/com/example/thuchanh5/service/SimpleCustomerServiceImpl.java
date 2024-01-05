package com.example.thuchanh5.service;

import com.example.thuchanh5.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class SimpleCustomerServiceImpl implements ICustomerService{
    private final List<Customer> customers;

    public SimpleCustomerServiceImpl() {
        customers = new ArrayList<>();
        customers.add(new Customer(0, "Nguyen Khac Nhat", "nhat@codegym.vn", "Hà Nội"));
        customers.add(new Customer(1, "Dang Huy Hoa", "hoa.dang@codegym.vn", "Đà Nẵng"));
        customers.add(new Customer(2, "Nguyen Thuy Duong", "duong.nguyen@codegym.vn", "Sài Gòn"));
    }
    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void save(Customer customer) {
        Customer c = findById(customer.getId());
        c.setName(customer.getName());
        c.setEmail(customer.getEmail());
        c.setAddress(customer.getAddress());
    }
}
