/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this t * and open the template in the editor.
emplate file, choose Tools | Templates
 */
package pa_2019_02_18_aplicacionnomina;

import java.util.Random;

/**
 *
 * @author aa527
 */
public class Nombre {
    private static Random azar = new Random();
    private static String [] nom = {"Juan","Luis","María","Laura","Pedro","Ruben","Diana","Patricia","Jesus","Misa","Jose"};
    private static String [] ape = {"Lopez","García","Perez","Mendez","Ruiz","Gomez","Hernandez","Fernandez","Ortiz"};
    
    
    static public String nextNombre(){
        return nom[azar.nextInt(nom.length)]+" "+ape[azar.nextInt(ape.length)];
    }
    
    static public String nextNombreCompleto(){
        return nom[azar.nextInt(nom.length)]+" "+ape[azar.nextInt(ape.length)]+" "+ape[azar.nextInt(ape.length)];
    }
    
    static public String nextNombreLegal(){
        return ape[azar.nextInt(ape.length)]+" "+ape[azar.nextInt(ape.length)]+" "+nom[azar.nextInt(nom.length)];
    }
    
}
