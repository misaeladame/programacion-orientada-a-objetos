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
public class Circulo implements IFiguraPlana{
    private double radio;

    public Circulo() {
        radio=0;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Radio" + "Circulo=" + radio ;
    }

    @Override
    public double area() {
       return PII*Math.pow(radio,2);
    }

    @Override
    public double perimetro() {
        return 2*PII*radio;
    }
    
    
}
