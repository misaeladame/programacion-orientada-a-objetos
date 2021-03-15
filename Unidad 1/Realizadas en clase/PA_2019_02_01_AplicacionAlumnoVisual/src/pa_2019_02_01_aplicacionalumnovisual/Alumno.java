/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_02_01_aplicacionalumnovisual;

/**
 *
 * @author aa523
 */
public class Alumno {
    
    //Atributos
    private String nombre;
    private int asistencias;
    private int tareas;
    private int proyectos;
    private int examen;
    
    
    //Constructores
    public Alumno(){
        nombre = "No-ID";
        asistencias = 0;
        tareas = 0;
        proyectos = 0;
        examen = 0;
    }
    
    public Alumno(String nom, int asi, int tar, int pro, int exa){
        nombre = nom;
        asistencias = asi;
        tareas = tar;
        proyectos = pro;
        examen = exa;
    }
    
    public Alumno(Alumno a){
        nombre = a.nombre;
        asistencias = a.asistencias;
        tareas = a.tareas;
        proyectos = a.proyectos;
        examen = a.examen;
    }
    
    
    //get/set/ToString
    public String getNombre(){
        return nombre;
        
    }
    
    public int getAsistencias(){
        return asistencias;
    }
    
    public int getTareas(){
        return tareas;
    }
     
    public int getProyectos(){
        return proyectos;
    }
    
    public int getExamen(){
        return examen;
    }
    
    public void setNombre(String n){
        nombre = n;
    }
    
    public void setAsistencias(int a){
        if (a<0)
            asistencias = a*-1;
        else
        asistencias = a;
    }
    
    public void setTareas(int t){
        tareas = Math.abs(t);
    }
    
    public void setProyectos(int p){
        proyectos = p;
    }
    
    public void setExamen(int e){
        examen = e;
    }
    
    @Override
    public String toString(){
       return nombre + 
               "   Asist: "+asistencias+
               "   Tareas: "+tareas+
               "   Proy: "+proyectos+
               "   Examen: "+examen;
    }
    
    //Métodos de cálculo
    public double Calificacion(){
        return asistencias*0.06+tareas*.12+proyectos*.22+examen*.6;
    }
    
}
