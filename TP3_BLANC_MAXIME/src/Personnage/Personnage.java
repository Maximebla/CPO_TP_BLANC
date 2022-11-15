/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

import Arme.Arme;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class Personnage {
    String nom;
    protected int nvie;
    ArrayList<Arme> tabArme1 = new ArrayList<Arme>(5);
    Arme arme_en_main=null;
    // créer un tableau dynamique 
    
    public void ajouterarme (Arme arme){
        if(tabArme1.size()<5){
            tabArme1.add(arme);
        }
    }
    //on ajoute s'il reste de la place l'arme dans son inventaire
    
    public Arme getArme_en_main(){
        return arme_en_main;
    }
    
    public void methodearme(Arme arme){
        for(int i=0; i<5;i++){
            if(tabArme1.get(i)==arme){
                System.out.println("l'arme est dans votre mains");
                arme_en_main = tabArme1.get(i);
                break;
            }else{
                System.out.println("vous n'avez pas cette arme");
            }
            // on regard s'il l'arme existe si oui on la met dans la main sinon on garde la précédente
        }
    }
    
    public Personnage(String Unnom,int Unnvie) {
        nom=Unnom;
        
        if ( Unnvie >0 &&  Unnvie <100){
            nvie=Unnvie;
        }if ( Unnvie >100){
            nvie=100;
        }if (Unnvie<0){
            nvie = 1;
        }
        // on définie les caractéristiques du personnage
    }

    public int getNvie() {
        return nvie;
    }

    public void setNvie(int nvie) {
        if ( nvie >0 &&  nvie <100){
        this.nvie = nvie;
        }
    }

    
    @Override
    public String toString() {
        return "le personnage s'appelle " + nom + "et a un niveau de vie de " + nvie + "le personnage posséde une arme"+ arme_en_main+"."; 
    }    
    // affiche les caratéristiques du personnages
}
