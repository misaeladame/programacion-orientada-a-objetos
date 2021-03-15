/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_05_03_aplicacionpila;

/**
 *
 * @author terry
 */
public class Automovil {
    private String marca;
    private int modelo;

    public Automovil(String marca, int modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public String toString() 
    {
        return marca+"   "+modelo;
    }
}
