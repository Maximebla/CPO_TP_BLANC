/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_blanc_maxime;

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
    }

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }

    @Override
    public String toString() {
        return "Magicien de nom de " +nom+ "qui a un niveau de vie de "+ nvie + " est de un magicien de niveau " + a ;
    }
    
    
    
}
