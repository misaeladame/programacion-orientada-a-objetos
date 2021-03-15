package pa_18131209_proyecto_02;

/**
 *
 * @author José Misael Adame Sandoval
 */
class Cultivo 
{
    // Atributos
    private String nombre;
    private Produccion inicial;
    private Produccion finall;
    private double precio;
    
    // Constructores
    public Cultivo() 
    {
        nombre = "NoId";
        inicial = new Produccion();
        finall = new Produccion();
        precio = 0;
    }
    
    public Cultivo(String nom, Produccion ini, Produccion fin, double pr) 
    {
        nombre = nom;
        inicial = new Produccion(ini);
        finall = new Produccion(fin);
        precio = pr; 
    }
    
    // Métodos get/set
    public void setNombre (String nom) 
    {
        nombre = nom;
    }
    
    public void setInicial (Produccion ini) 
    {
        inicial = new Produccion(ini);
    }
    
    public void setFinal (Produccion fin) 
    {
        finall = new Produccion(fin);
    }
    
    public void setPrecio (double pr) 
    {
        precio = pr;
    }
    
    public String getNombre() 
    {
        return nombre;
    }
    
    public Produccion getInicial() 
    {
        return inicial;
    }
    
    public Produccion getFinal() 
    {
        return finall;
    }
    
    public double getPrecio() 
    {
        return precio;
    }
    
    // Métodos de proceso o cálculo
    public Produccion produccionMensual() 
    {
        return finall.resta(inicial);
    }   
    
    public double importe() 
    {
        return produccionMensual().librasTotales() * precio;
    }
}
