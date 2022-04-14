package com.bougatfa.ahmed.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bougatfa.ahmed.model.Produit;
import com.bougatfa.ahmed.repository.repositoryproduit;


@Controller
public class controll {
	
	@Autowired
	private repositoryproduit repo;
			
		@GetMapping("/")
		public String viewHome(Model model ) {
		List <Produit> l = repo.findAll();
		model.addAttribute("Produit", l);
		System.out.print("Get /");
		return "index";
		
		


}
	
	

		
	

}
