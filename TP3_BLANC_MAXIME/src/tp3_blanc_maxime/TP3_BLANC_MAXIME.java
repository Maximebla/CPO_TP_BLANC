package tp3_blanc_maxime;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import Personnage.*;
import Arme.Epée;
import Arme.Batton;
import Arme.Arme;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class TP3_BLANC_MAXIME {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Arme m = new Arme ("arme standard", 4);
        //m.setNvAtta(-30);
        //int UnnvAtta = m.getNvAtta();
        //System.out.println("l'arme s'appelle " + m.nom + " et a une attaque de " + UnnvAtta + ".");
        
        Epée E1 = new Epée ("Excalibur",7,5);
        System.out.println(E1);
        Epée E2 = new Epée ( "Durandal",4,7);
        System.out.println(E2);
        Batton B1 = new Batton("Chêne", 4, 5);
        System.out.println(B1);
        Batton B2 = new Batton( "Charme", 5, 6);
        System.out.println(B2);
        // on créer un nouvelle objet pour la classe épée ou batton  
        
        ArrayList<Arme> tabArme = new ArrayList<Arme>();
        //création d'un tableau dynamique
        
        tabArme.add(E1);
        tabArme.add(E2);
        tabArme.add(B1);
        tabArme.add(B2);
        // ajout des objets dans le tableau dynamique
        
        int a= tabArme.size();
        for (int i=0; i<a; i++){
            System.out.println(" Voici les caracterisitques de l'arme: "+tabArme.get(i));
        }
        // affiche les caratéristiques en allant cherché les données objets dans le tableau
        // pareil pour le magicien et le guerrier
        
        Magicien h;
        
        Magicien M1 = new Magicien (true,"Gandalf",65);
        System.out.println(M1);
        Magicien M2 = new Magicien ( false,"Garcimore",41);
        System.out.println(M2);
        Guerrier G1 = new Guerrier(false,"Conan", 78);
        System.out.println(G1);
        Guerrier G2 = new Guerrier( true,"Lannister", 45);
        System.out.println(G2);
        
        ArrayList<Personnage> tabpersonnage = new ArrayList<Personnage>();
        
        tabpersonnage.add(M1);
        tabpersonnage.add(M2);
        tabpersonnage.add(G1);
        tabpersonnage.add(G2);
        
        int c = tabpersonnage.size();
        for (int i=0; i<c; i++){
            System.out.println(" Voici les caracterisitques du personnage: "+tabpersonnage.get(i));
        }
    }  
}
