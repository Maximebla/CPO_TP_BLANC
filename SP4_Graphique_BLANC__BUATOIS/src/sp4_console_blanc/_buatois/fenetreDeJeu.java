/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sp4_console_blanc._buatois;

import java.util.Random;

/**
 *
 * @author User
 */
public class fenetreDeJeu extends javax.swing.JFrame {

    private Joueur[] listeJoueurs = new Joueur[2];
    private Joueur joueurCourant;
    private PlateauDeJeu plateau;

    /**
     * Creates new form fenetreDeJeu
     */
    public fenetreDeJeu() {
        initComponents();
        panneau_info_joueurs.setVisible(false);
        panneau_info_partie.setVisible(false);

        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j < 7; j++) {
                CelluleGraphique cellGraph = new CelluleGraphique(plateau.grille[i][j]);
                panneau_grille.add(cellGraph);

            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        panneau_grille = new javax.swing.JPanel();
        panneau_info_partie = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nbl_jcourant = new javax.swing.JLabel();
        message = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        panneau_creation_partie = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nom_joueur2 = new javax.swing.JTextField();
        nom_joueur1 = new javax.swing.JTextField();
        btn_start = new javax.swing.JButton();
        panneau_info_joueurs = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nbl_j2_nom = new javax.swing.JLabel();
        nbl_j2_couleur = new javax.swing.JLabel();
        nbl_j2_desint = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nbl_j1_nom = new javax.swing.JLabel();
        nbl_j1_couleur = new javax.swing.JLabel();
        nbl_j1_desint = new javax.swing.JLabel();
        btn_col_6 = new javax.swing.JButton();
        btn_col_0 = new javax.swing.JButton();
        btn_col_1 = new javax.swing.JButton();
        btn_col_2 = new javax.swing.JButton();
        btn_col_3 = new javax.swing.JButton();
        btn_col_4 = new javax.swing.JButton();
        btn_col_5 = new javax.swing.JButton();

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneau_grille.setBackground(new java.awt.Color(255, 255, 255));
        panneau_grille.setLayout(new java.awt.GridLayout(6, 7));
        getContentPane().add(panneau_grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 672, 576));

        panneau_info_partie.setBackground(new java.awt.Color(204, 255, 204));
        panneau_info_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("infos jeu");
        panneau_info_partie.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, -1));

        jLabel11.setText("joueur courant :");
        panneau_info_partie.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 56, -1, 30));

        nbl_jcourant.setText("nomJoueur2");
        panneau_info_partie.add(nbl_jcourant, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 66, -1, 20));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        message.setViewportView(jTextArea1);

        panneau_info_partie.add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 270, -1));

        getContentPane().add(panneau_info_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 480, 290, 190));

        panneau_creation_partie.setBackground(new java.awt.Color(204, 255, 204));
        panneau_creation_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nom joueur2 :");
        panneau_creation_partie.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel2.setText("Nom joueur1 :");
        panneau_creation_partie.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        nom_joueur2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_joueur2ActionPerformed(evt);
            }
        });
        panneau_creation_partie.add(nom_joueur2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 140, -1));

        nom_joueur1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_joueur1ActionPerformed(evt);
            }
        });
        panneau_creation_partie.add(nom_joueur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 140, -1));

        btn_start.setText("Démarrer partie");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });
        panneau_creation_partie.add(btn_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        getContentPane().add(panneau_creation_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 290, 120));

        panneau_info_joueurs.setBackground(new java.awt.Color(204, 255, 204));
        panneau_info_joueurs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("infos joueurs");
        panneau_info_joueurs.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, -1));

        jLabel4.setText("joueur2 :");
        panneau_info_joueurs.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel5.setText("couleur :");
        panneau_info_joueurs.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel6.setText("desintegrateurs :");
        panneau_info_joueurs.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        nbl_j2_nom.setText("nomJoueur2");
        panneau_info_joueurs.add(nbl_j2_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        nbl_j2_couleur.setText("couleurjoueur2");
        panneau_info_joueurs.add(nbl_j2_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 90, 20));

        nbl_j2_desint.setText("nbdesinjoueur2");
        panneau_info_joueurs.add(nbl_j2_desint, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));
        panneau_info_joueurs.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 153, 250, 10));

        jLabel7.setText("joueur1 :");
        panneau_info_joueurs.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 20));

        jLabel8.setText("couleur :");
        panneau_info_joueurs.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 20));

        jLabel9.setText("desintegrateurs :");
        panneau_info_joueurs.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 124, -1, -1));

        nbl_j1_nom.setText("nomJoueur1");
        panneau_info_joueurs.add(nbl_j1_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, 20));

        nbl_j1_couleur.setText("couleurjoueur1");
        panneau_info_joueurs.add(nbl_j1_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 80, 30));

        nbl_j1_desint.setText("nbdesinjoueur1");
        panneau_info_joueurs.add(nbl_j1_desint, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, 20));

        getContentPane().add(panneau_info_joueurs, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 190, 290, 270));

        btn_col_6.setText("7");
        btn_col_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 20, -1, 40));

        btn_col_0.setText("1");
        getContentPane().add(btn_col_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 40));

        btn_col_1.setText("2");
        getContentPane().add(btn_col_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 20, -1, 40));

        btn_col_2.setText("3");
        getContentPane().add(btn_col_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 20, -1, 40));

        btn_col_3.setText("4");
        btn_col_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 20, -1, 40));

        btn_col_4.setText("5");
        getContentPane().add(btn_col_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 20, -1, 40));

        btn_col_5.setText("6");
        btn_col_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, 40));

        setBounds(0, 0, 1046, 683);
    }// </editor-fold>//GEN-END:initComponents

    private void nom_joueur1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_joueur1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_joueur1ActionPerformed

    private void nom_joueur2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_joueur2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_joueur2ActionPerformed

    private void btn_col_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_col_3ActionPerformed

    private void btn_col_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_col_6ActionPerformed

    private void btn_col_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_col_5ActionPerformed

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        panneau_info_joueurs.setVisible(true);
        panneau_info_partie.setVisible(true);
        initialiserPartie();
        panneau_grille.repaint();
        btn_start.setEnabled(false);
        
    }//GEN-LAST:event_btn_startActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fenetreDeJeu().setVisible(true);
            }
        });
    }

    public void initialiserPartie() {
        String nomJoueur1=nom_joueur1.getText();
        String nomJoueur2=nom_joueur2.getText();
        Joueur J1 = new Joueur(nomJoueur1); 
        Joueur J2 = new Joueur(nomJoueur2);
        attribuerCouleurAuxJoueurs();
        
        nbl_j1_nom.setText(nomJoueur1);
        nbl_j2_nom.setText(nomJoueur2);
        nbl_j1_couleur.setText(J1.Couleur);
        nbl_j2_couleur.setText(J2.Couleur);
        nbl_j1_desint.setText(J1.nombreDesintegrateurs+"");
        nbl_j2_desint.setText(J2.nombreDesintegrateurs+"");
        nbl_jcourant.setText(joueurCourant.nom);
        
        listeJoueurs[0] = J1;
        listeJoueurs[1] = J2;
        Joueur J = listeJoueurs[1];
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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_col_0;
    private javax.swing.JButton btn_col_1;
    private javax.swing.JButton btn_col_2;
    private javax.swing.JButton btn_col_3;
    private javax.swing.JButton btn_col_4;
    private javax.swing.JButton btn_col_5;
    private javax.swing.JButton btn_col_6;
    private javax.swing.JButton btn_start;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JScrollPane message;
    private javax.swing.JLabel nbl_j1_couleur;
    private javax.swing.JLabel nbl_j1_desint;
    private javax.swing.JLabel nbl_j1_nom;
    private javax.swing.JLabel nbl_j2_couleur;
    private javax.swing.JLabel nbl_j2_desint;
    private javax.swing.JLabel nbl_j2_nom;
    private javax.swing.JLabel nbl_jcourant;
    private javax.swing.JTextField nom_joueur1;
    private javax.swing.JTextField nom_joueur2;
    private javax.swing.JPanel panneau_creation_partie;
    private javax.swing.JPanel panneau_grille;
    private javax.swing.JPanel panneau_info_joueurs;
    private javax.swing.JPanel panneau_info_partie;
    // End of variables declaration//GEN-END:variables
}
