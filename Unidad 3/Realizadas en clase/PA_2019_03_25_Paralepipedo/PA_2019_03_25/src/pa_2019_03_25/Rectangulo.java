fttu/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_03_25;

/**
 *
 * @author aa523
 */

public class Rectangulo extends Linea {
    protected double alto;
    
    public Rectangulo(){
        largo = 0;
        alto = 0;
    }
    public Rectangulo(double lar, double alt){
        largo = lar;
        alto = alt;
    }
    
    public String toString(){
        return "Largo:"+largo+" Alto:"+alto;
    }

    public double perimetro(){
        return (largo * alto) *2;
    }
    public double area(){
        return largo*alto;
    }
}
