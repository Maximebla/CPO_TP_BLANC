/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_blanc;

/**
 *
 * @author User
 */
public class BouteilleBiere {
    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
nom = unNom;
degreAlcool = unDegre;
brasserie = uneBrasserie;
ouverte = false;
// prend les valeurs que l'on a mis dans le main String
}
    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;
    
    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom +" (" + degreAlcool +" degres) \nBrasserie : " + brasserie ) ;
    // Prépare une étiquette type que l'on executera dans le main String si l'on le souhaite
}
public void Décapsuler() {
    if (ouverte == false){
        ouverte = true;
    }else{
        System.out.print("erreur : biere déjà ouverte");
    // regarde si la bière a été décapsuler si pas encore fais alors on décapsule sinon on affiche qu'elle est deja ouverte
    }
}
public String toString() {
    String chaine_a_retourner;
    chaine_a_retourner = nom + " (" + degreAlcool + " degrés)Ouverte ? ";
if (ouverte == true ) chaine_a_retourner += "oui" ;
else chaine_a_retourner += "non" ;
return chaine_a_retourner ;
}    
}


