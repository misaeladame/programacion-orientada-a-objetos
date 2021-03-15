/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_18131209_proyecto_01;

/**
 *
 * @author José Misael Adame Sandoval
 */
class Circuito 
{
    // atributos
    private String nombre;
    private double impedancia;
    private double reactanciaInductiva;
    private double reactanciaCapacitiva;

    // constructores
    public Circuito()
    {
        nombre = "NoId";
        impedancia = 0;
        reactanciaInductiva = 0;
        reactanciaCapacitiva = 0;
    }
    
    public Circuito(String nom, double imp, double rind, double rcap)
    {
        nombre = nom;
        impedancia = imp;
        reactanciaInductiva = rind;
        reactanciaCapacitiva = rcap;
    }

    // métodos get/set
    public void setNombre(String nom)
    {
        nombre = nom;
    }
    
    public void setImpedancia(double imp)
    {
        impedancia = imp;
    }
    
    public void setReactanciaInductiva(double rind)
    {
        reactanciaInductiva = rind;
    }
    
    public void setReactanciaCapacitiva(double rcap)
    {
        reactanciaCapacitiva = rcap;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public double getImpedancia()
    {
        return impedancia;
    }
    
    public double getReactanciaInductiva()
    {
        return reactanciaInductiva;
    }
    
    public double getReactanciaCapacitiva()
    {
        return reactanciaCapacitiva;
    }
    
    
    public String toString()
    {
        return nombre +
               "   Impedancia: " + impedancia + 
               "   Reac Inductiva: " + reactanciaInductiva + 
               "   Reac Capacitiva: " + reactanciaCapacitiva; 
    }

    // métodos de proceso o cálculo
    public double resistencia()
    {
        return Math.sqrt(Math.pow(impedancia,2)-Math.pow(reactanciaInductiva-
                         reactanciaCapacitiva, 2));
    } 
}
