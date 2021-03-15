/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_02_07_aplicacionproducto;

/**
 *
 * @author aa526
 */
public class Producto {
    
    //atributos
    private String descripcion;
    private double costo,margenUtilidad, porcDescuento, porcImpuesto;
    
    //constructores
    public Producto(){
        descripcion = "No-Id";
        costo = 0;
        margenUtilidad = 0;
        porcDescuento = 0;
        porcImpuesto = 0;
    }
    
    public Producto(String d, double costo, double mu, double pd, double pi){
        descripcion = d;
        this.costo = costo;
        margenUtilidad = mu;
        porcDescuento = pd;
        porcImpuesto = pi;
    }
    
    
    //metodos get/set/toString
    public String getDescripcion(){
        return descripcion;
    }
    
    public double getCosto(){
        return costo;
    }
    
    public double getMargenUtilidad(){
        return margenUtilidad;
    }
    
    public double getPorcDescuento(){
        return porcDescuento;
    }
    
    public double getPorcImpuesto(){
        return porcImpuesto;
    }
    
    public void setDescripcion(String d){
        descripcion = d;
    }
    
    public void setCosto(double costo){
        this.costo = costo;
    }
    
    public void setMargenUtilidad(double mu){
        margenUtilidad = mu;
    }
    
    public void setPorcDescuento(double pd){
        porcDescuento = pd;
    }
    
    public void setPorcImpuesto(double pi){
        porcImpuesto = pi;
    }
    
    @Override
    public String toString(){
        return descripcion+"  Costo:"+costo+"  Margen_Utilidad:"+margenUtilidad+
                "%  Porc_Descuento:"+porcDescuento+"%  Porc_Impuesto:"+porcImpuesto;
    }
    
    
    //metodos de proceso
    public double importeUtilidad(){
        return costo * margenUtilidad/100;
    }
    
    public double subTot1(){
        return costo+ importeUtilidad();
    }
    
    public double importeDescuento(){
        return subTot1() * porcDescuento / 100;
    }
    
    public double subTot2(){
        return subTot1() - importeDescuento();
    }
    
    public double importeImpuesto(){
        return subTot2() * porcImpuesto / 100;
    }
    
    public double precio(){
        return subTot2() + importeImpuesto();
        
    }
    
}
