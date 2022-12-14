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

    CelluleDeGrille[][] grille = new CelluleDeGrille[6][7];

    public PlateauDeJeu() {
        for (int l = 0; l < 6; l++) {
            for (int c = 0; c < 7; c++) {
                grille[l][c] = new CelluleDeGrille();
            }
        }
    }

    public int ajouterJetonDansColonne(Jeton J, int c) {
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

    public boolean grilleRemplie() {
        boolean r = true;
        for (int c = 0; c < 6; c++) {
            if (grille[6][c].presenceJeton() == false) {
                r = false;
            }
        }
        return r;
    }

    public void viderGrille(Joueur J1, Joueur J2) {
        String Couleur;
        Jeton J;
        for (int l = 0; l < 6; l++) {
            for (int c = 0; c < 7; c++) {
                if (grille[l][c].presenceJeton() == true) {
                    Couleur = lireCouleurDuJeton(c, l);
                    J = grille[c][l].recupererJeton();
                    if (J1.getCouleur().equals(Couleur)) {
                        J1.AjouterJeton(J);
                    } else {
                        J2.AjouterJeton(J);
                    }
                }
            }
        }
    }

    public void afficherGrilleSurConsole() {
        for (int l = 5; l > -1; l--) {
            for (int c = 0; c < 7; c++) {
                System.out.print("[" + grille[l][c] + "]");

                if (c == 6) {
                    System.out.print("\n");
                }
            }
        }
    }

    public boolean presenceJeton(int x, int y) {
        return grille[x][y].presenceJeton() == true;
    }

    public boolean presenceTrouNoir(int l, int c) {
        if (grille[l][c].presenceTrouNoir() == true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean presenceDesintegrateur(int l, int c) {
        if (grille[l][c].presenceDesintegrateur() == true) {
            return true;
        } else {
            return false;
        }
    }

    public void placerDesintegrateur(int l, int c) {
        grille[l][c].placerDesintegrateur();
    }

    public void placerTrouNoir(int l, int c) {
        grille[l][c].placerTrouNoir();
    }

    public String lireCouleurDuJeton(int x, int y) {
        if ("vide".equals(grille[x][y].lireCouleurDuJeton())) {
            return "rien";
        } else {
            if ("R".equals(grille[x][y].lireCouleurDuJeton())) {
                return "R";
            } else {
                return "J";
            }
        }
    }

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

    public void tasserColone(int a) {
        Jeton J;
        for (int l = 0; l < 5; l++) {
            if (grille[l][a].presenceJeton() == false) {
                if (grille[l + 1][a].presenceJeton() == true) {
                    J = grille[l + 1][a].recupererJeton();
                    grille[l][a].affecterJeton(J);
                }
            }
        }
    }

    public boolean coloneRemplie(int c) {
        return grille[5][c].presenceJeton() == true;
    }

    public void supprimerTrouNoir(int l, int c) {
        grille[l][c].supprimerTrouNoir();
    }

    public void supprimerJeton(int l, int c) {
        grille[l][c].supprimerJeton();
    }
    
    public void supprimerDesintegrateur(int l, int c) {
        grille[l][c].supprimerDesintegrateur();
    }

    public Jeton recupererJeton(int l, int c) {
        Jeton jetonCourant = grille[l][c].recupererJeton();
        return jetonCourant;
    }
}
