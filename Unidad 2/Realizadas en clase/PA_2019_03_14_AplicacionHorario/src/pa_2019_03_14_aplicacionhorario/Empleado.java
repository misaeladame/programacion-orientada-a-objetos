/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_03_14_aplicacionhorario;

/**
 *
 * @author terry
 */
public class Empleado {
    private String nombre;
    private Horario entrada;
    private Horario salida;
    
    public Empleado() 
    {
        nombre = "NoId";
        entrada = new Horario();
        salida = new Horario();
    }
    
    public Empleado(String nom, Horario ent, Horario sal) 
    {
        nombre = nom;
        entrada = new Horario(ent);
        salida = new Horario(sal);
    }
    
    public String getNombre() 
    {
        return nombre;
    }
    
    public Horario getEntrada() 
    {
        return entrada;
    }
    
    public Horario getSalida() 
    {
        return salida;
    }
    
    public void setNombre(String nom)
    {
        nombre = nom;
    }
    
    public void setEntrada(Horario ent) 
    {
        entrada = new Horario(ent);
    }
    
    public void setSalida(Horario sal) 
    {
        salida = new Horario(sal);
    }
    
     public Horario tiempoTrabajado() 
    {
        return salida.resta(entrada);
    }
}
