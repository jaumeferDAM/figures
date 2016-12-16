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
    //Variable(nom tenen totes les figures).

    String nom;
    //DecimalFormat per tenir maxim 2 decimals.
    protected DecimalFormat df = new DecimalFormat("#.##");

    /**
     * Constructor
     *
     * @param nom
     */
    public Figura(String nom) {
        this.nom = nom;
    }

    /**
     * Metode per calcular el perimetre que s'implementara(override) en les
     * herencies d'aquesta classe.
     *
     * @return
     */
    public abstract double calculaPerimetre();

    /**
     * Metode per calcular l'area que s'implementara(override) en les herencies
     * d'aquesta classe.
     *
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
