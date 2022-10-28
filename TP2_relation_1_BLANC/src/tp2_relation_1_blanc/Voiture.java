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
    }
    String modele1;
    String Marque1;
    int PuissanceCV1;
    @Override
    public String toString () {
        return ("Voiture de modele " + modele1 + " de marque " + Marque1 + " et de Puissance en CV de " + PuissanceCV1);
    }
}
