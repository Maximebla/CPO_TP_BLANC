/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_blanc_maxime;

/**
 *
 * @author User
 */
public class TP3_BLANC_MAXIME {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arme m = new Arme ("arme standard", 4);
        int UnnvAtta = m.getNvAtta();
        System.out.println("l'arme s'appelle " + m.nom + " et a une attaque de " + UnnvAtta + ".");
        
    }
    
}
