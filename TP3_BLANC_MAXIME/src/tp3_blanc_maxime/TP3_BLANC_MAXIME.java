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
        
        Magicien M3 = new Magicien (true,"Agazul",55);
        Guerrier G3 = new Guerrier(true,"Dartanian", 18);
        Batton B3 = new Batton("cedre", 6, 4);
        Batton B4 = new Batton("olivier", 2, 2);
        Batton B5 = new Batton("platane", 7, 10);
        Epée E3 = new Epée ( "Bar",5,10);
        Epée E4 = new Epée ( "Goule",6,8);
        Epée E5 = new Epée ( "Legrand",3,7);
        
        G3.ajouterarme(E3);
        G3.ajouterarme(E4);
        G3.ajouterarme(B5);
        G3.methodearme(E3);
        // on met dans l'inventaire du guerrier ces trois armes et La première epe dans sa main
        
        // pareil pour le magicien
        M3.ajouterarme(E5);
        M3.ajouterarme(B3);
        M3.ajouterarme(B4);
        M3.methodearme(B3);
        
    }  
}
