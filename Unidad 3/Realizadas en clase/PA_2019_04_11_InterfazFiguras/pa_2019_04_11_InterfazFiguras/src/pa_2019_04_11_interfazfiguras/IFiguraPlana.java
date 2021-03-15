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
public interface IFiguraPlana {
    public static final double PII=3.141592654;//Atributo es public static final
    
    public abstract double area();//no es necesario el public abstract
    double perimetro();
}
