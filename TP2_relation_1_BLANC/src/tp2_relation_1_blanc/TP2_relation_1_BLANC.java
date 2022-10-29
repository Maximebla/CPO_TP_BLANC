/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_blanc;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class TP2_relation_1_BLANC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        
        System.out.println("liste des voitures disponibles \n"+ uneClio +"\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
        
        bob.liste_voitures[0] = uneClio ;
        bob.liste_voitures[1] = uneAutreClio ;
        bob.nbVoitures = 2 ;
        uneClio.Proprietaire = bob ;
        uneAutreClio.Proprietaire = bob ;
        
        System.out.println("la premiere voiture de Bob est " +bob.liste_voitures[0] ) ;
        System.out.println("la deuxième voiture de Bob est " +bob.liste_voitures[1] ) ;
        
        
        reno.liste_voitures[0] = une2008 ;
        reno.liste_voitures[1] = uneMicra ;
        reno.nbVoitures = 2 ;
        une2008.Proprietaire = reno ;
        uneMicra.Proprietaire = reno ;
        
        System.out.println("la premiere voiture de reno est " +reno.liste_voitures[0] ) ;
        System.out.println("la deuxième voiture de reno est " +reno.liste_voitures[1] ) ;
        
        Voiture uneFiat = new Voiture ("Panda", "Fiat", 4);
        //bob.ajouter_voiture(uneFiat);
        System.out.println(bob.ajouter_voiture(uneFiat));
    }
    
}
