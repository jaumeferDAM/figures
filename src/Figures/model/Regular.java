package Figures.model;

/**
 *
 * @author ALUMNEDAM
 */
public class Regular extends Poligon {
//Variables

    double midacostat;

    /**
     * Constructor de regular.
     *
     * @param midacostat
     * @param costats
     * @param nom
     */
    public Regular(String nom, double midacostat, int costats) {
        super(nom, costats);
        this.midacostat = midacostat;
    }

    /**
     * Metode per calcular l'area poligon regular.
     *
     * @return
     */
    @Override
    public double calculaArea() {
        return (calculaPerimetre() * calculaApotema()) / 2;
    }

    /**
     * Metode per calcular el perimetre de un poligon regular.
     *
     * @return
     */
    @Override
    public double calculaPerimetre() {
        return costats * midacostat;
    }

    /**
     * Metode per calcular l'apotema d'un poligon regular.
     *
     * @return
     */
    public double calculaApotema() {
        double apotema = midacostat / (2 * Math.tan((360 / costats) / 2));
        return apotema;
    }

    /**
     * Metode per mostrar per pantalla nom, nombre de costats, perimetre i area
     * del(s) poligons(s) regular(s) Formateja la sortida a dos decimals.
     *
     * @return
     */
    @Override
    public String toString() {
        return "Regular{nom= " + nom + " costats= " + df.format(costats) + " midacostats= " + df.format(midacostat) + " area= " + df.format(calculaArea()) + " perimetre= " + df.format(calculaPerimetre()) + '}';
    }

}
