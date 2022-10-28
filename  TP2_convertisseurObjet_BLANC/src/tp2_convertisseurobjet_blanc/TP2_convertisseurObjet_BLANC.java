/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_blanc;

import java.util.Scanner;

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
        convertisseur temp3 = new convertisseur();
        convertisseur temp4 = new convertisseur();
        convertisseur temp5 = new convertisseur();
        convertisseur temp6 = new convertisseur();
        
        double temp = 1.0;
        // temp1.FarenheitVersCelcius(temp);
        // temp2.CelciusVersKelvin(temp);
        
        // System.out.println(temp1);
        // System.out.println(temp2);
        
        System.out.println("Quelles convertions voulez-vous faire? ");
        System.out.println("1- CelciusVersKelvin ");
        System.out.println("2- KelvinVersCelcius ");
        System.out.println("3- FarenheitVersCelcius ");
        System.out.println("4- CelciusVersFarenheit ");
        System.out.println("5- KelvinVersFarenheit ");
        System.out.println("6- FarenheitVersKelvin ");
        // demande a l'utilisateur de choisir sa conversion qu'il soit faire 
        
        Scanner sc=new Scanner(System.in);
        int choix =sc.nextInt();
        // scan la réponse de l'utilisateur et la met dans la variable Choix
        
        if (choix == 1){
            temp1.CelciusVersKelvin(temp);
            System.out.println(temp1);
        }
         if (choix == 2){
            temp2.KelvinVersCelcius(temp);
            System.out.println(temp2);
        }
          if (choix == 3){
            temp3.FarenheitVersCelcius(temp);
            System.out.println( temp3);
        }
         if (choix == 4){
            temp4.CelciusVersFarenheit(temp);
            System.out.println(temp4);
        }
         if (choix == 5){
            temp5.KelvinVersFarenheit(temp);
            System.out.println(temp5);
        }
         if (choix == 6){
            temp6.FarenheitVersKelvin(temp);
            System.out.println( temp6);
            
        // regarde quelle choix l'utilisateur a fait et va faire les convertions
        // Elle va en même temps comptés le nombre de converstions puis renvoyé se nombre
        }
        
    }
    
}
