/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_03_27_aplicacionnominaempleado;

/**
 *
 * @author aa509
 */
public class Taller extends Empleado{
    private int piezas;
    private double precioUnit;
    
    public Taller(){
        super();
        piezas = 0;
        precioUnit = 0;
    }
    
    public Taller(int num, String nom, int pzas, double preUnit){
        super(num,nom);
        piezas = pzas;
        precioUnit = preUnit;
    }

    public int getPiezas() {
        return piezas;
    }

    public void setPiezas(int piezas) {
        this.piezas = piezas;
    }

    public double getPrecioUnit() {
        return precioUnit;
    }

    public void setPrecioUnit(double precioUnit) {
        this.precioUnit = precioUnit;
    }
    
    public String toString(){
        return super.toString()+"  Piezas:"+piezas+"  Precio unit:"+precioUnit;
    }
    
    public double sueldo(){
        return piezas * precioUnit;
    }
    
}
