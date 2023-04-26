package model;

import java.util.ArrayList;
import java.util.List;



public class entreprise {

	private String nomEntreprise;
	private List<personne> personnes= new ArrayList();
	
	public entreprise(String nomEntreprise, List<personne> personnes) {
		this.nomEntreprise = nomEntreprise;
		this.personnes = personnes;
	}
	

	public String getNomEntreprise() {
		return nomEntreprise;
	}

	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}

	public List<personne> getPersonnes() {
		return personnes;
	}

	public void setPersonnes(List<personne> personnes) {
		this.personnes = personnes;
	}

	
	public String toString() {
		return "entreprise [nomEntreprise=" + nomEntreprise + ", personnes=" + personnes + "]";
	} 
	

}
