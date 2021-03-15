/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_02_18_aplicacionnomina;

/**
 *
 * @author aa523
 */
public class Empleado {
    
    //atributos
    private String nombre;
    private int diasTrabajados;
    private double sueldoDiario;
    private int horasExtra;
    private double porcentajeImpuesto;
    
    //constructores
    public Empleado(){
        nombre = "NoId";
        diasTrabajados = 0;
        sueldoDiario = 0;
        horasExtra = 0;
        porcentajeImpuesto = 0;
    }
    
    public Empleado(String nom, int diasTrab, double sueDia, int horExt, double porcImp){
        nombre = nom;
        diasTrabajados = diasTrab;
        sueldoDiario = sueDia;
        horasExtra =  horExt;
        porcentajeImpuesto = porcImp;
    }
    
    //metodos get/set
    public void setNombre(String nom){
        nombre = nom;
    }
    
    public void setDiasTrabajados(int diasTrab){
        diasTrabajados = diasTrab;
    }
    
    public void setSueldoDiario(double sueDia){
        sueldoDiario = sueDia;
    }
    
    public void setHorasExtras(int horas){
        horasExtra = horas;
    }
    
    public void setPorcentajeImpuesto(double porcImp){
        porcentajeImpuesto = porcImp;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getDiasTrabajados(){
        return diasTrabajados;
    }
    
    public double getSueldoDiario(){
        return sueldoDiario;
    }
    
    public int getHorasExtras(){
        return horasExtra;
    }
    
    public double getPorcentajeImpuesto(){
        return porcentajeImpuesto;
    }
    
    @Override
    public String toString(){
        return nombre+
                "    Dias Trab: "+diasTrabajados+
                "    Sueldo Día: "+sueldoDiario+
                "    Horas Ext: "+horasExtra+
                "    % Impuesto: "+porcentajeImpuesto;
    }
    
    public double sueldoParcial(){
        return diasTrabajados*sueldoDiario;
    }
    
    public double importeHorasExtra(){
        return sueldoDiario/8*horasExtra*2;
    }
    
    public double sueldoBruto(){
        return sueldoParcial()+importeHorasExtra();
    }
    
    public double importeImpuesto(){
        return sueldoBruto()* porcentajeImpuesto /100;
    }
    
    public double sueldo(){
        return sueldoBruto()-importeImpuesto();
    }
    
    
}
