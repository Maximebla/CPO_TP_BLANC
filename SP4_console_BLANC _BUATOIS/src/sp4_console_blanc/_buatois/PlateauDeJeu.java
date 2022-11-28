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
        for (int l=0; l<5; l++){
            for (int c=0; c<6; c++){
                grille[l][c] = new CelluleDeGrille();
            }
        }
    }
    
    public int ajouterJetonDansColonne(Jeton J, int c){
        int a=- 1;
        for (int l=0; l<6; l++){
            if ( grille[l][c].presenceJeton() == false){
                grille[l][c].affecterJeton(J);
                a = l;
            }   
        }  
    return a;
    }
    
    public boolean grilleRemplie(){
        boolean r=true;
        for (int c=0; c<5; c++){
            if (grille[6][c].presenceJeton() == false){
                r=false;
            }
        }
    return r;  
    }
    
    //public void viderGrille(Joueur J1,Joueur J2){
        //for (int l=0; l<5; l++){
            //for (int c=0; c<6; c++){
                //if (grille[l][c].presenceJeton()== true){
                    //if (lireCouleurDuJeton(int l, int c) == "R"){
                   //     J1 ;
                   // }else{
                   //     J2 ;
                   // }
                //}
           //}
       // }
    //}
    
    public void afficherGrilleSurConsole(){
        for (int i=5; i>-1; i--){
            for ()
            System.out.println (toString()+ " ");
        }
    }
    
    public boolean presenceJeton(int x, int y){
        return grille[x][y].presenceJeton() == true;
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
    
    public boolean etreGagnantePourCouleur(String g){
        if(ligneGagnantePourCouleur(g)==true || colonneGagnantePourCouleur(g) == true || diagonaleMontanteGagnantePourCouleur(g)==true || diagonaleDesencanteGagnantePourCouleur(g) == true){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean ligneGagnantePourCouleur(String c) {
        boolean t = false;
        int gagner =1;
        for (int l=0; l<2; l++){
            for (int i=0; i<6; i++){
                if (grille[l][i].presenceJeton()== true){               }
                    if (grille[l][i].lireCouleurDuJeton().equals(c)){
                        if (grille[l+1][i].lireCouleurDuJeton().equals(c)){
                            if (grille[l+2][i].lireCouleurDuJeton().equals(c)){ 
                                if (grille[l+3][i].lireCouleurDuJeton().equals(c)){
                                    gagner =0;
                                }    
                            }
                        }        
                    }
                }
                if (gagner == 1){
                    t = true;
                    break;
            }
        }
        return t;
    }
    

    public boolean colonneGagnantePourCouleur(String c) {
        boolean t = false;
        int gagner =1;
        for (int l=0; l<5; l++){
            for (int i=0; i<3; i++){
                if (grille[l][i].presenceJeton()== true){               }
                    if (grille[l][i].lireCouleurDuJeton().equals(c)){
                        if (grille[l][i+1].lireCouleurDuJeton().equals(c)){
                            if (grille[l][i+2].lireCouleurDuJeton().equals(c)){ 
                                if (grille[l][i+3].lireCouleurDuJeton().equals(c)){
                                    gagner =0;
                                }    
                            }
                        }        
                    }
                }
                if (gagner == 1){
                    t = true;
                    break;
            }
        }
        return t;
    }
    
    public boolean diagonaleMontanteGagnantePourCouleur(String c) {
        boolean t = false;
        int gagner =1;
        for (int l=0; l<2; l++){
            for (int i=0; i<3; i++){
                if (grille[l][i].presenceJeton()== true){               }
                    if (grille[l][i].lireCouleurDuJeton().equals(c)){
                        if (grille[l+1][i+1].lireCouleurDuJeton().equals(c)){
                            if (grille[l+2][i+2].lireCouleurDuJeton().equals(c)){ 
                                if (grille[l+3][i+3].lireCouleurDuJeton().equals(c)){
                                    gagner =0;
                                }    
                            }
                        }        
                    }
                }
                if (gagner == 1){
                    t = true;
                    break;
            }
        }
        return t;
    }
    
    
    public boolean diagonaleDesencanteGagnantePourCouleur(String c) {
        boolean t = false;
        int gagner =1;
        for (int l=0; l<2; l++){
            for (int i=3; i<6; i++){
                if (grille[l][i].presenceJeton()== true){               }
                    if (grille[l][i].lireCouleurDuJeton().equals(c)){
                        if (grille[l-1][i-1].lireCouleurDuJeton().equals(c)){
                            if (grille[l-2][i-2].lireCouleurDuJeton().equals(c)){ 
                                if (grille[l-3][i-3].lireCouleurDuJeton().equals(c)){
                                    gagner =0;
                                }    
                            }
                        }        
                    }
                }
                if (gagner == 1){
                    t = true;
                    break;
            }
        }
        return t;
    }
    
    public void tasserColone(int a){
        Jeton J;
        for (int l=0; l<4; l++){
            if (grille[l][a].presenceJeton() == false){
                if (grille[l+1][a].presenceJeton() == true){
                    J=grille[l+1][a].recupererJeton();
                    grille[l][a].affecterJeton(J);
                }
            }
        }
    }
    
    public boolean coloneRemplie(int c){
        return grille[5][c].presenceJeton()== true;
    }
    
    public void placeTrouNoir(int l,int c){
        grille[l][c].placerTrouNoir();
    }
    
    public void supprimerTrouNoir(int l,int c){
        grille[l][c].supprimerTrouNoir();
    }
    
    public void placerDesintegrateur(int l,int c){
        grille[l][c].placerDesintegrateur();
    }  
    
    public void supprimerJeton(int l,int c){
        grille[l][c].supprimerJeton();
    }
    
    public Jeton recupererJeton(int l,int c){
        Jeton jetonCourant = grille[l][c].recupererJeton();
        return jetonCourant;
    }
}
    
    
    
    

