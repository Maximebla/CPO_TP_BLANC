/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_blanc;

/**
 *
 * @author User
 */
public class Personne {
    public Personne(String nom,String prenom) {
    nom1=nom;
    prenom1=prenom;        
    }
    String nom1;
    String prenom1;
    @Override
    public String toString () {
        return ("Le nom de la personne est " + nom1 + " et son prenom est " + prenom1);
    }
}