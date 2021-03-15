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
public class Linea {
    protected double largo;

    /**
     * @return the largo
     */
    
    public Linea(){
        largo = 0;
    }
    public Linea(double lar){
        largo = lar;
    }
    public double getLargo() {
        return largo;
    }

    /**
     * @param largo the largo to set
     */
    public void setLargo(double largo) {
        this.largo = largo;
    }
    
    public String toString(){
        return "Largo:"+largo;
    }
}
