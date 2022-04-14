package com.bougatfa.ahmed.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bougatfa.ahmed.model.Produit;
@Repository
public interface repositoryproduit extends JpaRepository<Produit, Long> {

}
