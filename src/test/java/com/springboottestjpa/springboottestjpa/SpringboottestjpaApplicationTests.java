package com.springboottestjpa.springboottestjpa;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.springboottestjpa.springboottestjpa.dataEntities.Product;
import com.springboottestjpa.springboottestjpa.repo.Productrepo;

@SpringBootTest
class SpringboottestjpaApplicationTests {

	
	@Autowired
	ApplicationContext ctx;
	
	@Test
	void contextLoads() {
		
	}
	
	/*void saveProduct() {
			Productrepo repo = ctx.getBean(Productrepo.class);
			Product product= new Product();
			product.setId(30);
			product.setName("product3");
			product.setPrice(300.00);
			repo.save(product);
			
			Optional<Product> result = repo.findById(20);
			System.out.println(result);
			
			repo.findAll().forEach(p->{System.out.println(p.getName());});;
					
	}*/
}
