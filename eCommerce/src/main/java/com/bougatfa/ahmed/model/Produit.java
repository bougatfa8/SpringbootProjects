package com.bougatfa.ahmed.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Produit {

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

	
	private long id ;
	private String name;
	private String category;
	private Double prix;
	
	
	

	
	public Produit(String name, String category, Double d) {
		super();
		this.name = name;
		this.category = category;
		this.prix =  d;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	
	
	

}
