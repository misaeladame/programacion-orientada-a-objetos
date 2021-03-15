/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_18131209_proyecto_01;

// librerias usadas
import java.util.Random;

/**
 *
 * @author José Misael Adame Sandoval
 */
class Nombre
{
    // Atributos
    private static Random azar = new Random();
    private static String [] nom = {"A-18","B-12","C-45","D-43","E-43", "F-98", 
                                    "G-43","H-32","I-76","J-24"};

    // Se retorna el nombre aleatorio del arreglo con este método
    static public String nextNombre()
    {
        return nom[azar.nextInt(nom.length)]; 
    }
}


    

