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
public class Empleado {
    
    private int numero;
    private String nombre;
    
    public Empleado(){
        numero = 0;
        nombre = "NoId";
    }
    
    public Empleado(int n, String nom){
        numero = n;
        nombre = nom;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNumero(int n){
        numero = n;
    }
    
    public void setNombre(String nom){
        nombre = nom;
    }
    
    public String toString(){
        return numero+" - "+nombre;
    }
    
    public double sueldo(){
        return 0;
    }
    
}
