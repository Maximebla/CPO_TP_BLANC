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
        
        System.out.println("combien aez-vous de voitures");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Voiture [] liste_voitures = new Voiture[]; 
        
        for (int i=0; i < 3; i++) {
            tabEntiers [i] = new Voiture(i) ;
        }
        System.out.println("liste des voitures disponibles "+ uneClio +"\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
    }
    
}
