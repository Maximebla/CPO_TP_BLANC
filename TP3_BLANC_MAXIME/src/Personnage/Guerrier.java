/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;


/**
 *
 * @author User
 */
public class Guerrier extends Personnage{
    private boolean cheval;
    String b ="";
    
    public Guerrier(boolean cheval, String Unnom, int Unnvie) {
        super(Unnom, Unnvie);
        if (cheval == true){
            b="Oui";
        }else{
            b="non";
        }
        this.cheval=cheval;
        // prend les variables de personnage et regard aussi si le ersonnage a un cheval ou pas
    }

    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }

    
    @Override
    public String toString() {
        return "Guerrier du nom de " +nom+ " a un niveau de vie de " + nvie + ". est-il a cheval: " + b + '.';
    }
    // affiche tous ce que l'on connait sur le guerrier
}
