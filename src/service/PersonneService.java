package service;

import metier.Personne;

/**
 * 
 * @author Stagiaire
 *
 */
public class PersonneService {
	public String marcher(Personne p) {
		return p.getNom() + " MARCHE";
	}
	
	public String arreter(Personne p) {
		return p.getNom() + " S'ARRETE";
	}
}
