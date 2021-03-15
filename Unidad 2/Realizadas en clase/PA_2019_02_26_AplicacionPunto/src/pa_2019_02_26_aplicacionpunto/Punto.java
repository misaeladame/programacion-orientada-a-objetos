/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_02_26_aplicacionpunto;

/**
 *
 * @author aa507
 */
public class Punto {
    private double x;
    private double y;
    
    public Punto(){
        x=0;
        y=0;
    }
    
    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public Punto(Punto p){
        x = p.x;
        y = p.y;
    }
    
    
    //metodos get/set
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    public void setX(double x){
        this.x = x;
    }
    
    public void setY(double y){
        this.y = y;
    }
    
    public String toString(){
        return "("+x+", "+y+")";
    }
    
    
    //metodo de proceso
    public double distancia(Punto p){
        return Math.sqrt(Math.pow(p.x-x, 2)+Math.pow(p.y-y, 2));
    }
    
    public Punto medio(Punto p){
        Punto m = new Punto();
        m.setX((x+p.x)/2);
        m.setY((y+p.y)/2);
        return m;
    }
    
}
