/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sp4_console_blanc._buatois;

/**
 *
 * @author User
 */
public class SP4_console_BLANC_BUATOIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Joueur Joseph = new Joueur("Joseph"); 
       Joueur Martine = new Joueur("Martine"); 
       Partie partie1 = new Partie(Joseph,Martine);
       partie1.initialiserPartie();
       partie1.lancerPartie();
    }
    
}
