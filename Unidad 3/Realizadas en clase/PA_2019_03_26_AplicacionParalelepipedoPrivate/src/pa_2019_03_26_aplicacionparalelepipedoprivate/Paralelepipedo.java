/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_03_26_aplicacionparalelepipedoprivate;

/**
 *
 * @author aa523
*/
public class Paralelepipedo extends Rectangulo{
    private double ancho;
    
    public Paralelepipedo(){
        super();
        ancho = 0;
    }
    
   public Paralelepipedo(double lar,double alt, double anc){
       super(lar,alt);
       ancho = anc;
   }
   
   public double getAncho() {
        return ancho;
    }

   public void setAncho(double ancho) {
        this.ancho = ancho;
    }
   public String toString(){
       return super.toString()+" Ancho:"+getAncho();
   }
   public double area(){
       return (super.area() + ancho * (getLargo() + getAlto())) * 2; 
   }
   public double volumen(){
       return super.area() * ancho;
   }

}
