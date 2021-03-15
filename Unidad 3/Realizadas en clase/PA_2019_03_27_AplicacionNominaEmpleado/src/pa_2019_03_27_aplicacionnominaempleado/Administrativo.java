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
public class Administrativo extends Empleado{
    
    private int diasTrab;
    private double sueldoDia;
    
    public Administrativo(){
        super();
        diasTrab = 0;
        sueldoDia = 0;
    }
    
    public Administrativo(int num, String nom, int diasT, double sueldo){
        super(num, nom);
        diasTrab = diasT;
        sueldoDia = sueldo;
    }

    public int getDiasTrab() {
        return diasTrab;
    }

    public void setDiasTrab(int diasTrab) {
        this.diasTrab = diasTrab;
    }

    public double getSueldoDia() {
        return sueldoDia;
    }

    public void setSueldoDia(double sueldoDia) {
        this.sueldoDia = sueldoDia;
    }
    
    @Override
    public String toString(){
        return super.toString()+" Dias Trab:"+diasTrab+" Sueldo Dia:"+sueldoDia;
    }
    
    public double sueldo(){
        return diasTrab * sueldoDia;
    }
    
}
