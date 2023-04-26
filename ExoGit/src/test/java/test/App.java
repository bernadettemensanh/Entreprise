package test;

import java.util.ArrayList;
import java.util.List;

import model.entreprise;
import model.personne;

public class App {

	
	
	public static void main(String[] args) {
		
 personne P1 = new personne ( "Jane", "toto");
 personne P2 = new personne ( "Jone", "titi");
 
 List<personne> listePersonne = new ArrayList<>();
 listePersonne.add(P1);
 listePersonne.add(P2);
 entreprise E1 = new entreprise ("Sopra", listePersonne);

 System.out.println(E1);
 
	}

}
