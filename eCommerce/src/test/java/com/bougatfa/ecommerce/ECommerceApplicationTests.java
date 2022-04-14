package com.bougatfa.ecommerce;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bougatfa.ahmed.repository.repositoryproduit;
import com.bougatfa.ahmed.model.Produit;


@SpringBootTest
class ECommerceApplicationTests {
	
	@Autowired
	private repositoryproduit repo;
	

	@Test
	public void ajoutProduit() {
		
		Produit p = new Produit("ahmed","bougatf",55.40);
		repo.save(p);
		System.out.print(repo.findAll());
		
	}

}
