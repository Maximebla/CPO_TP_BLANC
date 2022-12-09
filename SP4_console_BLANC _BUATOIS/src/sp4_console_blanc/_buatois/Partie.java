/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_blanc._buatois;

import java.util.Scanner;

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
        System.out.println(J.Couleur);
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
        //System.out.println(listeJoueurs[0].reserveJetons.get(0) + ""+ listeJoueurs[1].reserveJetons.get(0));
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
                    //plateau.placerTrouNoir(l, c);
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
                    //plateau.placerDesintegrateur(l, c);
                    i += 1;
                }
            }

        }
    }

    public void initialiserPartie() {
        attribuerCouleurAuxJoueurs();
        creerEtAffecterJeton(listeJoueurs[1]);
        creerEtAffecterJeton(listeJoueurs[0]);
        System.out.println(listeJoueurs[0].reserveJetons.get(0) + ""+ listeJoueurs[1].reserveJetons.get(0));
        placerTrousNoirsEtDesintegrateurs();
        plateau.afficherGrilleSurConsole();
    }

    public void lancerPartie() {
        
         joueurCourant = listeJoueurs[1];
        int var = 0;       
        while (plateau.etreGagnantePourCouleur(listeJoueurs[0].getCouleur()) == false && plateau.etreGagnantePourCouleur(listeJoueurs[1].getCouleur()) == false ) {
           
            if (var % 2 == 0) {
                joueurCourant = listeJoueurs[0];
            }else{
                joueurCourant = listeJoueurs[1];
            }
                System.out.println("Pour jouer un jeton tapez '1',pour récupérer un jeton, tapez '2' et pour utiliser un désintegrateur, tapez'3'");
                Scanner reponse = new Scanner(System.in);
                int rep = reponse.nextInt();
                
                if (rep == 1) {
                    int c = 100;
                    Scanner colonne = new Scanner(System.in);
                    while (c > 7 || c < 0) {
                        System.out.println("Choisissez la colonne où placer le jeton");
                        c = colonne.nextInt();
                    }
                    int l = plateau.ajouterJetonDansColonne(joueurCourant.jouerJeton(), c-1);
                    if (plateau.presenceTrouNoir(c - 1,l)==true){
                        plateau.supprimerJeton( c-1,l);  
                        plateau.supprimerTrouNoir( c-1,l);
                    }
                    if(plateau.presenceDesintegrateur( c-1,l)==true){
                        joueurCourant.obtenirDesintegrateur();
                        plateau.supprimerDesintegrateur( c-1,l);
                        System.out.println("vous avez pris un desintegrateur");
                    }
                    plateau.afficherGrilleSurConsole();
                }
                
                if (rep == 2) {
                    int c = 100;
                    int l = 100;
                    Scanner colonne = new Scanner(System.in);
                    Scanner ligne = new Scanner(System.in);
                    while (c > 7 || c < 0) {
                        System.out.println("Choisissez la colonne où vous voulez récupérer le jeton");
                        c = colonne.nextInt();
                    }
                    while (l > 6 || l < 0) {
                        System.out.println("Choisissez la ligne où vous voulez récupérer le jeton");
                        l = ligne.nextInt();
                    }

                    plateau.recupererJeton(l - 1, c - 1);
                    plateau.afficherGrilleSurConsole();
                }
                
                if (rep == 3) {
                    int c = 100;
                    int l = 100;
                    Scanner colonne = new Scanner(System.in);
                    Scanner ligne = new Scanner(System.in);
                    //while (){
                        while (c > 7 || c < 0) {
                            System.out.println("Choisissez la colonne où vous voulez désintégrer votre Jeton");
                            c = colonne.nextInt();
                        }
                        while (l > 6  || l < 0) {
                            System.out.println("Choisissez la ligne où vous voulez désintégrer votre jeton");
                            l = ligne.nextInt();
                        }
                    //}
                    plateau.placerDesintegrateur(l - 1, c - 1);
                    plateau.afficherGrilleSurConsole();
                }
                
            var+=1;
        }
        System.out.println("le joueur "+joueurCourant+"a gagné");
    }
}
