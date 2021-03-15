/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_05_03_aplicacionpila;

import java.util.Random;

/**
 *
 * @author terry
 */
public class PA_2019_05_03_AplicacionPilaGenerica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PilaGenerica<Double> pilaDobles = new PilaGenerica(6);
        
        Random azar = new Random();
        
        System.out.println(pilaDobles);
        
        while(!pilaDobles.estaLlena()) 
        {
            pilaDobles.poner(azar.nextInt(100)/1.0);
            System.out.println(pilaDobles);
        }
        
        
        
        vaciarPila(pilaDobles);
        
        String [] cosas = {"reloj","memoria","mouse", "lentes", "pizarron", "cañon", "mesa", "zapato",
                          "tenis", "laptop", "silla", "cpu", "pantalla", "maletín", "tablet", "convertidor",
                          "bolsa","lampara", "mochila", "borrador","marcador"};
        
        PilaGenerica<String> pilaCadenas = new PilaGenerica(7);
        
        
        System.out.println(pilaCadenas);
        
        while(!pilaCadenas.estaLlena()) 
        {
            pilaCadenas.poner(cosas[azar.nextInt(cosas.length)]);
            System.out.println(pilaCadenas);
        }
        
        vaciarPila(pilaCadenas);
        
        PilaGenerica<Character> pilaCaracter = new PilaGenerica(10);
        
        char[] signos = {'E', '2', 'f', '#', '9', '"', '8', '+', 'm', '*', '-'};
        
        while(!pilaCaracter.estaLlena()) 
        {
            pilaCaracter.poner(signos[azar.nextInt(cosas.length)]);
            System.out.println(pilaCaracter);
        }
        
        vaciarPila(pilaCaracter);
        
        Automovil [] lotes = {
                                new Automovil("Vocho", 2003),
                                new Automovil("Tsuru", 2008),
                                new Automovil("Ford", 1999),
                                new Automovil("Chevy", 2018),
                                new Automovil("Nissan", 2014),
                                new Automovil("Escape", 2007),
                                new Automovil("Frontier", 2015),
                                new Automovil("Porsche", 2002),
                                new Automovil("Fiesta", 1975),
                                new Automovil("Mustang", 2010),
                                new Automovil("Ferrari", 2008)
                            };
        
        PilaGenerica<Automovil> pilaAutos = new PilaGenerica(5);
        
        
        System.out.print(pilaAutos);
        
        while(!pilaAutos.estaLlena()) 
        {
            pilaAutos.poner(lotes[azar.nextInt(cosas.length)]);
            System.out.println(pilaAutos);
        }
        
        vaciarPila(pilaAutos);
    }
    
    public static void vaciarPila(PilaGenerica pila) 
    {
        while(!pila.estaVacia()) 
        {
            System.out.println(pila+" -> " +pila.quitar());
        }
        
        System.out.println(pila+"\n");
    }
    
}
