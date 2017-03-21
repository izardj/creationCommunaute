package metier;
/**
 * Classe Personne qui sert � 
 * d�finir une personne
 * @author Stagiaire
 * @version 1.0
 */
public class Personne {
	
	private String nom;
	private String prenom;
	private int age;
	/**
	 * Premi�re m�thode constructeur Personne
	 * @param nom Nom de la personne
	 * @param prenom Pr�nom de la personne
	 * @param age Age de la personne
	 */
	public Personne(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	/**
	 * Deuxi�me m�thode constructeur Personne
	 * @param nom Nom de la personne
	 * @param prenom Pr�nom de la personne
	 */
	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	/**
	 * Troisi�me m�thode constructeur Personne
	 */
	public Personne() {
		super();
	}
	/**
	 * Getter de l'attribut Nom
	 * @return Nom de la personne
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * Setter de l'attribut Nom
	 * @param nom Nom de la personne
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * Getter de l'attribut Prenom
	 * @return Pr�nom de la personne
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * Setter de l'attribut Prenom
	 * @param prenom Pr�nom de la personne
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * Getter de l'attribut Age
	 * @return Age de la personne
	 */
	public int getAge() {
		return age;
	}
	/**
	 * Setter de l'attribut Age
	 * @param age age de la personne
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * M�thode d'affichage de la Personne
	 * @return attributs de la personne
	 */
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	
	
}
