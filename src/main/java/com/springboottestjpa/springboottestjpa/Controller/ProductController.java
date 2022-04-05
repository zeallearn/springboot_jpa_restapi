package com.springboottestjpa.springboottestjpa.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboottestjpa.springboottestjpa.dataEntities.Product;
import com.springboottestjpa.springboottestjpa.repo.Productrepo;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	Productrepo repository;
	
	@GetMapping
	public Iterable<Product> getProducts() {
		
		return repository.findAll();
		
	}
	
	@PostMapping
	public  Product create(@RequestBody Product product ) {
		return repository.save(product);
	}
	
	@PutMapping
	public  Product update(@RequestBody Product product ) {
		return repository.save(product);
	
	}
	
	@GetMapping("/{id}")
	public  Optional<Product> getProduct(@PathVariable("id") Integer id ) {
		
		return repository.findById(id);
		
	}
	
	
	
	

}
