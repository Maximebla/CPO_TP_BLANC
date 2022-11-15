/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_blanc_maxime;

/**
 *
 * @author User
 */
public class Personnage {
    String nom;
    private int nvie;
    
    public Personnage(String Unnom,int Unnvie) {
        nom=Unnom;
        
        if ( Unnvie >0 &&  Unnvie <100){
            nvie=Unnvie;
        }if ( Unnvie >100){
            nvie=100;
        }if (Unnvie<0){
            nvie = 1;
        }
        
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
        return "le personnage s'appelle " + nom + "et a un niveau de vie de " + nvie + "."; 
    }    
}
