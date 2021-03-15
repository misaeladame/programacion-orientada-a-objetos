/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_02_13_aplicacionarregloencapsulado;

import java.util.Arrays;

/**
 *
 * @author aa532
 */
public class Arreglo {
    
    private double[] datos;
    
    public Arreglo(){
        datos = new double[10];
    }
    
    public Arreglo(int n){
        datos = new double[n];
    }
    
    public Arreglo(double []d){
        datos = new double[d.length];
        
        for(int i=0; i<d.length; i++)
            datos[i] = d[i];
    }
    
    //get/set/toString
    
    public double getValor(int posicion){
        if(posicion>=0 && posicion<datos.length)
            return datos[posicion];
        else
            return 0;        
    }
    
    public void setValor(double valor, int posicion){
        if(posicion>=0 && posicion<datos.length)
            datos[posicion] = valor;
    }
    
    public int getTamaño(){
        return datos.length;
    }
    
    @Override
    public String toString(){
        String cad = "{";
        for(int i=0; i<datos.length; i++){
            cad = cad + datos[i]+"";
            
            if(i<datos.length-1)
                cad = cad+",";
        }
        cad = cad + "}";
        return cad;
    }
    
    public double suma(){
        double total = 0;
        for(int i=0; i<datos.length; i++)
            total+= datos[i];
        return total;
    }
    
    public double promedio(){
        return this.suma()/this.datos.length;
    }
    
    public double mayor(){
        double may = datos[0];
        for(int i=1; i<datos.length; i++)
            if(datos[i]>may)
                may= datos[i];
        return may;
    }
    
    public double menor(){
        double men = datos[0];
        for(int i=1; i<datos.length; i++)
            if(datos[i]<men)
                men= datos[i];
        return men;
    }
    
    public double rango(){
        return mayor()-menor();
    }
    
    public double mediana(){
        
        double[] copia = arregloOrdenado();
        
        double med;
        if(datos.length % 2 == 0){
            //numweo sw elementos par
            med = (copia[copia.length/2]+copia[copia.length/2-1])/2;
        }else{
            //numero de elementos non
            return copia[(copia.length-1)/2];
        }
        return med;
    }
    
    public void ordenar(){
        Arrays.sort(datos);
    }
    
    public double[] arregloOrdenado(){
        
        double [] copia = new double [datos.length];
        
        for(int i=0; i<copia.length; i++)
            copia[i] = datos[i];
        
        Arrays.sort(copia);
        return copia;
    }
    
}
