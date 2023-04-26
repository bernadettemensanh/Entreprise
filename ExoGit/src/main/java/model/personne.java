package model;

public class personne {

	private String prenom;
	private String nom;
	
	
	public personne(String prenom, String nom) {
		this.prenom = prenom;
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	@Override
	public String toString() {
		return "personne [prenom=" + prenom + ", nom=" + nom + "]";
	}
	
	
	
}
