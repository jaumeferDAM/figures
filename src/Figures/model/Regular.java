package Figures.model;

/**
 *
 * @author ALUMNEDAM
 */
public class Regular extends Poligon {

    double midacostat;

    /**
     * @param midacostat
     * @param costats
     * @param nom
     */
    public Regular(String nom,double midacostat, int costats) {
        super(nom, costats);
        this.midacostat = midacostat;
    }

    @Override
    public double calculaArea() {
        return (calculaPerimetre() * calculaApotema()) / 2;
    }

    @Override
    public double calculaPerimetre() {
        return costats * midacostat;
    }

    public double calculaApotema() {
        double apotema = midacostat / (2 * Math.tan((360 / costats) / 2));
        return apotema;
    }


    /**
     * @return
     */
    @Override
    public String toString() {
        return "Regular{nom= " + nom + " costats= " + df.format(costats) + " midacostats= " + df.format(midacostat) + " area= " + df.format(calculaArea()) + " perimetre= " + df.format(calculaPerimetre()) + '}';
    }

}
