/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_blanc._buatois;

/**
 *
 * @author User
 */
public class PlateauDeJeu {
    CelluleDeGrille [][] grille = new CelluleDeGrille [6][7];
    
    public void PlateauDeJeu(){
        for (int l=0; l<6; l++){
            for (int c=0; c<7; c++){
                grille[l][c] = new CelluleDeGrille();
            }
        }
    }
    
    public int ajouterJetonDansColonne(Jeton J, int c){
        int a=- 1;
        for (int l=0; l<7; l++){
            if ( grille[l][c].presenceJeton() == false){
                grille[l][c].affecterJeton(J);
                a = l;
            }   
        }  
    return a;
    }
    
    public boolean grilleRemplie(){
        boolean r=false;
        for (int c=0; c<6; c++){
            if (grille[7][c].presenceJeton() == true){
                r=true;
            }
        }
    return r;  
    }
    
    public viderGrille(Joueur ;Joueur){
        
    }
    
    public afficherGrilleSurConsole(){
        
    }
    
    public presenceJeton(int x, int y){
        
    }
    
    public ireCouleurDuJeton(int x,int y){
        
    }
    
    public etreGagnantePourCouleur(String){
        
    }
    
    public tasserLigne(int){
        
    }
    
    public colonneRemplie(){
        
    }
    
    public placerTrouNoir(){
        
    }
}
