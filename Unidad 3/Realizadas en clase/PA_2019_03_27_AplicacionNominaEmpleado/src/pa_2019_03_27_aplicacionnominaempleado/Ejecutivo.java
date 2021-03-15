/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_03_27_aplicacionnominaempleado;

/**
 *
 * @author aa517
 */
public class Ejecutivo extends Administrativo {
    
    private double bono;
    
    public Ejecutivo(){
        super();
        bono = 0;
    }
    
    public Ejecutivo(int num, String nom, int diasT, double sueldo, double bono){
        super(num, nom, diasT, sueldo);
        this.bono = bono;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
    
    public String toString(){
        return super.toString()+" Bono:"+bono;
    }
    
    public double sueldo(){
        return super.sueldo() + bono;
    }
    
}
