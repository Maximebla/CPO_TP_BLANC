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
        boolean r=true;
        for (int c=0; c<6; c++){
            if (grille[7][c].presenceJeton() == false){
                r=false;
            }
        }
    return r;  
    }
    
    public void viderGrille(Joueur J1,Joueur J2){
        for (int l=0; l<6; l++){
            for (int c=0; c<7; c++){
                if (grille[l][c].presenceJeton()== true){
                    if (lireCouleurDuJeton(int l, int c) == "R"){
                        J1 ;
                    }else{
                        J2 ;
                    }
                }
            }
        }
    }
    
    public void afficherGrilleSurConsole(){
        for (int l=0; l<6; l++){
            for (int c=0; c<7; c++){
                
            } 
    }
    }
    
    public boolean presenceJeton(int x, int y){
        if(grille[x][y].presenceJeton() == true ){
            return true;
        }else{
            return false;
        }
    }
    
    public String lireCouleurDuJeton(int x,int y){
        if(grille[x][y].lireCouleurDuJeton() == "vide" ){
            return "rien";
        }else{
            if(grille[x][y].lireCouleurDuJeton() == "R" ){
                return "R";
            }else{
                return "J" ;
            }
        }
    }
    
    //public boolean etreGagnantePourCouleur(String g){
    //    if(ligneGagnantePourCouleur(g)==true || colonneGagnantePourCouleur(g) == true || diagonaleMontanteGagnantePourCouleur(g)==true || diagonaleDesencanteGagnantePourCouleur(g) == true)
    //}
    
    // faire les methodes pour les conditions de victoire
    //ligneGagnantePourCouleur(String g)
    //colonneGagnantePourCouleur(String g)
    //diagonaleMontanteGagnantePourCouleur(String g)
    //diagonaleDesencanteGagnantePourCouleur(String g)
    
    
}
