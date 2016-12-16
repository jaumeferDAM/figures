package Figures.model;

/**
 *
 * @author ALUMNEDAM
 */
public abstract class Poligon extends Figura {
//Varaibles

    protected int costats;

    public int getLados() {
        return costats;
    }

    public void setLados(int costats) {
        this.costats = costats;
    }

    /**
     * Constructor
     *
     * @param nom
     */
    public Poligon(String nom) {
        super(nom);
    }

    /**
     * @param nom
     * @param costats
     */
    public Poligon(String nom, int costats) {
        super(nom);
        this.costats = costats;
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
