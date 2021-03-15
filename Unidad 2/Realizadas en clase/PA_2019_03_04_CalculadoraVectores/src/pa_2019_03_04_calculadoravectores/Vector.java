/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_03_04_calculadoravectores;

/**
 *
 * @author aa535
 */
public class Vector {
    private double magnitud;
    private double angulo;
    
    public Vector(){
        magnitud = 0;
        angulo = 0;
    }
    
    public Vector(double mag, double ang){
        magnitud = mag;
        angulo = ang;
    }
    
    public void setMagnitud(double mag){
        magnitud = mag;
    }
    
    public void setAngulo(double ang){
        angulo = ang;
    }
    
    public void setRadianes(double rad){
        angulo = rad*180/Math.PI;
    }
    
    public void setXY(double x, double y){
        magnitud = Math.sqrt((x*x)+(y*y));
        setRadianes (Math.atan2(y, x));
                
    }
    
    public double getMagnitud(){
        return magnitud;
    }
    
    public double getAngulo(){
        return angulo;
    }
    
    public double getRadianes(){
        return angulo * Math.PI / 180;
    }
    
    public double getX(){
        return magnitud*Math.cos(getRadianes());
    }
    
    public double getY(){
        return magnitud*Math.sin(getRadianes());
    }
    
    public String toString(){
        return "Mah:"+magnitud+" Ang:"+angulo;
    }
    
    public Vector suma(Vector v){
        //Este metodo involucra 3 objetos de la clase vector
        //1 - el que manda llamar al metodo(this)
        //2. el que llega como parametro (v)
        //3 -  el que se forma de la suma de this y v
        
        /*double v1x = magnitud * Math.cos(angulo*Math.PI/180);
        double v2x = v.magnitud * Math.cos(v.angulo*Math.PI/180);
        
        double v1y = magnitud * Math.sin(angulo*Math.PI/180);
        double v2y = magnitud * Math.sin(v.angulo*Math.PI/180);
        
        double sumax = v1x + v2x;
        double sumay = v1y + v2y;
        
        double magRes = Math.sqrt(Math.pow(sumax, 2)+Math.pow(sumay, 2));
        double angRes = Math.atan2(sumay,sumax)*180/Math.PI;
        
        Vector resultante = new Vector(magRes, angRes);
        return resultante;*/
        
        
        double sumaX = getX()+v.getX();
        double sumaY = getY()+v.getY();
        
        Vector resultante = new Vector();
        resultante.setXY(sumaX, sumaY);
        
        return resultante;
    }
    
    public Vector resta(Vector v){
        //Este metodo involucra 3 objetos de la clase vector
        //1 - el que manda llamar al metodo(this)
        //2. el que llega como parametro (v)
        //3 -  el que se forma de la resta de this y v
        
        
        
        double sumaX = getX()-v.getX();
        double sumaY = getY()-v.getY();
        
        Vector resultante = new Vector();
        
        resultante.setXY(sumaX, sumaY);
        
        return resultante;
    }
    
}
