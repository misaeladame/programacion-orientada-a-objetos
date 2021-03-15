package examen;

import java.util.Scanner;

/**
 *
 * @author José Misael Adame Sandoval
 */
public class Examen 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántos objetos quieres?");
        int n = sc.nextInt();
        
        Transporte arreglo [] = new Transporte[n];
        
        for(int i = 0; i<arreglo.length; i++) 
        {
            System.out.println("Escribe 0 si quiere avion o 1 siquiere automvil "
                               + "para el objeto " +(i+1));
            int tipo = sc.nextInt();
            sc = new Scanner(System.in);
            if(tipo == 0) 
            {
                System.out.println("Especifica modelo y pasajeros del avion ");
                int mod = sc.nextInt();
                int pas = sc.nextInt();
                arreglo[i] = new Avion(mod, pas);
            }
            else
            sc = new Scanner(System.in);
            {
                System.out.println("Especifica modelo y transmision del "
                                   + "automovil");
                int mod = sc.nextInt();
                String trans = sc.nextLine();
                arreglo[i] = new Automovil(mod, trans);
            }
        }
        
        for(int i = 0; i<arreglo.length-1; i++ )
        {
            for(int j=i+1; j<arreglo.length; j++) 
            {
                if(arreglo[i].getModelo() > arreglo[i].getModelo())
                {
                    Transporte aux = arreglo[i];
                    arreglo[i] = arreglo [j];
                    arreglo[j] = aux;
                            
                }
            }
        }
        
        for(int i =0; i<arreglo.length; i++)
        {
            System.out.println(arreglo[i].mostrar());
        }
    }
    
}
