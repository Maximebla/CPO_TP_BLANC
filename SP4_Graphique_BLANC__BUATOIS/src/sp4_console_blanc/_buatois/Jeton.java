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
    String Couleur;
    
    /** donne la couleur a l'objet Jeton avec la variable couleur
     *
     * @param couleur
     */
    public Jeton (String couleur){
        Couleur=couleur;
    }

    /**regarde la couleur et la renvoie
     *
     * @return
     */
    public String lireCouleur() {
        return Couleur;
    }
    
    /** renvoie J ou R pour connaitre la couleur du jeton
     *
     * @return
     */
    @Override
    public String toString() {
        String Couleur1;
        if (Couleur == "jaune"){
            Couleur1="J";
        }else{
            Couleur1="R";
        }
        return "Jeton{" + "Couleur=" + Couleur1 + '}';
    }
    
}
