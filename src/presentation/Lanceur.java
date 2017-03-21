package presentation;

import java.util.Scanner;

import metier.Personne;
import service.PersonneService;
/**
 * Classe de d�marrage de l'application
 * @author Stagiaire
 * @version 1.0
 */
public class Lanceur {
	/**
	 * La m�thode main est charg�e en m�moire au d�marrage de l'application 
	 * et peut �tre utilis�e avant la cr�ation de tout objet
	 * @param args arguments de la m�thode main
	 */
	public static void main(String[] args) {
		// declaration de la couche service
		PersonneService ps = new PersonneService();
		
		// creation d'un objet Personne avec le keyword new
		Personne p = new Personne();
		Personne p2 = new Personne("Doe", "Jane", 20);
		Personne p3 = new Personne("Coppola", "Francis");
		
		// valorisation des attributs
		p.setNom("Smith");
		p.setPrenom("John");
		p.setAge(35);
		p3.setAge(77);
		
		// affichage des attributs
		System.out.println(p);
		System.out.println("--------------------------------");
		System.out.println(p2);
		System.out.println("--------------------------------");
		System.out.println(p3);
		System.out.println("--------------------------------");
		
		System.out.println("--------------------------------");
		System.out.println(ps.marcher(p));
		System.out.println("--------------------------------");
		System.out.println(ps.arreter(p));
		System.out.println("--------------------------------");
		
		// Test de la classe Scanner
		
		// creer objet Scanner
		Scanner clavier = new Scanner(System.in);
	    // demander le nom
			System.out.println("Saisir le nom :");
		
		// recuperer le nom
			String leNom = clavier.next();
	    
		// demander le prenom
		System.out.println("Saisir le pr�nom :");
		
		// recuperer le prenom
		String lePrenom = clavier.next();
	    
		// demander l'age
		System.out.println("Saisir l'age :");
		
		// recuperer l'age
		int lAge = clavier.nextInt();
		
		// Cr�er l'objet Personne
		Personne p4 = new Personne(leNom, lePrenom, lAge);
		
		// Afficher la personne p4
		System.out.println("--------------------------------");
		System.out.println(p4);
		
		// Ferme le buffer de Scanner
		clavier.close();
	}
}
