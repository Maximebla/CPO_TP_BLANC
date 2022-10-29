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
    nbVoitures=0;
    liste_voitures = new Voiture [3];
    }
    // initialise le nom, prenom d'une personne
    String nom1;
    String prenom1;
    int nbVoitures ;
    Voiture [] liste_voitures ;
    Personne Proprietaire;
    
    @Override
    public String toString () {
        return ("Le nom de la personne est " + nom1 + " et son prenom est " + prenom1);
    }
    // renvoie un message type avec le nom et le prenom de la personne 
    
    public boolean ajouter_voiture( Voiture voiture_a_ajouter) {
        if (Proprietaire != null || nbVoitures >= 3 ){
            return false;
        }else {
            Proprietaire.liste_voitures[nbVoitures] = voiture_a_ajouter ;
            Proprietaire.nbVoitures = nbVoitures+1 ;
            voiture_a_ajouter.Proprietaire = this ;
            return true;
        }
    // regarde si la voiture n'appartient pas déjà a une personne ou si cette personne ne possède pas déjà trois voitures nombre limite
    // autrement va ajouté la voiture dans la liste de voture de cette personne
    }
}
