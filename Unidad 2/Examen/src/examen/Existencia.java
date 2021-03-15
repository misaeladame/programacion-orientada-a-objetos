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
public class Existencia 
{
    private int barriles;
    private int galones;
    
    public Existencia()
    {
        barriles = 0;
        galones = 0;
    }
    
    public Existencia(int bar, int gal) 
    {
        barriles = bar;
        galones = gal;
    }
    
    public Existencia(Existencia e) 
    {
        barriles = e.barriles;
        galones = e.galones;
    }
    
    public void setBarriles(int bar)
    {
        barriles = bar;
    }
    
    public void setGalones(int gal) 
    {
        galones = gal;
    }
    
    public int getBarriles() 
    {
        return barriles;
    }
    
    public int getGalones() 
    {
        return galones;
    }
    
    public String toString() 
    {
        return "Barriles: " +barriles + "gal: " +galones;
    }
    
    public int galonesTotales() 
    {
        return barriles*42+galones;
    }
    
    public Existencia suma(Existencia e) 
    {
        int galTot = galonesTotales() + e.galonesTotales();
        
        int bar = galTot/42;
        int gal = galTot % 42;
        
        return new Existencia(bar, gal);
    }
    
    public Existencia resta(Existencia e) 
    {
        int galTot = galonesTotales() - e.galonesTotales();
        
        int bar = galTot/42;
        int gal = galTot%42;
        
        return new Existencia(bar, gal);
        
    }
}
