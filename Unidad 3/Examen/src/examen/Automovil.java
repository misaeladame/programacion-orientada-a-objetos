package examen;

/**
 *
 * @author terry
 */
public class Automovil extends Transporte 
{
    protected String transmision;
    
    public Automovil() 
    {
        super();
        transmision = "No especificado";
    }
    
    public Automovil(int mod, String trans) 
    {
        super(mod);
        transmision = trans;
    }
    
    public void setTransmision(String trans) 
    {
        transmision = trans;
    }
    
    public String getTransmision() 
    {
        return transmision;
    }
    
    @Override
    public String mostrar() 
    {
        return "Modelo: " +super.getModelo() +" Transmision: " +transmision;
    } 
}
