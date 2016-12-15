/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figures.control;

import Figures.model.Cercle;
import Figures.model.Figura;
import Figures.model.Regular;
import Figures.model.Rombe;
import Figures.model.Trapezi;
import Figures.vista.InterficieText;
import java.util.ArrayList;

/**
 *
 * @author Sonia
 */
public class GestioFigures {
//Variables

    public ArrayList<Figura> figures = new ArrayList<>();
    public InterficieText it = new InterficieText();

    /*
    * Comença el programa
     */
    public void inciar() {
        SeleccionarOpcioMenu();
    }

    /*
    * Menu incial on es demana un int i es fa un switch per saber si es vol 
    crear una figura, veure figures creades o editar figures.
     */
    public void SeleccionarOpcioMenu() {
        int accio = it.menuInicial();
        do {
            switch (accio) {

                case 1:
                    crearFigures();

                    break;
                case 2:
                    veureFigures();
                    break;
                case 3:
//                    editarFigura();
                case 4:
                    System.exit(0);
                default:
                    System.out.println("error");
            }
        } while (true);
    }

    public void crearFigures() {
        int accior = it.menu();
        do {
            switch (accior) {
                case 1:
                    crearRegular();
                    break;
                case 2:
                    crearCercle();
                    break;
                case 3: {
                    crearRombe();
                    break;
                }
                case 4: {
                    crearTrapezi();
                    break;
                }
                case 5:
                    System.exit(0);
                default:
                    System.out.println("error");
            }
        } while (true);
    }
/*
    Menu per veure figures on es demana un int per seleccionar quina figura 
    es vol veure.
    */
    public void veureFigures() {
        int accio = it.menuVeureFigura();
        do {
            switch (accio) {
                case 1:
                    for (Figura figure : figures) {
                        if (figure instanceof Cercle) {
                            System.out.println(figure);
                        }
                    }
                    break;
                case 2:
                    for (Figura figure : figures) {
                        if (figure instanceof Regular) {
                            System.out.println(figure);
                        }
                    }
                    break;
                case 3:
                    for (Figura figure : figures) {
                        if (figure instanceof Rombe) {
                            System.out.println(figure);
                        }
                    }
                    break;
                case 4:
                    for (Figura figure : figures) {
                        if (figure instanceof Trapezi) {
                            System.out.println(figure);
                        }
                    }
                    break;
                case 5:
                    for (Figura figure : figures) {
                        System.out.println(figure);
                    }
                    break;
                case 6:
                    SeleccionarOpcioMenu();
                default:
                    System.out.println("error");
                    break;
            }
            break;

        } while (true);
    }

    public void editarFigura() {
        int accio = it.menuEditarFigura();
        do {
            switch (accio) {

                case 1:
                    for (Figura figura : figures) {
                        if (figura instanceof Cercle) {
                            editarCercle();
                        }
                    }

            }

        } while (true);

    }

    /**
     * Crea un poligon regular i escriu el seu nom, el nombre de costats, i la
     * mida dels seus costats Afegeix el poligon regular a l'arraylist de
     * figures i torna al menu per seleccionar l'opcio seguent.
     */
    public void crearRegular() {
        String nom = nombreFigura();
        int costats = nombreCostats();
        double mida = midaCostat();
        Regular regular = new Regular(nom, mida, costats);
        figures.add(regular);
        System.out.println("Figura creada correctament");
        SeleccionarOpcioMenu();
    }

    /**
     * Crear un cercle i escriu el seu nom i el seu radi Afegeix el cercle a
     * l'arraylist de figures i torna al menu per seleccionar l'opcio seguent.
     */
    public void crearCercle() {
        Cercle cercle = new Cercle(it.nombreFG(), it.radi());
        figures.add(cercle);
        System.out.println("Figura creada correctament");
        SeleccionarOpcioMenu();

    }

    /**
     * Crear un rombe i escriu el seu nom, la diagonal major i la diagonal menor
     * Afegeix el rombe a l'arraylist de figures i torna al menu per seleccionar
     * l'opcio seguent.
     */
    public void crearRombe() {
        String nombre = it.nombreFG();
        double DiagonalMayor = it.demanarDiagonal();
        double DiagonalMenor = it.demanarDiagonal();
        Rombe rombe = new Rombe(nombre, DiagonalMayor, DiagonalMenor);
        figures.add(rombe);
        System.out.println("Figura creada correctament");
        SeleccionarOpcioMenu();
    }

    /**
     * Crear un trapezi i escriu el se nom, el nombre de costats, l'altura i
     * crea un arraylist amb el tamany de del nombre de costats i a cada element
     * posa-li la mida de un costat Afegeix el trapezi a l'arraylist de figures
     * i torna al menu per seleccionar l'opcio seguent.
     */
    public void crearTrapezi() {
        String nm = it.nombreFG();
        int costats2 = nombreCostats();
        double altura = it.respostaAltura();
        double midaCostats[] = new double[costats2];
        for (int i = 0; i < midaCostats.length; i++) {
            midaCostats[i] = it.respostaMida();
        }
        Trapezi trapezi = new Trapezi(altura, midaCostats, costats2, nm);
        figures.add(trapezi);
        System.out.println("Figura creada correctament");
        SeleccionarOpcioMenu();
    }

    /**
     * Demanar el nombre de una figura.
     *
     * @return
     */
    public String nombreFigura() {
        return it.nombreFG();
    }

    /**
     * Demanar el nombre de costats de una figura.
     *
     * @return
     */
    public int nombreCostats() {
        return it.respostaCostats();
    }

    /*
    * Demanar la mida de un costat de la figura.
     */
    public double midaCostat() {
        return it.respostaMida();
    }

    /*
    * Demanar les dues diagons del rombe.
     */
    public double diagonalsRombe() {
        return it.demanarDiagonal();
    }

    /*
    Demanar el radi de la figura cercle.
     */
    public double midaRadi() {
        return it.radi();
    }
}
