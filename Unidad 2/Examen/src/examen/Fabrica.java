/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author terry
 */
public class Fabrica {
    
    private String nombre;
    private Existencia inicial;
    private Existencia finall;
    
    public Fabrica() 
    {
        nombre = "NoId";
        inicial = new Existencia();
        finall = new Existencia();
    }
    
    public Fabrica(String nom, Existencia ini, Existencia fin) 
    {
        nombre = nom;
        inicial = new Existencia(ini);
        finall = new Existencia(fin);
    }
    
    public void setNombre(String nom) 
    {
        nombre = nom;
    }
    
    public void setInicial(Existencia ini) 
    {
        inicial = new Existencia(ini);
    }
    
    public void setFInal(Existencia fin) 
    {
        finall = new Existencia(fin);
    }
    
    public String getNombre() 
    {
        return nombre;
    }
    
    public Existencia getInicial() 
    {
        return inicial;
    }
    
    public Existencia getFinal() 
    {
        return finall;
    }
    
    public Existencia consumo() 
    {
        return finall.resta(inicial);
    }
}
