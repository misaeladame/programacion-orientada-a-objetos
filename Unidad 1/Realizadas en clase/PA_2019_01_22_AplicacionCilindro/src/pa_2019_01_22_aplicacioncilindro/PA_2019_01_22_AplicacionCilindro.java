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
public class PA_2019_01_22_AplicacionCilindro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // declaracion de variables
        double radio, altura, area, volumen;
        
        // entrada de datos
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Radio: ");
        radio = teclado.nextDouble();
        
        System.out.print("Altura: ");
        altura = teclado.nextDouble();
        
        // proceso
        volumen = Math.PI * Math.pow(radio, 2) * altura;
        area = 2 * Math.PI * radio * (radio + altura);
        
        // salida 
        System.out.println("Area = " +area);
        System.out.println("Volumen = " +volumen);
        
    }
    
}
