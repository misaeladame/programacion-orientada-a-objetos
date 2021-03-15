/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_03_27_aplicacionnominaempleados;

/**
 *
 * @author alope
 */
public class Taller extends Empleado{
    private int piezas;
    private double precioUnit;
    
    public Taller()
    {
        super();
        piezas = 0;
        precioUnit = 0;
    }
    
    public Taller(int num, String nom, int pzas, double preUnit)
    {
        super(num,nom);
        piezas = pzas;
        precioUnit = preUnit;
    }
    
    public int getPiezas()
    {
        return piezas;
    }
    
    public double getPrecioUnitario()
    {
        return precioUnit;
    }
    
    public void setPiezas(int pzas)
    {
        piezas = pzas;
    }
    
    public void setPrecioUnitario(double preUnit)
    {
        precioUnit = preUnit;
    }
    
    public String toString()
    {
        return super.toString()+"  Piezas:"+piezas+"   Precio unit:"+precioUnit;
    }
    
    public double sueldo()
    {
        return piezas * precioUnit;
    }
}
