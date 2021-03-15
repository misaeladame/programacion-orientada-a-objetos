/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_27_aplicaciontriangulo;

/**
 *
 * @author aa509
 */
public class Triangulo {
    //Atributos 
    private Punto puntoA;
    private Punto puntoB;
    private Punto puntoC;
    
    public Triangulo(){
        puntoA = new Punto();
        puntoB = new Punto();
        puntoC = new Punto();
    }
    public Triangulo(Punto a, Punto b, Punto c){
        puntoA = a;
        puntoB = b;
        puntoC = c;
    }
    
    public void setPuntoA(Punto a){
        puntoA = a;
    }
    public void setPuntoB(Punto b){
        puntoB = b;
    }
    public void setPuntoC(Punto c){
        puntoC = c;
    }
    
    public Punto getPuntoA(){
        return puntoA;
    }
    public Punto getPuntoB(){
        return puntoB;
    }
    public Punto getPuntoC(){
        return puntoC;
    }
    
    public String toString(){
        return "A"+puntoA.toString()+
                " B"+puntoB.toString()+
                " C"+puntoC.toString();
    }
    //Metodos de calculo
    public double lado1(){
        return puntoA.distancia(puntoB);
    }
    public double lado2(){
        return puntoB.distancia(puntoC);
    }
    public double lado3(){
        return puntoC.distancia(puntoA);
    }
    
    public double perimetro(){
        return lado1()+lado2()+lado3();
    }
    public double area(){ 
        double s = perimetro()/2;//Semiperimetro
        return Math.sqrt(s * (s-lado1())* (s-lado2() ) * (s-lado3() ));
    }
    
}
