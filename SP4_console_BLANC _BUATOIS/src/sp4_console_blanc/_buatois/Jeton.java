/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_blanc._buatois;

/**
 *
 * @author User
 */
public class Jeton {
    private String Couleur;
    
    public void Jeton (String couleur){
        Couleur=couleur;
    }
    
    public String lireCouleur(){
        return Couleur;
    }

    @Override
    public String toString() {
        String Couleur1;
        if (Couleur == "Jaune"){
            Couleur1="J";
        }else{
            Couleur1="R";
        }
        return "Jeton{" + "Couleur=" + Couleur1 + '}';
    }
    
}
