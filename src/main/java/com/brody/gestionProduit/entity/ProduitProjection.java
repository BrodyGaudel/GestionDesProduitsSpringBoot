package com.brody.gestionProduit.entity;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomProd", types = { Produit.class })
public interface ProduitProjection {
	
	public String getNomProduit();
	
	/**
	 * Restreindre les données avec les Projections
	 * L’objectif des projections est de limiter le résultat JSON retourné à un certain nombre
	 * d’attributs. Par exemple on peut avoir besoin seulement de l’attribut nomProduit :
	 */
}
