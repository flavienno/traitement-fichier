package produits.attibuts;

import java.util.ArrayList;
import java.util.List;

public class Stock {

	private List<Produit> produits= new ArrayList<Produit>();

	/**
	 * @return the produits
	 */
	public List<Produit> getProduits() {
		return produits;
	}

	/**
	 * @param produits the produits to set
	 */
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	
	
}
