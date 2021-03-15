package examen;

/**
 *
 * @author José Misael Adame Sandoval 
 */
public abstract class Transporte 
{
    protected int modelo;
    
    public Transporte() 
    {
        modelo = 0;
    }
    
    public Transporte(int mod) 
    {
        modelo = mod;
    }
    
    public void setModelo(int mod) 
    {
        modelo = mod;
    }
    
    public int getModelo() 
    {
        return modelo;
    }
    
    public abstract String mostrar();
}
