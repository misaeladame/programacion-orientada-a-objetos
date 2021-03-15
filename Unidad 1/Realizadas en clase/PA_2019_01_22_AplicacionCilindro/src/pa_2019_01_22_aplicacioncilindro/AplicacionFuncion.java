/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_01_22_aplicacioncilindro;

import java.util.Scanner;

/**
 *
 * @author aa528
 */
public class AplicacionFuncion {
   
    public static void main(String[] args) {
        // declaracion de variables
        double radio, altura, area, volumen;
        
        // entrada de datos
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Radio: ");
        radio = teclado.nextDouble();
        
        System.out.print("Altura: ");
        altura = teclado.nextDouble();
   
        // Proceso
        volumen = volumenCilindro (radio, altura);
        area = areaCilindro(radio, altura);
        
        // salida 
        System.out.println("Area = " +area);
        System.out.println("Volumen = " +volumen);
        
        System.out.println();
        System.out.print("Radio de bote de pintura: ");
        double radioBote = teclado.nextDouble();
        
        System.out.print("Altura de lata de pintura: ");
        double alturaBote = teclado.nextDouble();
        
        System.out.println("Volumen del litro de pintura: " +volumenCilindro(radio, altura));
        
        System.out.println();
        System.out.println("Volumen del tanque: " +volumenCilindro(30, 71));
        
    }
    
    public static double volumenCilindro (double r, double h)
    {
        double v;
        v = Math.PI * Math.pow(r, 2) * h;
        return v;
    }
    
    public static double areaCilindro (double r, double h) 
    {
        return 2 * Math.PI * r * (r + h);
    }
}
    
