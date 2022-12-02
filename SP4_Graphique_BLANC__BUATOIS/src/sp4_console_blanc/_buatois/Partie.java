/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_blanc._buatois;

import java.util.Scanner;
import sp4_console_blanc._buatois.Jeton;
import sp4_console_blanc._buatois.Joueur;
import sp4_console_blanc._buatois.PlateauDeJeu;
import sp4_console_blanc._buatois.CelluleDeGrille;

/**
 *
 * @author User
 */
public class Partie {

    private Joueur[] listeJoueurs = new Joueur[2];
    private Joueur joueurCourant;
    private PlateauDeJeu plateau;

    public Partie(Joueur J1, Joueur J2) {
        listeJoueurs[0] = J1;
        listeJoueurs[1] = J2;
        plateau = new PlateauDeJeu();
    }

    public void attribuerCouleurAuxJoueurs() {
        int a = (int) (Math.random() * (2));
        if (a == 1) {
            listeJoueurs[0].affecterCouleur("jaune");
            listeJoueurs[1].affecterCouleur("rouge");
        } else {
            listeJoueurs[0].affecterCouleur("rouge");
            listeJoueurs[1].affecterCouleur("jaune");
        }
    }

    public void creerEtAffecterJeton(Joueur J) {
        if ("rouge".equals(J.getCouleur())) {
            for (int i = 0; i < 30; i++) {
                Jeton JT = new Jeton("rouge");
                J.AjouterJeton(JT);
            }
        } else {
            for (int i = 0; i < 30; i++) {
                Jeton JT = new Jeton("jaune");
                J.AjouterJeton(JT);
            }
        }

    }

    public void placerTrousNoirsEtDesintegrateurs() {
        int i = 0;
        while (i < 3) {
            int l = (int) (Math.random() * (9 - 3));
            int c = (int) (Math.random() * (8 - 3));
            if (plateau.presenceDesintegrateur(l, c) == false) {
                if (plateau.presenceTrouNoir(l, c) == false) {
                    plateau.placerTrouNoir(l, c);
                    plateau.placerDesintegrateur(l, c);
                    i += 1;
                }
            }

        }
        while (i < 5) {
            int l = (int) (Math.random() * (9 - 3));
            int c = (int) (Math.random() * (8 - 3));
            if (plateau.presenceDesintegrateur(l, c) == false) {
                if (plateau.presenceTrouNoir(l, c) == false) {
                    plateau.placerTrouNoir(l, c);
                    plateau.placerDesintegrateur(l, c);
                    i += 1;
                }
            }

        }
        while (i < 7) {
            int l = (int) (Math.random() * (9 - 3));
            int c = (int) (Math.random() * (8 - 3));
            if (plateau.presenceDesintegrateur(l, c) == false) {
                if (plateau.presenceTrouNoir(l, c) == false) {
                    plateau.placerTrouNoir(l, c);
                    plateau.placerDesintegrateur(l, c);
                    i += 1;
                }
            }

        }
    }

    public void initialiserPartie() {
        attribuerCouleurAuxJoueurs();
        creerEtAffecterJeton(listeJoueurs[1]);
        creerEtAffecterJeton(listeJoueurs[0]);
        placerTrousNoirsEtDesintegrateurs();
    }

    public void lancerPartie() {
        
         joueurCourant = listeJoueurs[1];
               
        while (plateau.etreGagnantePourCouleur(joueurCourant.getCouleur()) == false) {
            int var = 0;
            if (var % 2 == 0) {
                joueurCourant = listeJoueurs[0];
                System.out.println("Pour jouer un jeton tapez '1',pour récupérer un jeton, tapez '2' et pour utiliser un désintegrateur, tapez'3'");
                Scanner reponse = new Scanner(System.in);
                int rep = reponse.nextInt();
                if (rep == 1) {
                    int c = 100;
                    Scanner colonne = new Scanner(System.in);
                    while (c > 7) {
                        System.out.println("Choisissez la colonne où placer le jeton");
                        c = colonne.nextInt();
                    }
                    plateau.ajouterJetonDansColonne(joueurCourant.jouerJeton(), c - 1);
                    var += 1;
                }
                if (rep == 2) {
                    int c = 100;
                    int l = 100;
                    Scanner colonne = new Scanner(System.in);
                    Scanner ligne = new Scanner(System.in);
                    while (c > 7) {
                        System.out.println("Choisissez la colonne où vous voulez récupérer le jeton");
                        c = colonne.nextInt();
                    }
                    while (l > 6) {
                        System.out.println("Choisissez la ligne où vous voulez récupérer le jeton");
                        l = ligne.nextInt();
                    }

                    plateau.recupererJeton(l - 1, c - 1);
                    var += 1;
                }
                if (rep == 3) {
                    int c = 100;
                    int l = 100;
                    Scanner colonne = new Scanner(System.in);
                    Scanner ligne = new Scanner(System.in);
                    while (c > 7) {
                        System.out.println("Choisissez la colonne où placer le jeton");
                        c = colonne.nextInt();
                    }
                    while (l > 6) {
                        System.out.println("Dans quelle ligne voulez vous placer votre jeton");
                        l = ligne.nextInt();
                    }
                    plateau.placerDesintegrateur(l - 1, c - 1);
                    var += 1;
                }
            }
            if (var % 2 == 1) {
                joueurCourant = listeJoueurs[1];
                System.out.println("Que voulez vous faire, si vous voulez jouer un jeton tapez '1', si vous voulez récupérer un jeton, tapez '2' et si vous voulez utiliser un désintegrateur, tapez'3'");
                Scanner reponse = new Scanner(System.in);
                int rep = reponse.nextInt();
                if (rep == 1) {
                    int c = 100;
                    Scanner colonne = new Scanner(System.in);
                    while (c > 7) {
                        System.out.println("Dans quelle colonne voulez vous placer votre jeton");
                        c = colonne.nextInt();
                    }
                    plateau.ajouterJetonDansColonne(joueurCourant.jouerJeton(), c - 1);
                    var += 1;
                }
                if (rep == 2) {
                    int c = 100;
                    int l = 100;
                    Scanner colonne = new Scanner(System.in);
                    Scanner ligne = new Scanner(System.in);
                    while (c > 7) {
                        System.out.println("De quelle colonne voulez vous récupérer votre jeton");
                        c = colonne.nextInt();
                    }
                    while (l > 6) {
                        System.out.println("De quelle ligne voulez vous récuprer votre jeton");
                        l = ligne.nextInt();
                    }

                    plateau.recupererJeton(l - 1, c - 1);
                    var += 1;
                }
                if (rep == 3) {
                    int c = 100;
                    int l = 100;
                    Scanner colonne = new Scanner(System.in);
                    Scanner ligne = new Scanner(System.in);
                    while (c > 7) {
                        System.out.println("Dans quelle colonne voulez vous utiliser votre desintegrateur");
                        c = colonne.nextInt();
                    }
                    while (l > 6) {
                        System.out.println("Dans quelle ligne voulez vous utiliser votre desintegrateur");
                        l = ligne.nextInt();
                    }
                    plateau.placerDesintegrateur(l - 1, c - 1);
                    var += 1;
                }

            }
        }
    }

}
