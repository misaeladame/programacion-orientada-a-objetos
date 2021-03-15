package pa_18131209_proyecto_02;

/**
 *
 * @author José Misael Adame Sandoval
 */
class Empresa {
    
    // Atributo
    private Cultivo [] negocio;
    
    // Constructor
    public Empresa(int n) 
    {
        negocio = new Cultivo[n];
        
        for(int i=0; i<negocio.length; i++)
            negocio[i] = new Cultivo();
    }
    
    // Métodos get/set
    public void setCultivo(Cultivo e, int posicion) 
    {
        negocio[posicion] = e;
    }
    
    public Cultivo getCultivo (int posicion) 
    {
        return negocio[posicion];
    }
    
    // Métodos de proceso
    
    // Método en donde se ordena descendentemente la Produccion de los cultivos
    public void ordenarProduccion() 
    {
        for (int i=0; i<negocio.length-1; i++)
            for(int j=i+1; j<negocio.length; j++)
                if(negocio[i].produccionMensual().librasTotales() <
                   negocio[j].produccionMensual().librasTotales())
                {
                    Cultivo aux = negocio[i];
                    negocio[i] = negocio[j];
                    negocio[j] = aux;
                }
    }
    
    // Método en donde se ordena Alfabeticamente (de A a Z) la Producción
    public void ordenarAlfabetico()
    {
        for (int i=0; i<negocio.length-1; i++)
            for(int j=i+1; j<negocio.length; j++)
                if(negocio[i].getNombre().compareTo(negocio[j].getNombre()) > 0)
                {
                    Cultivo aux = negocio[i];
                    negocio[i] = negocio[j];
                    negocio[j] = aux;
                }
    }    
}
