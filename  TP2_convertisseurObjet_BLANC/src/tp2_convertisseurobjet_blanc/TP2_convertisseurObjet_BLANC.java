/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_blanc;

/**
 *
 * @author User
 */
public class TP2_convertisseurObjet_BLANC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        convertisseur temp1 = new convertisseur();
        convertisseur temp2 = new convertisseur();
        double temp = 1.0;
        temp1.FarenheitVersCelcius(temp);
        temp2.CelciusVersKelvin(temp);
        
        System.out.println();
    }
    
}
