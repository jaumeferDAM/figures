/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figures.model;

import java.text.DecimalFormat;

/**
 *
 * @author Sonia
 */
public abstract class Figura {
String nom;
    //DecimalFormat per tenir maxim 2 decimals.
    protected DecimalFormat df = new DecimalFormat("#.##");

    /**
     * @param nom
     */
    public Figura(String nom) {
        this.nom = nom;
    }

    /**
     * @return
     */
    public abstract double calculaPerimetre();

    /**
     * @return
     */
    public abstract double calculaArea();

    /**
     * @return
     */
    public String getNom() {
        return nom;
    }
}
    
    
    
    

