package pa_18131209_proyecto_02;

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
    private static String [] nom = {"Trigo", "Maíz", "Algodón", "Uvas", 
                                    "Frijol", "Sorgo", "Melón", "Sandía",
                                    "Manzana", "Fresa", "Chile", "Ciruela",
                                    "Tamarindo", "Guayaba" , "Plátano", 
                                    "Aguacate", "Nopal", "Papa", "Cebolla",
                                    "Brocoli"};
    
    // Se retorna el nombre aleatorio del arreglo con este método
    static public String nextNombre() 
    {
        return nom[azar.nextInt(nom.length)];
    }
}
