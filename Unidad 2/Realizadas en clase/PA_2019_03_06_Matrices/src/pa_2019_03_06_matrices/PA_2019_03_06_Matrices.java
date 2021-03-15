/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_03_06_matrices;

import java.util.Random;

/**
 *
 * @author aa527
 */
public class PA_2019_03_06_Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matriz uno = new Matriz(3,5);
        
        uno.setValor( 7, 0, 0);
        uno.setValor( 2, 0, 1);
        uno.setValor( 1, 0, 2);
        uno.setValor( 7, 0, 3);
        uno.setValor( 4, 0, 4);
        
        uno.setValor( 6, 1, 0);
        uno.setValor( 0, 1, 1);
        uno.setValor( -1, 1, 2);
        uno.setValor( 8, 1, 3);
        uno.setValor( 9, 1, 4);
        
        uno.setValor( 3, 2, 0);
        uno.setValor( 2, 2, 1);
        uno.setValor( 1, 2, 2);
        uno.setValor( 4, 2, 3);
        uno.setValor( 5, 2, 4);
        
        uno.mostrar();
        
        double [][] x = { {7, 0, 1, 2},
                          {6, 5, 4, 3}
                            };
        
        Matriz dos = new Matriz(x);
        
        dos.mostrar();
        
        dos.setValor(8, 1, 2);
        dos.setValor(1000, 7, 1);
        
        dos.mostrar();
        
        Matriz tres = uno.suma(dos);
        
        tres.mostrar();
        
        double [][] a = {
                          {2,5,7},
                          {8,2,6}
                        };
        
        double [][] b = {
                          {9,-1,3},
                          {8,2,10}
                        };   
        
        Matriz cuatro = new Matriz(a);
        Matriz cinco = new Matriz(b);
        
        Matriz seis = cuatro.suma(cinco);
        
        cuatro.mostrar();
        cinco.mostrar();
        seis.mostrar();
        
        Matriz siete = cinco.Multiplicacion(10);
        siete.mostrar();
        
        Matriz ocho = cuatro.resta(cinco);
        ocho.mostrar();
        
        Random azar = new Random();
        
        Matriz nueve = new Matriz(15,30);
        Matriz diez = new Matriz(15,30);
        
        for(int r = 0; r<nueve.getRenglones(); r++)
            for(int c = 0; c<nueve.getColumnas(); c++)
            {
                nueve.setValor(10+azar.nextInt(90), r, c);
                diez.setValor(10+azar.nextInt(90), r, c);
            }
        
        Matriz once = nueve.suma(diez);
        
        nueve.mostrar();
        diez.mostrar();
        once.mostrar();
    }
    
}
