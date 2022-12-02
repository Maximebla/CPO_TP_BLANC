/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_blanc._buatois;

/**
 *
 * @author User
 */
public class CelluleDeGrille {
    private Jeton jetonCourant ;
    private boolean avoirTrouNoir ;
    private boolean avoirDesintegrateur ;
            
    /**initialise les variables soit null soit false
     *
     */
    public CelluleDeGrille( ){
        jetonCourant=null;
        avoirTrouNoir = false;
        avoirDesintegrateur=false;
    }
    
    /**regarde si il y a un jeton ou pas
     *
     * @return
     */
    public boolean presenceJeton(){
        if (jetonCourant != null ){
            return true;
        }else{
            return false;
        }           
    }

    /**le jeton prend une couleur
     *
     * @param jetonCourant
     */
    public void affecterJeton(Jeton jetonCourant) {
        this.jetonCourant = jetonCourant;
    }
    
    /** regard la couleur et la renvoie
     *
     * @return jetonCourant ou "vide"
     */
    public String lireCouleurDuJeton(){
        if (jetonCourant != null){
            return jetonCourant.toString();     
        }else{
            return "vide";
        }
    }
    
    /**crée un trou noir qui sera place par une autre methode
     *
     */
    public  void placerTrouNoir(){
        avoirTrouNoir = true;
    }
    
    /**supprime le trou noir de la case dans la grille
     *
     */
    public void supprimerTrouNoir(){
        avoirTrouNoir = false;
    }
    
    /**regard s'il y a un trou noir sur la case 
     *
     * @return boolean
     */
    public boolean presenceTrouNoir(){
        if (avoirTrouNoir == true){
            return true;
        }else {
            return false;
        }
    }
    
    /**recuprére le jeton et le renvoie pour mettre avec une autre variable 
     * le jetton sera null après
     *
     * @return renvoie le jetonCourant
     */
    public Jeton recupererJeton(){
        Jeton temps=jetonCourant;
        jetonCourant = null;
        return temps;
    }
    
    /**permet de supprimer le jeton d'une case
     *
     */
    public void supprimerJeton(){
        jetonCourant = null;
    }
    
    /** regard s'il y a des desintegrateur
     *
     * @return boolean
     */
    public boolean presenceDesintegrateur(){
        if (avoirDesintegrateur == true){
            return true;
        }else{
            return false;
        }
    }
    
    /** on place des desintegrateur
     *
     * @return boolean
     */
    public boolean placerDesintegrateur(){
        return avoirDesintegrateur = true;
    }
    
    /** supprime des desintegrateur
     *
     * @return boolean
     */
    public boolean supprimerDesintegrateur(){
        return avoirDesintegrateur = false;
    }
    
    /**met en action le trou noir 
     *supprime le jeton de la case et supprime le trounoir
     */
    public void activerTrouNoir(){
        supprimerJeton();
        supprimerTrouNoir();  
    }

    @Override
    public String toString() {
        if (presenceJeton() == true){
            return(lireCouleurDuJeton());
        }
        if(presenceTrouNoir() == true){
            return "@";
        }
        if (presenceDesintegrateur() == true){
            return"D";
        }
        if (presenceDesintegrateur() == false && presenceJeton() == false && presenceTrouNoir() == false ){
            return".";
        }
        return null;
    }
    
    
    
}
