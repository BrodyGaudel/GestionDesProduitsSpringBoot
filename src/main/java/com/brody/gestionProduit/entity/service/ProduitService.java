package com.brody.gestionProduit.entity.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.brody.gestionProduit.entity.Produit;

public interface ProduitService {
	
	Produit saveProduit(Produit p);
	Produit updateProduit(Produit p);
	void deleteProduit(Produit p);
	void deleteProduitById(Long id);
	Produit getProduit(Long id);
	List<Produit> getAllProduits();
	Page<Produit> getAllProduitsParPage(int page, int size);
}
