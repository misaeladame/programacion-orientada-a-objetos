/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author terry
 */
public class Experimento {
    // Atributos
    private double masa;
    private double aceleracion;
    
    // Constructores
    public Experimento() 
    {
        masa = 0;
        aceleracion = 0;
    }
    
    public Experimento(double m, double acel) 
    {
        masa = m;
        aceleracion = acel;
    }
    
    // Métodos get/set
    public void setMasa (double m) 
    {
        masa = m;
    }
    
    public void setAceleracion (double acel) 
    {
        aceleracion = acel;
    }
    
    public double getMasa() 
    {
        return masa;
    }
    
    public double getAceleracion() 
    {
        return aceleracion;
    }
    
    // Método de cálculo
    public double fuerza() 
    {
        return masa*aceleracion;
    }
}
