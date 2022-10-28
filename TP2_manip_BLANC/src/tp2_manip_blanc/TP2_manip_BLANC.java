/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_blanc;

/**
 *
 * @author User
 */
public class TP2_manip_BLANC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        
        Tartiflette assiette3 = assiette2 ;
        
        // 2 assiettes crées et l'assiette3 vaut la même tartiflette que l'assiette2
        System.out.println("nb de calories de Assiette 2 : " +assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " +assiette3.nbCalories) ;
        
        assiette2=assiette1;
        assiette1=assiette3;
        
        
        //Moussaka assiette666 = assiette1 ;
        //Moussaka assiette667 = new Tartiflette() ;
        // Aucune n'est correct
        // une référence objet qui annonce référencer un type d’objet peut-elle en référencer un autre qui n’a aucun rapport ?
        // Non
        
    }
        
}
