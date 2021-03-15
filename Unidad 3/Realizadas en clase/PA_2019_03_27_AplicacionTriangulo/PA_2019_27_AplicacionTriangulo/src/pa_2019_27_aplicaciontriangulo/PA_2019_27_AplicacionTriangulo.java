/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_27_aplicaciontriangulo;

/**
 *
 * @author aa509
 */
public class PA_2019_27_AplicacionTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Punto P = new  Punto(-2,3);
        Punto Q = new  Punto(-2,-4);
        Punto R = new  Punto(7,3);
        Punto M = new  Punto(7,-4);
        
        Triangulo T1 = new Triangulo(P,R,Q);
        
        Triangulo T2 = new Triangulo();
        T2.setPuntoA(R);
        T2.setPuntoB(M);
        T2.setPuntoC(Q);
        
        System.out.println("Área del rectángulo: "+(T1.area()+T2.area()) );
    }
    
}
