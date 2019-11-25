package appli.utils;

import produits.attibuts.Produit;
import produits.attibuts.Stock;

public class ParseurStock {

	/**
	 * Ajoute une ligne représentant un produit au stock
	 * 
	 * @param Stock
	 * @param ligne
	 *            ligne de laquelle on extrait un produit
	 */
	public static void ajoutLigne(Stock stock, String ligne) {

		String[] morceaux = ligne.split("|");
		String nom = morceaux[0];
		String grade = morceaux[1];
		String categorie = morceaux[2];
		String marque = morceaux[3];
		String ingredient = morceaux[4];
		String energie100g = morceaux[5];
		String graisse100g = morceaux[6];
		String graisseSaturee100g = morceaux[7];
		String hydratesCarbones100g = morceaux[8];
		String sucres100g = morceaux[9];
		String fibres100g = morceaux[10];
		String proteines100g = morceaux[11];
		String sel100g = morceaux[12];
		String vitA100g = morceaux[13];
		String vitD100g = morceaux[14];
		String vitE100g = morceaux[15];
		String vitK100g = morceaux[16];
		String vitC100g = morceaux[17];
		String vitB1100g = morceaux[18];
		String vitB2100g = morceaux[19];
		String vitPP100g = morceaux[20];
		String vitB6100g = morceaux[21];
		String vitB9100g = morceaux[22];
		String vitB12100g = morceaux[22];
		String calcium100g = morceaux[22];
		String magnesium100g = morceaux[22];
		String fer100g = morceaux[22];
		String betaCarotene100g = morceaux[22];
		String presenceHuilePalme = morceaux[22];
		String pourcentageFruitsLegumes100g = morceaux[22];

		// int populationTotale = Integer.parseInt(population.replace(" ",
		// "").trim());

		// On cree maintenant les produits avec toutes leurs données
//		Produit produit = new Produit(nom, grade, categorie, marque, ingredient, energie100g, graisse100g,
//				graisseSaturee100g, hydratesCarbones100g, sucres100g, fibres100g, proteines100g, sel100g, vitA100g,
//				vitD100g, vitE100g, vitK100g, vitC100g, vitB1100g, vitB2100g, vitPP100g, vitB6100g, vitB9100g,
//				vitB12100g, calcium100g, magnesium100g, fer100g, betaCarotene100g, presenceHuilePalme,
//				pourcentageFruitsLegumes100g);

		// On ajoute les produits la liste des produits en stock
//		stock.getProduits().add(produit);

	}
}
