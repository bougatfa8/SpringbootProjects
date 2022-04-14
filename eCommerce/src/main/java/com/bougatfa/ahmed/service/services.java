package com.bougatfa.ahmed.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bougatfa.ahmed.model.Produit;
import com.bougatfa.ahmed.repository.repositoryproduit;

@Service
public class services {
	
	@Autowired
	private repositoryproduit repo;
	
	
	public List <Produit> fetchAll() {
		List<Produit> l = repo.findAll();
		return  l;
		
	}
	
	public Produit fatchOne(long id) {
		return repo.findById(id).get();
		
	}
	public void supprimer(long id ) {
		repo.deleteById(id);
	}
	public void Update(long id) {
		 Optional<Produit> p =repo.findById(id);
		 
	}
	public void save(Produit p) {
		repo.save(p);
		
	}

}
