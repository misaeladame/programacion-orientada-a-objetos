/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paa_2019_01_29_aplicacioncilindrooo;

/**
 *
 * @author aa526
 */
public class Cilindro {
    
    //atributos
    private double radio;
    private double altura;
    
    
    //Constructores
    public Cilindro(double r, double a){
        radio = r;
        altura = a;
    }
    
    public Cilindro(){
        radio=0;
        altura=0;
    }
    
    //
    public Cilindro(Cilindro c){ 
        radio = c.radio;
        altura = c.altura;
    }
    
    
    
    //metodos get/set
    public double getRadio(){
        return radio;
    }
    
    public void setRadio(double r){
        radio = r;
    }
    
    public void setAltura(double a){
        altura = a;
    }
    
    public double getAltura(){
        return altura;
    }
    
    //metodo heredado
    @Override
    public String toString(){
        return "Radio:"+radio+"  Altura:"+altura;
    }
    
    
    //metodos de proceso
    public double volumen()
    {
       return Math.PI*Math.pow(radio, 2)*altura;
    }
    
    public double area(){
        return 2*Math.PI*radio*(radio+altura);
    }
    
    
    
}
