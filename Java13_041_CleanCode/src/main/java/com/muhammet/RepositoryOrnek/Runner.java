package com.muhammet.RepositoryOrnek;

import com.muhammet.RepositoryOrnek.entity.Customer;

public class Runner {
    public static void main(String[] args) {
        CustomerRepository customerRepository = new CustomerRepository();
        customerRepository.update(new Customer());

        UserRepository userRepository = new UserRepository();
        userRepository.findAll();
    }
}
