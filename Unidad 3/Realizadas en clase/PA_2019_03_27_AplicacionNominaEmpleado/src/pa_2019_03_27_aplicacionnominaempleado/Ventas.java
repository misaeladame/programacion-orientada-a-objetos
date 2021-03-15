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
public class Ventas extends Empleado{
    private double ventasTot;
    private double comision;
    
    public Ventas(){
        super();
        ventasTot = 0;
        comision = 0;
    }    
    
    public Ventas(int num, String nom, double vtaTot, double comision){
        super(num,nom);
        ventasTot = vtaTot;
        this.comision = comision;
    }

    public double getVentasTot() {
        return ventasTot;
    }

    public void setVentasTot(double ventasTot) {
        this.ventasTot = ventasTot;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
    
    public String toString(){
        return super.toString()+"  Ventas tot:"+ventasTot+"  %Comision:"+comision;
    }
    
    public double sueldo(){
        return ventasTot * comision / 100;
    }
    
}
