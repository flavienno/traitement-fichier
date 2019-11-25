/**
 * 
 */
package produits.attibuts;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fla
 *
 */
public class Produit {

	private Categorie categorie;
	private Marque marque;
	private String grade;
	private List<Ingredient> ingredients = new ArrayList<Ingredient>();
	private List<Additif> additifs = new ArrayList<Additif>();
	private List<Allergene> allergenes = new ArrayList<Allergene>();
	private String energie100g;
	private String graisse100g;
	private String graisseSaturee100g;
	private String hydratesCarbones100g;
	private String sucres100g;
	private String fibres100g;
	private String proteines100g;
	private String sel100g;
	private String vitA100g;
	private String vitD100g;
	private String vitE100g;
	private String vitK100g;
	private String vitC100g;
	private String vitB1100g;
	private String vitB2100g;
	private String vitPP100g;
	private String vitB6100g;
	private String vitB9100g;
	private String vitB12100g;
	private String calcium100g;
	private String magnesium100g;
	private String fer100g;
	private String betaCarotene100g;
	private String presenceHuilePalme;
	private String pourcentageFruitsLegumes100g;
	/**
	 * @param categorie
	 * @param marque
	 * @param grade
	 * @param ingredients
	 * @param additifs
	 * @param allergenes
	 * @param energie100g
	 * @param graisse100g
	 * @param graisseSaturee100g
	 * @param hydratesCarbones100g
	 * @param sucres100g
	 * @param fibres100g
	 * @param proteines100g
	 * @param sel100g
	 * @param vitA100g
	 * @param vitD100g
	 * @param vitE100g
	 * @param vitK100g
	 * @param vitC100g
	 * @param vitB1100g
	 * @param vitB2100g
	 * @param vitPP100g
	 * @param vitB6100g
	 * @param vitB9100g
	 * @param vitB12100g
	 * @param calcium100g
	 * @param magnesium100g
	 * @param fer100g
	 * @param betaCarotene100g
	 * @param presenceHuilePalme
	 * @param pourcentageFruitsLegumes100g
	 */
	public Produit(Categorie categorie, Marque marque, String grade, List<Ingredient> ingredients,
			List<Additif> additifs, List<Allergene> allergenes, String energie100g, String graisse100g,
			String graisseSaturee100g, String hydratesCarbones100g, String sucres100g, String fibres100g,
			String proteines100g, String sel100g, String vitA100g, String vitD100g, String vitE100g, String vitK100g,
			String vitC100g, String vitB1100g, String vitB2100g, String vitPP100g, String vitB6100g, String vitB9100g,
			String vitB12100g, String calcium100g, String magnesium100g, String fer100g, String betaCarotene100g,
			String presenceHuilePalme, String pourcentageFruitsLegumes100g) {
		super();
		this.categorie = categorie;
		this.marque = marque;
		this.grade = grade;
		this.ingredients = ingredients;
		this.additifs = additifs;
		this.allergenes = allergenes;
		this.energie100g = energie100g;
		this.graisse100g = graisse100g;
		this.graisseSaturee100g = graisseSaturee100g;
		this.hydratesCarbones100g = hydratesCarbones100g;
		this.sucres100g = sucres100g;
		this.fibres100g = fibres100g;
		this.proteines100g = proteines100g;
		this.sel100g = sel100g;
		this.vitA100g = vitA100g;
		this.vitD100g = vitD100g;
		this.vitE100g = vitE100g;
		this.vitK100g = vitK100g;
		this.vitC100g = vitC100g;
		this.vitB1100g = vitB1100g;
		this.vitB2100g = vitB2100g;
		this.vitPP100g = vitPP100g;
		this.vitB6100g = vitB6100g;
		this.vitB9100g = vitB9100g;
		this.vitB12100g = vitB12100g;
		this.calcium100g = calcium100g;
		this.magnesium100g = magnesium100g;
		this.fer100g = fer100g;
		this.betaCarotene100g = betaCarotene100g;
		this.presenceHuilePalme = presenceHuilePalme;
		this.pourcentageFruitsLegumes100g = pourcentageFruitsLegumes100g;
	}
	/**
	 * @return the categorie
	 */
	public Categorie getCategorie() {
		return categorie;
	}
	/**
	 * @param categorie the categorie to set
	 */
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	/**
	 * @return the marque
	 */
	public Marque getMarque() {
		return marque;
	}
	/**
	 * @param marque the marque to set
	 */
	public void setMarque(Marque marque) {
		this.marque = marque;
	}
	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}
	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}
	/**
	 * @return the ingredients
	 */
	public List<Ingredient> getIngredients() {
		return ingredients;
	}
	/**
	 * @param ingredients the ingredients to set
	 */
	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}
	/**
	 * @return the additifs
	 */
	public List<Additif> getAdditifs() {
		return additifs;
	}
	/**
	 * @param additifs the additifs to set
	 */
	public void setAdditifs(List<Additif> additifs) {
		this.additifs = additifs;
	}
	/**
	 * @return the allergenes
	 */
	public List<Allergene> getAllergenes() {
		return allergenes;
	}
	/**
	 * @param allergenes the allergenes to set
	 */
	public void setAllergenes(List<Allergene> allergenes) {
		this.allergenes = allergenes;
	}
	/**
	 * @return the energie100g
	 */
	public String getEnergie100g() {
		return energie100g;
	}
	/**
	 * @param energie100g the energie100g to set
	 */
	public void setEnergie100g(String energie100g) {
		this.energie100g = energie100g;
	}
	/**
	 * @return the graisse100g
	 */
	public String getGraisse100g() {
		return graisse100g;
	}
	/**
	 * @param graisse100g the graisse100g to set
	 */
	public void setGraisse100g(String graisse100g) {
		this.graisse100g = graisse100g;
	}
	/**
	 * @return the graisseSaturee100g
	 */
	public String getGraisseSaturee100g() {
		return graisseSaturee100g;
	}
	/**
	 * @param graisseSaturee100g the graisseSaturee100g to set
	 */
	public void setGraisseSaturee100g(String graisseSaturee100g) {
		this.graisseSaturee100g = graisseSaturee100g;
	}
	/**
	 * @return the hydratesCarbones100g
	 */
	public String getHydratesCarbones100g() {
		return hydratesCarbones100g;
	}
	/**
	 * @param hydratesCarbones100g the hydratesCarbones100g to set
	 */
	public void setHydratesCarbones100g(String hydratesCarbones100g) {
		this.hydratesCarbones100g = hydratesCarbones100g;
	}
	/**
	 * @return the sucres100g
	 */
	public String getSucres100g() {
		return sucres100g;
	}
	/**
	 * @param sucres100g the sucres100g to set
	 */
	public void setSucres100g(String sucres100g) {
		this.sucres100g = sucres100g;
	}
	/**
	 * @return the fibres100g
	 */
	public String getFibres100g() {
		return fibres100g;
	}
	/**
	 * @param fibres100g the fibres100g to set
	 */
	public void setFibres100g(String fibres100g) {
		this.fibres100g = fibres100g;
	}
	/**
	 * @return the proteines100g
	 */
	public String getProteines100g() {
		return proteines100g;
	}
	/**
	 * @param proteines100g the proteines100g to set
	 */
	public void setProteines100g(String proteines100g) {
		this.proteines100g = proteines100g;
	}
	/**
	 * @return the sel100g
	 */
	public String getSel100g() {
		return sel100g;
	}
	/**
	 * @param sel100g the sel100g to set
	 */
	public void setSel100g(String sel100g) {
		this.sel100g = sel100g;
	}
	/**
	 * @return the vitA100g
	 */
	public String getVitA100g() {
		return vitA100g;
	}
	/**
	 * @param vitA100g the vitA100g to set
	 */
	public void setVitA100g(String vitA100g) {
		this.vitA100g = vitA100g;
	}
	/**
	 * @return the vitD100g
	 */
	public String getVitD100g() {
		return vitD100g;
	}
	/**
	 * @param vitD100g the vitD100g to set
	 */
	public void setVitD100g(String vitD100g) {
		this.vitD100g = vitD100g;
	}
	/**
	 * @return the vitE100g
	 */
	public String getVitE100g() {
		return vitE100g;
	}
	/**
	 * @param vitE100g the vitE100g to set
	 */
	public void setVitE100g(String vitE100g) {
		this.vitE100g = vitE100g;
	}
	/**
	 * @return the vitK100g
	 */
	public String getVitK100g() {
		return vitK100g;
	}
	/**
	 * @param vitK100g the vitK100g to set
	 */
	public void setVitK100g(String vitK100g) {
		this.vitK100g = vitK100g;
	}
	/**
	 * @return the vitC100g
	 */
	public String getVitC100g() {
		return vitC100g;
	}
	/**
	 * @param vitC100g the vitC100g to set
	 */
	public void setVitC100g(String vitC100g) {
		this.vitC100g = vitC100g;
	}
	/**
	 * @return the vitB1100g
	 */
	public String getVitB1100g() {
		return vitB1100g;
	}
	/**
	 * @param vitB1100g the vitB1100g to set
	 */
	public void setVitB1100g(String vitB1100g) {
		this.vitB1100g = vitB1100g;
	}
	/**
	 * @return the vitB2100g
	 */
	public String getVitB2100g() {
		return vitB2100g;
	}
	/**
	 * @param vitB2100g the vitB2100g to set
	 */
	public void setVitB2100g(String vitB2100g) {
		this.vitB2100g = vitB2100g;
	}
	/**
	 * @return the vitPP100g
	 */
	public String getVitPP100g() {
		return vitPP100g;
	}
	/**
	 * @param vitPP100g the vitPP100g to set
	 */
	public void setVitPP100g(String vitPP100g) {
		this.vitPP100g = vitPP100g;
	}
	/**
	 * @return the vitB6100g
	 */
	public String getVitB6100g() {
		return vitB6100g;
	}
	/**
	 * @param vitB6100g the vitB6100g to set
	 */
	public void setVitB6100g(String vitB6100g) {
		this.vitB6100g = vitB6100g;
	}
	/**
	 * @return the vitB9100g
	 */
	public String getVitB9100g() {
		return vitB9100g;
	}
	/**
	 * @param vitB9100g the vitB9100g to set
	 */
	public void setVitB9100g(String vitB9100g) {
		this.vitB9100g = vitB9100g;
	}
	/**
	 * @return the vitB12100g
	 */
	public String getVitB12100g() {
		return vitB12100g;
	}
	/**
	 * @param vitB12100g the vitB12100g to set
	 */
	public void setVitB12100g(String vitB12100g) {
		this.vitB12100g = vitB12100g;
	}
	/**
	 * @return the calcium100g
	 */
	public String getCalcium100g() {
		return calcium100g;
	}
	/**
	 * @param calcium100g the calcium100g to set
	 */
	public void setCalcium100g(String calcium100g) {
		this.calcium100g = calcium100g;
	}
	/**
	 * @return the magnesium100g
	 */
	public String getMagnesium100g() {
		return magnesium100g;
	}
	/**
	 * @param magnesium100g the magnesium100g to set
	 */
	public void setMagnesium100g(String magnesium100g) {
		this.magnesium100g = magnesium100g;
	}
	/**
	 * @return the fer100g
	 */
	public String getFer100g() {
		return fer100g;
	}
	/**
	 * @param fer100g the fer100g to set
	 */
	public void setFer100g(String fer100g) {
		this.fer100g = fer100g;
	}
	/**
	 * @return the betaCarotene100g
	 */
	public String getBetaCarotene100g() {
		return betaCarotene100g;
	}
	/**
	 * @param betaCarotene100g the betaCarotene100g to set
	 */
	public void setBetaCarotene100g(String betaCarotene100g) {
		this.betaCarotene100g = betaCarotene100g;
	}
	/**
	 * @return the presenceHuilePalme
	 */
	public String getPresenceHuilePalme() {
		return presenceHuilePalme;
	}
	/**
	 * @param presenceHuilePalme the presenceHuilePalme to set
	 */
	public void setPresenceHuilePalme(String presenceHuilePalme) {
		this.presenceHuilePalme = presenceHuilePalme;
	}
	/**
	 * @return the pourcentageFruitsLegumes100g
	 */
	public String getPourcentageFruitsLegumes100g() {
		return pourcentageFruitsLegumes100g;
	}
	/**
	 * @param pourcentageFruitsLegumes100g the pourcentageFruitsLegumes100g to set
	 */
	public void setPourcentageFruitsLegumes100g(String pourcentageFruitsLegumes100g) {
		this.pourcentageFruitsLegumes100g = pourcentageFruitsLegumes100g;
	}

}
