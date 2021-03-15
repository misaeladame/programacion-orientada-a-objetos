/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_04_11_interfazfiguras;

/**
 *
 * @author aa528
 */
public class Pa_2019_04_11_InterfazFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo vicioso = new Circulo(12);
        Rectangulo puerta= new Rectangulo(20,210);
        Triangulo fuentes=new Triangulo(8,12,15);
        
        System.out.println("Circulo: "+vicioso.area()+"       "+vicioso.perimetro()); 
        System.out.println("Rectangulo: "+puerta.area()+"       "+puerta.perimetro()); 
        System.out.println("Triangulo: "+fuentes.area()+"       "+fuentes.perimetro()); 
        
        System.out.println();
        mostrar(vicioso);
        mostrar(puerta);
        mostrar(fuentes);
        
        IFiguraPlana qwerty = new Triangulo(3,4,5);
    }
    public static void mostrar(IFiguraPlana fig){
        System.out.println("Area: "+fig.area()+" Perimetro: "+fig.perimetro());
    }
}
