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

    @Override
    public double calculaPerimetre() {
        return (2 * Math.PI * radi);
    }

    @Override
    public double calculaArea() {
        return (Math.PI * Math.pow(radi, 2));
    }
    @Override
    public String toString() {
        return "Cercle{ nom= " + this.getNom() + " radi= " + df.format(radi) + " perimetre= " + df.format(calculaPerimetre()) + " area= " + df.format(calculaArea()) + '}';
    }
    
}
