/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_02_26_aplicacionpunto;

/**
 *
 * @author aa507
 */
public class PA_2019_02_26_AplicacionPunto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Punto a = new Punto(3,5);
        Punto b = new Punto();
        
        b.setX(-4);
        b.setY(-2);
        Punto c = a.medio(b);
        Punto d = new Punto(a);//new objeto
        Punto e=a; //referencia
        
        
        System.out.println("La distancia entre "+a+" y "+b+" = "+a.distancia(b));
        System.out.println("Distancia = "+b.distancia(a));
        System.out.println("Punto medio de "+a+" y "+b+" = "+c);       
        System.out.println("Punto medio de "+c+" y "+a+" = "+c.medio(a));
        System.out.println("D = "+d);
        System.out.println("E = "+e);
        
        
    }
    
}
