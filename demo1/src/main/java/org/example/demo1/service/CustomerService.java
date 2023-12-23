package org.example.demo1.service;

import org.example.demo1.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    private static List<Customer> customerList = new ArrayList<>();

    static {
        customerList.add(new Customer(0,"phuong ly","phuong ly@gmail.com","ho chi minh"));
        customerList.add(new Customer(1,"vuong van tuan","tuan@gmail.com","ha noi"));
        customerList.add(new Customer(2,"nguyen khac nhat","nhat@gmail.com","nghe an"));
        customerList.add(new Customer(3,"codegym","codegym@gmail.com","ha noi"));
    }

    public List<Customer> findAll(){
        return new ArrayList<>(customerList);
    }

    public Customer findCustomer(int id){
        return customerList.get(id);
    }

}
