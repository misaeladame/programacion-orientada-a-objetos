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
public class Empresa 
{
    private Empleado [] negocio;
    
    public Empresa(int n) 
    {
        negocio = new Empleado[n];
        
        for(int i=0; i<negocio.length; i++)
            negocio[i] = new Empleado();
        
    }
    
    public void setEmpleado(Empleado e, int posicion) 
    {
        negocio[posicion] = e;
    }
    
    public Empleado getEmpleado(int posicion) 
    {
        return negocio[posicion];
    }
    
    public void ordenar() 
    {
        for (int i=0; i<negocio.length-1; i++)
            for(int j=i+1; j<negocio.length; j++)
                if(negocio[i].tiempoTrabajado().segundosTotales() <
                   negocio[j].tiempoTrabajado().segundosTotales())
                {
                    Empleado aux = negocio[i];
                    negocio[i] = negocio[j];
                    negocio[j] = aux;
                }
    }
    
}
