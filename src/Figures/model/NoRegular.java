/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figures.model;

/**
 *
 * @author Sonia
 */
public abstract class NoRegular extends Poligon {
//Variables

    protected double[] midaCostats;

    /**
     * Constructor
     *
     * @param nom
     */
    public NoRegular(String nom) {
        super(nom);
    }

    /**
     *
     * @param midaCostats
     * @param lados
     * @param nom
     */
    public NoRegular(double[] midaCostats, int lados, String nom) {
        super(nom, lados);
        this.midaCostats = midaCostats;
    }

    public NoRegular(String nom, int costats) {
        super(nom, costats);
    }

    /**
     *
     * @return
     */
    @Override
    public abstract double calculaArea();

    /**
     * @return
     */
    @Override
    public abstract double calculaPerimetre();

}
