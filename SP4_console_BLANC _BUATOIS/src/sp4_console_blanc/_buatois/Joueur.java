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
    String Couleur;
    ArrayList<Jeton> reserveJetons = new ArrayList<Jeton>();
    int nombreJetonsRestants = reserveJetons.size();
    int nombreDesintegrateurs;

    /**initialise le nom du joueur
     *
     * @param nom
     */
    public Joueur(String nom) {
        this.nom = nom;
    }

    /**affecte la couleur a un joueur (equipe jaune ou rouge)
     *
     * @param Couleur
     */
    public void affecterCouleur(String Couleur) {
        this.Couleur = Couleur;
    }

    public String getCouleur() {
        return Couleur;
    }
    
        
    /**ajoute un jeton a la reserve de jeton du joueur
     *
     * @param J
     */
    public void AjouterJeton(Jeton JT){
        System.out.println("avant : "+JT.lireCouleur());
        reserveJetons.add(JT);
        System.out.println("reserve : "+reserveJetons.get(0).lireCouleur());
    }
    
    /** compteur de desintegrateur 
     * ajout 1 a ce compteur
     */
    public void obtenirDesintegrateur(){
        nombreDesintegrateurs += 1;
    }
    
    /**regard si le joueur peut a des desintegrateur 
     *pour pouvoir les joués
     * @return boolean
     */
    public boolean utiliserDesintegrateur(){
        if (nombreDesintegrateurs ==0){
            return true;
        }
        else{
            nombreDesintegrateurs -= 1;
            return false;
        }      
    }
    
    public Jeton jouerJeton(){
        Jeton J;
        int index=0;
        J = reserveJetons.get(0);
        reserveJetons.remove(0);
        return J;
    }
}
