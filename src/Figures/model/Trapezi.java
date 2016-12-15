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
public class Trapezi extends NoRegular {

    private double altura;

    /**
     *
     * @param nom
     * @param costats
     * @param midaCostats
     * @param altura
     */
    public Trapezi(double altura, double[] midaCostats, int costats, String nom) {
        super(midaCostats, costats, nom);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    //TODO control.calcularArea();
    //TODO control.demanarCostatMenor();
    //,,     ,,   .demanarCostatMayor();
    @Override
    public double calculaArea() {
        return ((midaCostats[0] + midaCostats[1]) / 2) * altura;
    }

    @Override
    public double calculaPerimetre() {
        return (midaCostats[0] + midaCostats[1] + midaCostats[2] + midaCostats[3]);
    }
}
