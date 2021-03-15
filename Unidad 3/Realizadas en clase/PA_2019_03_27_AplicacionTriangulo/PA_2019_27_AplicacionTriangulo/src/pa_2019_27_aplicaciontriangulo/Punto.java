/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_27_aplicaciontriangulo;

/**
 *
 * @author aa506
 */
public class Punto {
    //Atributos
    private double x;
    private double y;
    //Constructores
    public Punto(){
        x = 0;
        y = 0;
    }
    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Punto(Punto p){
        x = p.x;
        y = p.y;
    }
    //Metodos get/set
    public double getX(){
        return x;
    }
    public void setX(double x){
        this.x = x;
    }
    
    public double getY(){
        return y;
    }
    public void setY(double y){
        this.y = y;
    }
    
    @Override
    public String toString(){
        return "("+ x + "," + y +")";
    }
    
    //Métodos de procesamiento
    public double distancia(Punto p){
        return Math.sqrt(Math.pow( p.x-x,2) + Math.pow(p.y-y, 2));
    }
    public Punto medio(Punto p){
        Punto m = new Punto();
        m.setX((p.x+x)/2);
        m.setY((p.y+y)/2);
        
        return m;
    }
}
