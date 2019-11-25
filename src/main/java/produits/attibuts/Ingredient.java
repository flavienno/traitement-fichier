package produits.attibuts;

public class Ingredient {

	private String libelle;

	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * @param libelle
	 *            the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * @param libelle
	 */
	public Ingredient(String libelle) {
		super();
		this.libelle = libelle;
	}

}
