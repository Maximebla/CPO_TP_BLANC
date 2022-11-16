/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

import Arme.Batton;



/**
 *
 * @author User
 */
public class Magicien extends Personnage{
    private boolean confirme;
    String a="";
    public Magicien(boolean confirme, String Unnom, int Unnvie) {
        super(Unnom, Unnvie);
        this.confirme = confirme;
        if (confirme == true){
            a="confirme";
        }else{
            a= "debutant";
        }
        // on reprend les variables du personnage et on regard si le personnage est débutant ou confirmé
    }

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }
    
    public void armepref (){
        int cpt=0;
        for (int i=0; i<tabArme1.size(); i++){
            if (tabArme1.get(i) instanceof Batton){
                System.out.println(tabArme1.get(i)+ " est une arme preferer");
                cpt=cpt+1;
            }
        }
    System.out.println("le magicien a " +cpt+ " arme preferer");
    }
    // regard si c'est l'arme de prédilection du magiceien et les comptes pour savoir combien il y en a.

    @Override
    public String toString() {
        return "Magicien de nom de " +nom+ "qui a un niveau de vie de "+ nvie + " est de un magicien de niveau " + a ;
    }
    // on affiche les caractéristiques du magicien    
}
