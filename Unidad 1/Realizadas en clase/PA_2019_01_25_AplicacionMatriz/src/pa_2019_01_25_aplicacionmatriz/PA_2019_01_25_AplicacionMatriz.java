/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_01_25_aplicacionmatriz;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aa509
 */
public class PA_2019_01_25_AplicacionMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Random azar = new Random();
        
        System.out.print("Número de filas: ");
        int filas = sc.nextInt();
        
        System.out.println("Número de columnas: ");
        int col = sc.nextInt();
        
        
        //.length devuelve renglones
        int [][] datos = new int [filas][col];
        int f,c;
        for(f=0; f<datos.length; f++)
            for(c=0; c<datos[0].length; c++)
                datos[f][c]=10+azar.nextInt(90);
        
        mostrarMatriz(datos);
        
        /*for(f=0; f<datos.length; f++){
            for(c=0; c<datos[0].length; c++)
                System.out.print(datos[f][c]+" ");
            System.out.println();
        
        }*/
        
        //Ordenamiento
        
        int [] copia = new int[datos.length*datos[0].length];
        
        int i=0;
        for(f=0; f<datos.length; f++)
            for(c=0; c<datos[0].length; c++){
                copia[i]=datos[f][c];
                i++;
            }
        
        i=0;
        for(f=0; f<datos.length; f++)
            for(c=0; c<datos[0].length; c++){
                datos[f][c]=copia[i];
                i++;
            }
        
        Arrays.sort(copia);
        
        System.out.println("\nArreglo ordenado\n");
        i=0;
        for(f=0; f<datos.length; f++){
            for(c=0; c<datos[0].length; c++)
                System.out.print(datos[f][c]+" ");
            System.out.println();
        
        }
    }
    
    public static void mostrarMatriz(int [][] m){
        for(int f=0; f<m.length; f++){
            for(int c=0; c<m[0].length; c++){
                System.out.print(m[f][c]+" ");
            }
            System.out.println();
        
    }
    }
}
