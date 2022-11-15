/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arme;

/**
 *
 * @author User
 */
public class Arme {
    String nom;
    private int nvAtta;
    
    public Arme(String Unnom,int UnnvAtta) {
        nom=Unnom;
        
        if ( UnnvAtta >0 &&  UnnvAtta <100){
            nvAtta=UnnvAtta;
        }if ( UnnvAtta >100){
            nvAtta=100;
        }if (UnnvAtta<0){
            nvAtta = 1;
        }
        
    }

    public int getNvAtta() {
        return nvAtta;
    }

    public void setNvAtta(int nvAtta) {
        if ( nvAtta >0 &&  nvAtta <100){
        this.nvAtta = nvAtta;
        }
    }

    @Override
    public String toString() {
        return "l'arme s'appelle " + nom + "et a une attaque de " + nvAtta + "."; 
    }    
}
