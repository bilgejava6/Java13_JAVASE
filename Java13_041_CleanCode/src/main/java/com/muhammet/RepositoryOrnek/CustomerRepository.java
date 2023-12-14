package com.muhammet.RepositoryOrnek;

import com.muhammet.RepositoryOrnek.entity.Customer;

import java.util.List;

public class CustomerRepository extends RespositoryFactory<Customer,Long>{

    public List<Customer> findByNameAndCityIn(String name, List<String> cities){
        return null;
    }
}
