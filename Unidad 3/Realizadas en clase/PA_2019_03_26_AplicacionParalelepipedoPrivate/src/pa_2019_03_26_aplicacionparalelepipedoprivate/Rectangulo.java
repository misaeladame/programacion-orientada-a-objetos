/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_03_26_aplicacionparalelepipedoprivate;

/**
 *
 * @author aa523
 */

public class Rectangulo extends Linea {
    private double alto;
    
    public Rectangulo(){
        super(0); //llamadao al constructor de la clase padre
        alto = 0;
    }
    public Rectangulo(double lar, double alt){
        super(lar);
        alto = alt;
    }
    
    
    public String toString(){
        return super.toString()+" Alto:"+getAlto();
    }

    public double perimetro(){
        return (getLargo() * getAlto()) *2;
    }
    public double area(){
        return getLargo()*getAlto();
    }

    public double getAlto() {
        return alto;
    }
}
