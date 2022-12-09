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
    
    /**Constructeur de la classe PlateauDeJeu qui créé la grille de 42 cases
     *
     */
    public PlateauDeJeu(){
        for (int l=0; l<6; l++){
            for (int c=0; c<7; c++){
                grille[l][c] = new CelluleDeGrille();
            }
        }
    }
    
    /**Méthode qui ajoute dans une colonne du choix du joueur un jeton dans sa case la plus basse
     *
     * @param J
     * @param c
     * @return
     */
    public int ajouterJetonDansColonne(Jeton J, int c){
        int a = 0;
        for (int i = 0; i < 6; i++) {
            if (grille[i][c].presenceJeton() != true) {
                grille[i][c].affecterJeton(J);
                a = i;
                break;
            }
        }
        return a;
    }
    
    /**Méthode qui vérifie si la grille est tout à fait pleine en vérifiant si la case la plus 
     * haute de chaque colonne est pleine ou non
     *
     * @return
     */
    public boolean grilleRemplie(){
        boolean r=true;
        for (int c=0; c<6; c++){
            if (grille[6][c].presenceJeton() == false){
                r=false;
            }
        }
    return r;  
    }
    
    /**Méthode qui vide la grille et rend à chacun des joueurs ses 30 jetons
     *
     * @param J1
     * @param J2
     */
    public void viderGrille(Joueur J1,Joueur J2){
        String Couleur;
        Jeton J;       
        for (int l=0; l<6; l++){
            for (int c=0; c<7; c++){
                if (grille[l][c].presenceJeton()== true){
                    Couleur = lireCouleurDuJeton(c,l);
                    J = grille[c][l].recupererJeton();
                    if (J1.getCouleur().equals(Couleur)){
                        J1.AjouterJeton(J);
                    }else{
                        J2.AjouterJeton(J);
                    }
                }
           }
        }
    }
    
    /**Méthode qui affiche la grille sur la console de jeu 
     *
     */
    public void afficherGrilleSurConsole(){
        for (int l=5; l>-1; l--){
            for (int c=0; c<7; c++){
                if (grille[l][c].presenceJeton()){
                    System.out.println ("[" + toString()+ " ");
                }
                if (c==5){
                    System.out.println ("\n");
                }
            }
        }
    }
    
    /**Méthode qui vérifie si un jeton est présent sur une case de la grille et renvoie "true" ou "false"
     *
     * @param x
     * @param y
     * @return
     */
    public boolean presenceJeton(int x, int y){
        return grille[x][y].presenceJeton() == true;
    }
    
    /**Méthode qui vérifie si un trou noir est présent sur une case de la grille et renvoie "true" ou "false"
     *
     * @param l
     * @param c
     * @return
     */
    public boolean presenceTrouNoir(int l,int c){
        if (grille[l][c].presenceTrouNoir() == true){
            return true;
        }else {
            return false;
        }
    }
    
    /**Méthode qui vérifie si un désintégrateur est présent sur une case de la grille et renvoie "true" ou "false"
     *
     * @param l
     * @param c
     * @return
     */
    public boolean presenceDesintegrateur(int l, int c){
        if (grille[l][c].presenceDesintegrateur() == true){
            return true;
        }else{
            return false;
        }
    }
    
    /**Méthode qui place un désintégrateur sur une case
     *
     * @param l
     * @param c
     */
    public void placerDesintegrateur(int l,int c){
        grille[l][c].placerDesintegrateur();
    }
    
    /**Méthode qui place un trou noir sur une case déterminée de la grille
     *
     * @param l
     * @param c
     */
    public void placerTrouNoir(int l,int c){
        grille[l][c].placerTrouNoir();
    }
    
    /**Méthode qui lit la couleur d'un jeton
     *
     * @param x
     * @param y
     * @return
     */
    public String lireCouleurDuJeton(int x,int y){
        if("vide".equals(grille[x][y].lireCouleurDuJeton()) ){
            return "rien";
        }else{
            if("R".equals(grille[x][y].lireCouleurDuJeton()) ){
                return "R";
            }else{
                return "J" ;
            }
        }
    }
    
    /**Méthode qui détermine si les autres méthodes analysant si le joueur a gagné sont vraient ou fausses
     *
     * @param g
     * @return
     */
    public boolean etreGagnantePourCouleur(String g) {
        if (g=="rouge"){
            g="R";
        }else{
            g="J";
        }
        if (ligneGagnantePourCouleur(g) == true || colonneGagnantePourCouleur(g) == true || diagonaleMontanteGagnantePourCouleur(g) == true || diagonaleDesencanteGagnantePourCouleur(g) == true) {
            return true;
        } else {
            return false;
        }
    }

    /**Méthode qui vérifie si le joueur à aligné 4 jetons sur une même ligne
     *
     * @param c
     * @return
     */
    public boolean ligneGagnantePourCouleur(String c) {

        for (int l = 0; l < 3; l++) {
            for (int i = 0; i < 7; i++) {
                if (grille[l][i].presenceJeton() == true && grille[l][i].lireCouleurDuJeton().equals(c)) {
                    if (grille[l + 1][i].presenceJeton() == true && grille[l + 1][i].lireCouleurDuJeton().equals(c)) {
                        if (grille[l + 2][i].presenceJeton() == true && grille[l + 2][i].lireCouleurDuJeton().equals(c)) {
                            if (grille[l + 3][i].presenceJeton() == true && grille[l + 3][i].lireCouleurDuJeton().equals(c)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }

        return false;
    }

    /**Méthode qui vérifie si le joueur à aligné 4 jetons sur une même colonne
     *
     * @param c
     * @return
     */
    public boolean colonneGagnantePourCouleur(String c) {
        for (int l = 0; l < 6; l++) {
            for (int i = 0; i < 4; i++) {
                if (grille[l][i].presenceJeton() == true && grille[l][i].lireCouleurDuJeton().equals(c)) {
                    if (grille[l][i + 1].presenceJeton() == true && grille[l][i + 1].lireCouleurDuJeton().equals(c)) {
                        if (grille[l][i + 2].presenceJeton() == true && grille[l][i + 2].lireCouleurDuJeton().equals(c)) {
                            if (grille[l][i + 3].presenceJeton() == true && grille[l][i + 3].lireCouleurDuJeton().equals(c)) {
                                return true;
                            }
                        }

                    }
                }
            }
        }
        return false;
    }

    /**Méthode qui vérifie si le joueur à aligné 4 jetons sur une diagonale montante
     *
     * @param c
     * @return
     */
    public boolean diagonaleMontanteGagnantePourCouleur(String c) {
        for (int l = 3; l < 6; l++) {
            for (int i = 0; i < 7; i++) {
                //System.out.println(l + " " +i);
                if (grille[l][i].presenceJeton() == true && grille[l][i].lireCouleurDuJeton().equals(c)) {
                    if (grille[l - 1][i + 1].presenceJeton() == true && grille[l + 1][i + 1].lireCouleurDuJeton().equals(c)) {
                        if (grille[l - 2][i + 2].presenceJeton() == true && grille[l + 2][i + 2].lireCouleurDuJeton().equals(c)) {
                            if (grille[l - 3][i + 3].presenceJeton() == true && grille[l + 3][i + 3].lireCouleurDuJeton().equals(c)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /**Méthode qui vérifie si le joueur à aligné 4 jetons sur une diagonale montante
     *
     * @param c
     * @return
     */
    public boolean diagonaleDesencanteGagnantePourCouleur(String c) {
        for (int l = 0; l < 3; l++) {
            for (int i = 0; i < 4; i++) {
                if (grille[l][i].presenceJeton() == true && grille[l][i].lireCouleurDuJeton().equals(c)) {
                    if (grille[l + 1][i + 1].presenceJeton() == true && grille[l + 1][i + 1].lireCouleurDuJeton().equals(c)) {
                        if (grille[l + 2][i + 2].presenceJeton() == true && grille[l + 2][i + 2].lireCouleurDuJeton().equals(c)) {
                            if (grille[l + 3][i + 3].presenceJeton() == true && grille[l + 3][i + 3].lireCouleurDuJeton().equals(c)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    /**Méthode qui descend d'une case un jeton si celui-ci n'a pas de jeton en-dessous de lui
     *
     * @param a
     */
    public void tasserColone(int a){
        Jeton J;
        for (int l=0; l<5; l++){
            if (grille[l][a].presenceJeton() == false){
                if (grille[l+1][a].presenceJeton() == true){
                    J=grille[l+1][a].recupererJeton();
                    grille[l][a].affecterJeton(J);
                }
            }
        }
    }
    
    /**méthode qui descend le jeton d'une case s'il n'y en a pas en-dessous pour chaque colonne de la grille
     *
     */
    public void tasserGrille(){
        for (int i=0;i<7;i++){
            tasserColone(i);
        }
    }
    
    /**Méthode qui détermine si la colonne est remplie en regardant si la case en haut de la colone est pleine
     *
     * @param c
     * @return
     */
    public boolean coloneRemplie(int c){
        for(int k = 0; k < 6; k++){
            if(grille[k][c].presenceJeton()== false){
                return false;
            }
        }
        return true;
    }
    
    /**Méthode qui supprime un trou noir sur une case
     *
     * @param l
     * @param c
     */
    public void supprimerTrouNoir(int l,int c){
        grille[l][c].supprimerTrouNoir();
    }
    
    /**Méthode qui supprime un jeton sur une case
     *
     * @param l
     * @param c
     */
    public void supprimerJeton(int l,int c){
        grille[l][c].supprimerJeton();
    }
    
    /**Méthode qui supprime un désintégrateurr sur une case
     *
     * @param l
     * @param c
     */
    public void supprimerDesintegrateur(int l, int c) {
        grille[l][c].supprimerDesintegrateur();
    }
    
    /**Méthode qui récupère et stock la couleur du jeton récupéré
     *
     * @param l
     * @param c
     * @return
     */
    public Jeton recupererJeton(int l,int c){
        Jeton jetonCourant = grille[l][c].recupererJeton();
        return jetonCourant;
    }
}
    
    
    
    

