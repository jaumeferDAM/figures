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
public class Rombe extends NoRegular {

    //Variables
    private double DMenor;
    private double Dmayor;

    public double getDMenor() {
        return DMenor;
    }

    public void setDMenor(double DMenor) {
        this.DMenor = DMenor;
    }

    public double getDmayor() {
        return Dmayor;
    }

    public void setDmayor(double Dmayor) {
        this.Dmayor = Dmayor;
    }

    /**
     *
     * @param nom
     */
    public Rombe(String nom) {
        super(nom);
    }

    /**
     * Constructor
     *
     * @param nom
     * @param DMenor
     * @param Dmayor
     */
    public Rombe(String nom, double DMenor, double Dmayor) {
        super(nom);
        this.DMenor = DMenor;
        this.Dmayor = Dmayor;
    }

    //TODO .calcularArea
    /**
     * Metode per calcular l'area del rombe.
     *
     * @return
     */
    @Override
    public double calculaArea() {
        return (Dmayor * DMenor) / 2;
    }

    /**
     * Metode per calcular el perimetre del rombe.
     *
     * @return
     */
    @Override
    public double calculaPerimetre() {
        return Math.sqrt(Math.pow((DMenor) / 2, 2) + Math.pow((Dmayor) / 2, 2));
    }

    /**
     * Metode per mostrar per pantalla nom,diagonal mayor,diagonal menor, area i
     * perimetre del(s) rombes(s).
     *
     * @return
     */
    @Override
    public String toString() {
        return "Rombe{nom= " + nom + " Diagonal Mayor=  " + Dmayor + " Diagonal menor " + DMenor + " area= " + df.format(calculaArea()) + " perimetre= " + df.format(calculaPerimetre()) + '}';
    }
}
