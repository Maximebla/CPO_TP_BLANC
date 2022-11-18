/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_blanc._buatois;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Joueur {
    private String nom;
    Joueur Couleur;
    ArrayList<Jeton> reserveJetons = new ArrayList<Jeton>();
    int nombreJetonsRestants = reserveJetons.size();
    int nombreDesintegrateurs;

    public Joueur(String nom) {
        this.nom = nom;
    }

    public void affecterCouleur(Joueur Couleur) {
        this.Couleur = Couleur;
    }
    
    public void AjouterJeton(Jeton J){
        reserveJetons.add(J);
    }
    
    public void obtenirDesintegrateur(){
        nombreDesintegrateurs += 1;
    }
    
    public boolean utiliserDesintegrateur(){
        if (nombreDesintegrateurs ==0){
            return true;
        }
        else{
            nombreDesintegrateurs -= 1;
            return false;
        }
        
    }
}
