package com.brody.gestionProduit;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.brody.gestionProduit.entity.Produit;
import com.brody.gestionProduit.entity.service.ProduitService;

@SpringBootApplication
public class GestionProduitApplication implements CommandLineRunner{

	@Autowired
	ProduitService produitService;
	
	public static void main(String[] args) {
		SpringApplication.run(GestionProduitApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		produitService.saveProduit(new Produit("Logiciel", 4613.0, new Date()));
		produitService.saveProduit(new Produit("Progiciel", 1233.0, new Date()));
		produitService.saveProduit(new Produit("Cadriciel", 1548.0, new Date()));
		
	}
	
	/*
	 Cette class a été modifier (implements CommandLineRunner) dans le but de:
	 Ajouter quelques produits à chaque démarrage de l’application
	 */

}
