package pa_18131209_proyecto_04;

import java.util.Random;

/**
 *
 * @author terry
 */
class Color
{
    // Atributos
    private static Random azar = new Random();
    private static String [] col = {"Negro", "Verde", "Azul", "Rojo", "Gris", 
                                    "Amarillo", "Naranja", "Magenta", "Rosa"};
    
    // Se retorna el color aleatorio del arreglo con este método
    static public String nextColor() 
    {
        return col[azar.nextInt(col.length)];
    }
}
