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
        // donne le nombre de calories pour la première assietes en passant par la classe tartiflettes
        
        Tartiflette assiette3 = assiette2 ;
        //  donne le même nombre de calories a l'assiette 3 que l'assiette 2
        
        // 2 assiettes crées et l'assiette3 vaut la même tartiflette que l'assiette2
        System.out.println("nb de calories de Assiette 2 : " +assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " +assiette3.nbCalories) ;
        // affiche le nombre de calories de chaque assiettes
        
        assiette2=assiette1;
        assiette1=assiette3;
        // echange les calories de l'assiette 2 et de l'assiette 1
        
        
        //Moussaka assiette666 = assiette1 ;
        //Moussaka assiette667 = new Tartiflette() ;
        // Aucune n'est correct
        // une référence objet qui annonce référencer un type d’objet peut-elle en référencer un autre qui n’a aucun rapport ?
        // Non
        
        //Moussaka assiette1O = new Moussaka(100) ;
        //Moussaka assiette11 = new Moussaka(200) ;
        //Moussaka assiette12 = new Moussaka(300) ;
        //Moussaka assiette13 = new Moussaka(400) ;
        //Moussaka assiette14 = new Moussaka(500) ;
        //Moussaka assiette15 = new Moussaka(600) ;
        //Moussaka assiette16 = new Moussaka(700) ;
        //Moussaka assiette17 = new Moussaka(800) ;
        //Moussaka assiette18 = new Moussaka(900) ;
        //Moussaka assiette19 = new Moussaka(1000) ;
        
        Moussaka [] tabEntiers = new Moussaka[10]; 
        // creer un tableau de 10 qui est d'une classe moussaka
        
        for (int i=0; i < 10; i++) {
            tabEntiers [i] = new Moussaka(100+i) ;
        }
        // met des calories dans le tableau en passant par la class moussaka
    }
        
}
