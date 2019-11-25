package appli.utils;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

import produits.attibuts.Stock;

public class StockUtils {

	/**
	 * Lit le contenu du fichier en paramétre, contenant des données de produit
	 * avec le format attendu, et retourne une instance de la classe Stock avec
	 * tous ses produits
	 * 
	 * @param cheminFichier
	 *            chemin d'accés au fichier sur le disque dur
	 * @return {@link Stock}
	 */

	public static Stock lire(String cheminFichier) {
		Stock stock = new Stock();

		List<String> lignes = null;
		try {
			File file = new File(cheminFichier);
			lignes = FileUtils.readLines(file, "UTF-8");

			// On supprime la ligne d'entéte avec les noms des colonnes
			lignes.remove(0);

			for (String ligne : lignes) {
				ParseurStock.ajoutLigne(stock, ligne);
			}
			return stock;

		} catch (IOException e) {
			System.out.println(e.getMessage());
			return null;
		}

	}
}
