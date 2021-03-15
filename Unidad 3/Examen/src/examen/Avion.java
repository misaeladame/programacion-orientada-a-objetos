package examen;

/**
 *
 * @author José Misael Adame Sandoval
 */
public class Avion extends Transporte
{
    protected int pasajeros;
    
    public Avion() 
    {
        super();
        pasajeros = 0;
    }
    
    public Avion(int mod, int pas) 
    {
        super(mod);
        pasajeros = pas;
    } 
    
    public void setPasajeros(int pas) 
    {
        pasajeros = pas;
    }
    
    public int getPasajeros() 
    {
        return pasajeros;
    }
            
    @Override
    public String mostrar() 
    {
        return "Modelo: " +super.getModelo() +" Pasajeros: " +pasajeros;
    }
}
