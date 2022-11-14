/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_blanc_maxime;

/**
 *
 * @author User
 */
public class Epée extends Arme{
    private int fin;

    public Epée (String nom,int nvAtta, int finesse) {
        super(nom,nvAtta);
        if (finesse <100 ){
            fin=finesse;
        }else{
            fin=100;
        }
    }
    public int getFin() {
            return fin;
        }
    public void setFin(int fin) {
        if (fin <100 ){
            this.fin = fin;
        }
    }

    
    @Override
    public String toString() {
        return "Epée (nom = " +nom+" Attaque= "+this.getNvAtta()+" finnesse= " +this.getFin() );
    }
    
    
}
