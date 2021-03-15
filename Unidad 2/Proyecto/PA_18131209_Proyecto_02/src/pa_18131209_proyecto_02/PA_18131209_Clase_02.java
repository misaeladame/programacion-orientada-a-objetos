package pa_18131209_proyecto_02;

/**
 *
 * @author José Misael Adame Sandoval
 */
class Produccion 
{
    // Atributos
    private int toneladas;
    private int quintales;
    private int arrobas;
    private int libras;
    
    // Constructores
    public Produccion() 
    {
        toneladas = 0;
        quintales = 0;
        arrobas = 0;
        libras = 0;
    } 
    
    public Produccion(int ton, int quin, int arro, int lib) 
        
    {
        toneladas = ton;
        quintales = quin;
        arrobas = arro;
        libras = lib;
    }
    
    public Produccion(Produccion p) 
    {
        toneladas = p.toneladas;
        quintales = p.quintales;
        arrobas = p.arrobas;
        libras = p.libras;
    }
    
    // métodos get/set    
    public void setToneladas (int ton) 
    {
        toneladas = ton;
    }
    
    public void setQuintales (int quin) 
    {
        quintales = quin;
    }
    
    public void setArrobas (int arro)
    {
        arrobas = arro;
    }
    
    public void setLibras (int lib) 
    {
        libras = lib;
    }
    
    public int getToneladas()
    {
        return toneladas;
    }
    
    public int getQuintales() 
    {
        return quintales;
    }
    
    public int getArrobas() 
    {
        return arrobas;
    }
    
    public int getLibras() 
    {
        return libras;
    } 
    
    // Métodos de proceso o cálculo
    public int librasTotales() 
    {
        return toneladas * 2000 + quintales * 100 + arrobas * 25 + libras;
    }
    
    public Produccion suma(Produccion p) 
    {
        int libTot = librasTotales() + p.librasTotales();
        
        int ton = libTot / 2000; // div
        int restoQuin = libTot % 2000; // mod
        int quin = restoQuin / 100; // div
        int restoArro = restoQuin % 100; // mod
        int arro = restoArro / 25; // div
        int lib = restoArro % 25; // mod
        
        return new Produccion(ton, quin, arro, lib);                
    }

    public Produccion resta(Produccion p) 
    {
        int libTot = librasTotales() - p.librasTotales();
        
        int ton = libTot / 2000; // div
        int restoQuin = libTot % 2000; // mod
        int quin = restoQuin / 100; // div
        int restoArro = restoQuin % 100; // mod
        int arro = restoArro / 25; // div
        int lib = restoArro % 25; // mod
        
        return new Produccion(ton, quin, arro, lib);  
    }
}
