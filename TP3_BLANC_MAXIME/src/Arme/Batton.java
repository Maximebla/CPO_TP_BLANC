/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arme;

import Arme.Arme;

/**
 *
 * @author User
 */
public class Batton extends Arme {
    private int age;
    public Batton (String nom,int nvAtta, int a) {
        super(nom,nvAtta);
        if (a <100 ){
            age=a;
        }else{
            age=100;
        }
    }
    
    public int getFin() {
        return age;
    }
    public void setFin(int age) {
        if (age <100 ){
            this.age = age;
        }
    }
    
    @Override
    public String toString() {
        return "Batton nom = " +nom+" Attaque= "+this.getNvAtta()+" finnesse= " +age ;
    }
}

