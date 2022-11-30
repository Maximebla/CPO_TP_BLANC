/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_blanc._buatois;

import java.util.Scanner;
import sp4_console_blanc._buatois.Jeton;
import sp4_console_blanc._buatois.Joueur;
import sp4_console_blanc._buatois.PlateauDeJeu;
import sp4_console_blanc._buatois.CelluleDeGrille;

/**
 *
 * @author User
 */
public class Partie {
    private Joueur [] listeJoueurs = new Joueur[2];
    private Joueur joueurCourant;
    private PlateauDeJeu plateau;

    public Partie(Joueur J1, Joueur J2) {
        listeJoueurs[0]=J1;
        listeJoueurs[1]=J2;
    }
    
    public void attribuerCouleurAuxJoueurs(){
        int a = (int) (Math.random()*(2));
           if (a==1){
               listeJoueurs[0].affecterCouleur("jaune");
               listeJoueurs[1].affecterCouleur("rouge");
           }else{
               listeJoueurs[0].affecterCouleur("rouge");
               listeJoueurs[1].affecterCouleur("jaune");
           }
    }
    
    public void creerEtAffecterJeton(Joueur J){
        if ("rouge".equals(J.getCouleur())){
            for (int i=0; i<30; i++){
                Jeton JT = new Jeton("rouge");
                J.AjouterJeton(JT);
            }
        }else{
            for (int i=0; i<30; i++){
                Jeton JT = new Jeton("jaune");
                J.AjouterJeton(JT);
            }
        }
        
    }
    
    public placerTrousNoirsEtDesintegrateurs(){
        
    }
}
