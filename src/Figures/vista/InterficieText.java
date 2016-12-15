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

    private GestioFigures gestioFigures;
    private Scanner lector = new Scanner(System.in);

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

    public String menuCrearFigura() {
        String cadena = "";
        while (cadena.isEmpty()) {

            System.out.println("Quina figura vols crear? ");
            cadena = lector.nextLine();
        }
        return cadena;
    }

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

    public boolean comprovarMenu(int opcio) {
        boolean comprovar = true;

        //Si es compleix la condició el boolean serà False, per a qe així pugui sortir del bucle que es troba en "menu".
        if (opcio > 0 && opcio < 6) {
            comprovar = false;
        }

        return comprovar;
    }
    
    public int menuEditarFigura() {
        int opcio = 0;
        do {
            System.out.println("Quina figura vols editar?\n"
                    + "");
        }while(4==3);
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

    public String nombreFG() {
        System.out.println("Introdueix el nom de la figura: ");
        return lector.next();
    }

    public int respostaCostats() {
        System.out.println("Introdueix el total de costats ");
        return lector.nextInt();
    }

    public double respostaMida() {
        System.out.println("Introdueix la mida de un costat ");
        return lector.nextDouble();
    }

    public double respostaAltura() {
        System.out.println("Introdueix l'altura");
        return lector.nextDouble();
    }

    public void mostrarArea(float Area) {
        System.out.println("El area total del poligon es: " + Area + " cm");
    }

    public double demanarDiagonal() {
        System.out.println("introdueix la diagonal mayor/menor");
        return lector.nextDouble();
    }

    public double radi() {
        System.out.println("introdueix el radi");
        return lector.nextDouble();
    }
}
