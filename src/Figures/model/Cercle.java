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
public class Cercle extends Figura {

    private double radi;

    /**
     * Constructor.
     *
     * @param nom
     * @param radi
     */
    public Cercle(String nom, double radi) {
        super(nom);
        this.radi = radi;
    }

    public double getRadi() {
        return radi;
    }

    public void setRadi(double radi) {
        this.radi = radi;
    }

    //TODO metode control.calculaArea();
    //TODO metode control.calcularPerimetre();
    //TODO metode control.demanarRadi();
    /**
     * Metode per calcular el perimetre del cercle.
     *
     * @return
     */
    @Override
    public double calculaPerimetre() {
        return (2 * Math.PI * radi);
    }

    /**
     * Metode per calcular l'area del cercle.
     *
     * @return
     */
    @Override
    public double calculaArea() {
        return (Math.PI * Math.pow(radi, 2));
    }

    /**
     * Metode per mostrar per pantalla nom, radi, perimetre i area del(s)
     * cercle(s) Formateja la sortida a dos decimals.
     *
     * @return
     */
    @Override
    public String toString() {
        return "Cercle{ nom= " + this.getNom() + " radi= " + df.format(radi) + " perimetre= " + df.format(calculaPerimetre()) + " area= " + df.format(calculaArea()) + '}';
    }

}
