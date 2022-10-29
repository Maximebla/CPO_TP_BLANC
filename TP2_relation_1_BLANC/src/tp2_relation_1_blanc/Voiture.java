/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_blanc;

/**
 *
 * @author User
 */
public class Voiture {
    
    public Voiture(String modele,String Marque,int PuissanceCV) {
    modele1=modele;
    Marque1=Marque;
    PuissanceCV1=PuissanceCV;
    Proprietaire=null;
    }
    // créer une classe Voiture avec pour attribut modele,marque,puissance et un propiètaire de la classe personne
    
    String modele1;
    String Marque1;
    int PuissanceCV1;
    Personne Proprietaire ;
    
    @Override
    public String toString () {
        return ("Voiture de modele " + modele1 + " de marque " + Marque1 + " et de Puissance en CV de " + PuissanceCV1);
    }
    // renvoire une phrase type pour donné le modéle, la marque et la puissance d'une voiture
}
