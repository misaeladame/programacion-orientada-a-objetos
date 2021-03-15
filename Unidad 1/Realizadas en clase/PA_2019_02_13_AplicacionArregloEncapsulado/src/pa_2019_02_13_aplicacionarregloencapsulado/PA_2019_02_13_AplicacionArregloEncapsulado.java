/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_02_13_aplicacionarregloencapsulado;

/**
 *
 * @author aa532
 */
public class PA_2019_02_13_AplicacionArregloEncapsulado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Arreglo uno = new Arreglo();
        Arreglo dos = new Arreglo(4);
        
        double [] x = {2,4,6,7,8,3};
        
        Arreglo tres = new Arreglo(x);
        
        System.out.println(uno);
        System.out.println(dos);
        System.out.println(tres);
        
        x[1] = 123456789;
        System.out.println(tres);
        
        
        System.out.println(tres.getValor(1));
        tres.setValor(500,10);
        tres.setValor(1000,9);
        System.out.println(tres);
        
        System.out.println("------------------------------------------");
        System.out.println("Suma: "+tres.suma());
        System.out.println("Promedio: "+tres.promedio());
        System.out.println("Mayor: "+tres.mayor());
        System.out.println("Menor: "+tres.menor());
        System.out.println("Rango: "+tres.rango());
        System.out.println("Mediana: "+tres.mediana());
        System.out.println("/n"+tres);
    }
    
}
