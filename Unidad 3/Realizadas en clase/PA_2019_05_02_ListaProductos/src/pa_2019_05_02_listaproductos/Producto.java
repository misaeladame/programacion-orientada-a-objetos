/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_05_02_listaproductos;

/**
 *
 * @author terry
 */
public class Producto implements Comparable{

    public static int getTipoOrdenamiento() {
        return tipoOrdenamiento;
    }

    public static void setTipoOrdenamiento(int aTipoOrdenamiento) {
        tipoOrdenamiento = aTipoOrdenamiento;
    }
    private String descripcion;
    private int existencia;
    private double precio;
    private static int tipoOrdenamiento; // 0- Exist
                                         // 1- Precio
                                         // 2- Descr

    public Producto() {
        descripcion = "NoId";
        existencia = 0;
        precio = 0;
    }

    public Producto(String descripcion, int existencia, double precio) {
        this.descripcion = descripcion;
        this.existencia = existencia;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }
    
    
    public String toString() 
    {
        return descripcion+"exist: " +existencia +"$" +precio;
    }
    
    

    @Override
    public int compareTo(Object o) {
        Producto p = (Producto)o;
        
        int valor = 0;
        
        switch(tipoOrdenamiento) 
        {
            case 0:  // Existencia
                valor = existencia - p.existencia;
                
                break;
            
            case 1: // precio
                if(precio == p.precio)
                    valor = 0;
                else
                    if(precio > p.precio)
                        valor = 1;
                    else
                        valor = -1;
            break;
            
            case 2: // descripcion
                valor = descripcion.compareTo(p.descripcion);
                break;
        }
        return valor;
    }
}
