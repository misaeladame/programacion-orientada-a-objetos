/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_03_25;

/**
 *
 * @author aa523
*/
public class Paralelepipedo extends Rectangulo{
    protected double ancho;
    
    public Paralelepipedo(){
        largo = 0;
        alto = 0;
        ancho = 0;
    }
    
   public Paralelepipedo(double lar,double alt, double anc){
       largo = lar;
       alto = alt;
       ancho = anc;
   }
   public String toString(){
       return "Largo:"+largo+" Alto:"+alto+" Ancho:"+ancho;
   }
   public double area(){
       return (largo*alto + largo*ancho + alto*ancho) * 2; 
   }
   public double volumen(){
       return largo * alto * ancho;
   }
}
