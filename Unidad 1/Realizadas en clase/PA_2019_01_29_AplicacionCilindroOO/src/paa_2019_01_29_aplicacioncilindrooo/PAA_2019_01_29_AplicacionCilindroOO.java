/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paa_2019_01_29_aplicacioncilindrooo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aa526
 */
public class PAA_2019_01_29_AplicacionCilindroOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Radio de la lata : ");
        double radioLata = sc.nextDouble();
        
        System.out.print("Altura de la lata : ");
        double alturaLata = sc.nextDouble();
        
        Cilindro lata = new Cilindro(radioLata,alturaLata);
        
        //lata.setRadio(radioLata);
        //lata.setAltura(alturaLata);
        
        System.out.println("\nArea de la lata = "+lata.area());
        System.out.println("Volumen de la lata = "+lata.volumen());
        
        
        Cilindro bote = new Cilindro();
        
        bote.setRadio(6);
        bote.setAltura(15);
        System.out.println("\nVolumen del bote = "+bote.volumen());
        
        Cilindro coca = lata; //Referencia
        coca.setRadio(1000);
        
        System.out.println("Volumen de la lata = "+lata.volumen());
        
        
        Cilindro cualquiera = new Cilindro();
        Random azar = new Random();
        
        cualquiera.setRadio(azar.nextInt(100));
        cualquiera.setAltura(new Random().nextInt(100));
        
        System.out.println("\nArea cualquiera = "+cualquiera.area());
        System.out.println("Volumen cualquiera = "+cualquiera.volumen());
        
        System.out.println("\nRadio de cualquiera = "+cualquiera.getRadio());
        System.out.println("Altura de cualquiera = "+cualquiera.getAltura());
        
        //System.out.println(lata); //dirección de memoria
        System.out.println();
        System.out.println(lata.toString()); 
        System.out.println(bote);
        System.out.println(cualquiera);
        
        Cilindro [] cils = new Cilindro[4]; //arreglo objeto
        cils[0] = lata;
        cils[1] = bote;
        cils[2] = cualquiera;
        cils[3] = new Cilindro();
        
        cils[3].setRadio(100);
        
        
        System.out.println();
        
        for(int i=0; i<cils.length; i++){
            System.out.println("----------------------------");
            System.out.println("Area = "+cils[i].area());
            System.out.println("Volumen = "+cils[i].volumen());
            System.out.println(cils[i]);
        }
        
        Cilindro nuevo = new Cilindro(bote);
        System.out.println("-------------"+nuevo+"---------------");
        
    }
    
}
