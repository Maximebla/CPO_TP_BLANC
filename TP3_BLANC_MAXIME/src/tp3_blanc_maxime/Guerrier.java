/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_blanc_maxime;

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
    }

    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }

    
    @Override
    public String toString() {
        return "Guerrier du nom de " +nom+ " a un niveau de vie de " + nvie + ". est-il a cheval: " + b + '.';
    }
    
    
}
