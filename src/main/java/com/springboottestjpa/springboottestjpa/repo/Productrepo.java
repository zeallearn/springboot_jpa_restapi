package com.springboottestjpa.springboottestjpa.repo;

import org.springframework.data.repository.CrudRepository;

import com.springboottestjpa.springboottestjpa.dataEntities.Product;

public interface Productrepo extends CrudRepository<Product, Integer> {

}
