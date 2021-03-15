/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2019_04_10_appnumeroscompuestos;

/**
 *
 * @author aa530
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Punto p = new Punto(-4,9);
        Fraccion f = new Fraccion(7,8);
        Complejo c = new Complejo(-3,2);
        NumeroCompuesto c2 = new Complejo(8,-3);
        
        System.out.println(p.desplegar());
        System.out.println(f.desplegar());
        System.out.println(c.desplegar());
        System.out.println(c2.desplegar());
        
        System.out.println();
        
        System.out.println(p.mostrar());
        System.out.println(f.mostrar());
        System.out.println(c.mostrar());
        System.out.println(c2.mostrar());
        
        System.out.println();
        
        NumeroCompuesto[] numeros = new NumeroCompuesto[4];
        
        numeros[0] = c2;
        numeros[1] = c;
        numeros[2] = f;
        numeros[3] = p;
        
        for (NumeroCompuesto n: numeros) 
        {
            System.out.println(n.mostrar()+"    "+n.desplegar());
        }
    }
    
}
