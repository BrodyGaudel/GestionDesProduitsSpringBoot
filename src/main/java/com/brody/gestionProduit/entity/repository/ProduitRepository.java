package com.brody.gestionProduit.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brody.gestionProduit.entity.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
