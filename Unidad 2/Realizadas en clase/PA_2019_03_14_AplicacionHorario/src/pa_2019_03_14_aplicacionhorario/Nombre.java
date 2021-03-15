/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_03_14_aplicacionhorario;

import java.util.Random;

/**
 *
 * @author alope
 */
public class Nombre {
        private static Random azar = new Random();
        private static String [] nom = {"Juan","Luis","Maria","Laura","Pedro","Ruben","Diana","Patricia","Jesus"};
        private static String [] ape = {"Lopez","Garcia","Perez","Mendez","Ruiz","Gomez","Hernandez","Fernandez","Ortiz"};
        

    static public String nextNombre()
    {
        return nom[azar.nextInt(nom.length)] + " " + ape[azar.nextInt(ape.length)]; 
    }

    static public String nextNombreCompleto()
    {
        return nom[azar.nextInt(nom.length)] + " " +
                ape[azar.nextInt(ape.length)]+ " " +
                ape[azar.nextInt(ape.length)]; 
    }

    static public String nextNombreLegal()
    {
        return  ape[azar.nextInt(ape.length)] + " " +
                ape[azar.nextInt(ape.length)]+ " " +
                nom[azar.nextInt(nom.length)]; 
    }
}
