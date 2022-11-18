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
            
    public void CelluleDeGrille( ){
        jetonCourant=null;
        avoirTrouNoir = false;
        avoirDesintegrateur=false;
    }
    
    public boolean presenceJeton(){
        if (jetonCourant != null ){
            return true;
        }else{
            return false;
        }           
    }

    public void affecterJeton(Jeton jetonCourant) {
        this.jetonCourant = jetonCourant;
    }
    
    public String lireCouleurDuJeton(){
        if (jetonCourant != null){
            return jetonCourant.toString();     
        }else{
            return "vide";
        }
    }
    
    public  void placerTrouNoir(){
        avoirTrouNoir = true;
    }
    
    public void supprimerTrouNoir(){
        avoirTrouNoir = false;
    }
    
    public boolean presenceTrouNoir(){
        if (avoirTrouNoir == true){
            return true;
        }else {
            return false;
        }
    }
    
    public Jeton recuprerJeton(){
        Jeton temps=jetonCourant;
        jetonCourant = null;
        return temps;
    }
    
    public void supprimerJeton(){
        jetonCourant = null;
    }
    
    public boolean presenceDesintegrateur(){
        if (avoirDesintegrateur == true){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean placerDesintegrateur(){
        return avoirDesintegrateur = true;
    }
    
    public boolean supprimerDesintegrateur(){
        return avoirDesintegrateur = false;
    }
    
    public void activerTrouNoir(){
        supprimerJeton();
        supprimerTrouNoir();  
    }
}
