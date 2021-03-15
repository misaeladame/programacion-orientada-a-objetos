/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_01_24_aplicacionarreglo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aa512
 */
public class PA_2019_01_24_AplicacionArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Número de elementos: ");
        int n = teclado.nextInt();
        
        int [] datos = new int[n];
        
        Random azar = new Random();
        
        for(int i = 0; i<datos.length; i++)
        {
            datos[i] = azar.nextInt(1000);
            System.out.println(i +" -> " +datos[i]);
        }
        
        int suma = 0;
        for(int i = 0; i<datos.length; i++)
        {
            suma+=datos[i];
        }
        
        double promedio = suma / (datos.length*1.0);
        
        System.out.println("suma: " +suma);
        System.out.println("Promedio: " +promedio);
        
        int mayor = datos[0];
        int menor = datos[0];
        
        int posicionMayor = 0;
        int posicionMenor = 0;
        for(int i = 1; i<datos.length; i++)
        {
            if(datos[i]>mayor)
            {
                mayor = datos[i];
                posicionMayor = i;
            }
            
            if(datos[i]<menor)
            {
                menor = datos[i];
                posicionMenor = i;
            }
        }
        
        System.out.println("No. mayor: " +mayor);
        System.out.println("No. menor: " +menor);
        
        System.out.println();
        
        for(int i=0; i<datos.length; i++)
        {
            System.out.print(datos[i]);
            
            if(i==posicionMayor)
            {
                System.out.println(" <-- Mayor");
            }
            else
            {
                if(i==posicionMenor)
                {
                    System.out.println(" <-- Menor");
                }
                else 
                {
                    System.out.println();
                }
            }
              
        }
        // ordenamiento
        Arrays.sort(datos);    
        
        System.out.println("\nDatos ordenados ascendente:\n");
        for(int i = 0; i<datos.length; i++)
        {
            System.out.println(i +" -> " +datos[i]);
        }
        
        System.out.println("\nDatos ordenados descendente:\n");
        for(int i = datos.length-1; i>=datos.length; i--)
        {
            System.out.println(i +" -> " +datos[i]);
        }
    }
    
}
