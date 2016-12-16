/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figures.vista;

import Figures.control.GestioFigures;
import java.util.Scanner;

/**
 *
 * @author Jaume
 */
public class InterficieText {
//Variables, incialitzar classes

    private GestioFigures gestioFigures;
    private Scanner lector = new Scanner(System.in);

    /**
     * Mostrar el primer menu al iniciar el programa Demana un int(opcio) i el
     * retorna.
     *
     * @return
     */
    public int menuInicial() {
        int opcio;
        do {
            System.out.println("Menu Principal\n"
                    + "1. Crear una nova figura. \n"
                    + "2. Llistar figures creades \n"
                    + "3. Modificar una figura \n"
                    + "4. sortir");
            opcio = lector.nextInt();
        } while (comprovarMenu(opcio));
        return opcio;
    }

    /**
     * Menu per crear una figura Demana un int(opcio) i el retorna.
     *
     * @return
     */
    public int menu() {
        int opcio;
        do {
            System.out.println("Quina figura vols crear?: \n"
                    + " 1. REGULAR \n"
                    + " 2. CERCLE. \n"
                    + " 3. ROMBE. \n"
                    + " 4. TRAPEZI \n"
                    + " 5. SORTIR");
            opcio = lector.nextInt();
        } while (comprovarMenu(opcio));

        return opcio;
    }

    /**
     * Menu per veure les figures ja creades Demana un int(opcio) i el retorna.
     *
     * @return
     */
    public int menuVeureFigura() {
        int opcio;
        do {
            System.out.println("\nQuina figura vols veure?\n"
                    + "1- Cercle\n"
                    + "2- Regular\n"
                    + "3- Rombe\n"
                    + "4- Trapezi\n"
                    + "5- Totes\n"
                    + "6- Tornar enrere");
            opcio = lector.nextInt();
        } while (comprovarMenu(opcio));
        return opcio;
    }

    /**
     * Comprova si l'opcio introduida esta dintre dels valors del menu inical.
     *
     * @param opcio
     * @return
     */
    public boolean comprovarMenu(int opcio) {
        boolean comprovar = true;

        //Si es compleix la condició el boolean serà False, per a qe així pugui sortir del bucle que es troba en "menu".
        if (opcio > 0 && opcio < 6) {
            comprovar = false;
        }

        return comprovar;
    }

    /**
     * Menu per editar una figura Demana un int(opcio) i el retorna.
     *
     * @return
     */
    public int menuEditarFigura() {
        int opcio = 0;
        do {
            System.out.println("Quina figura vols editar?\n"
                    + "");
        } while (4 == 3);
        return opcio;
    }

//    public boolean comprovarMenuString(String cadena) {
//        boolean comprovar = true;
//
//        if (!"".equals(cadena)) {
//            comprovar = true;
//        }
//        return comprovar;
//    }
    /**
     * Demanar el nom de la figurn i retorna un String.
     *
     * @return
     */
    public String nombreFG() {
        System.out.println("Introdueix el nom de la figura: ");
        return lector.next();
    }

    /**
     * Demana el nombre de costats i torna un int.
     *
     * @return
     */
    public int respostaCostats() {
        System.out.println("Introdueix el total de costats ");
        return lector.nextInt();
    }

    /**
     * Demana la mida d'un costat i torna un double.
     *
     * @return
     */
    public double respostaMida() {
        System.out.println("Introdueix la mida de un costat ");
        return lector.nextDouble();
    }

    /**
     * Demana l'altura i torna un double.
     *
     * @return
     */
    public double respostaAltura() {
        System.out.println("Introdueix l'altura");
        return lector.nextDouble();
    }

    /**
     * Demana la diagonal i torna un double.
     *
     * @return
     */
    public double demanarDiagonal() {
        System.out.println("introdueix la diagonal mayor/menor");
        return lector.nextDouble();
    }

    /**
     * Demana el radi i torna un double.
     *
     * @return
     */
    public double radi() {
        System.out.println("introdueix el radi");
        return lector.nextDouble();
    }
}
