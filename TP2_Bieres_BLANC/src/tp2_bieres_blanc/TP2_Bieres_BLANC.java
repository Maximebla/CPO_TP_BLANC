/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_blanc;

/**
 *
 * @author User
 */
public class TP2_Bieres_BLANC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",7.0,"Dubuisson") ;
        uneBiere.ouverte = false;
        uneBiere.lireEtiquette();
        
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6,"Abbaye de Leffe") ;
        autreBiere.ouverte = false;
        autreBiere.lireEtiquette();
        
        BouteilleBiere DeuxBiere = new BouteilleBiere("heineken", 5.0,"abbaye de heineken") ;
        DeuxBiere.ouverte = false;
        DeuxBiere.lireEtiquette();
        
        BouteilleBiere TroisBiere = new BouteilleBiere("corona", 4.5,"La Corneille") ;
        TroisBiere.ouverte = false;
        TroisBiere.lireEtiquette();
        
        BouteilleBiere QuatreBiere = new BouteilleBiere("Jupiler", 7.0,"Piva") ;
        QuatreBiere.ouverte = false;
        QuatreBiere.lireEtiquette();
    }
    
}
