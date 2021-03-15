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
public class PA_2019_03_25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Linea regla = new Linea(30);
       Rectangulo puerta = new Rectangulo(90,230);
       Paralelepipedo cpu = new Paralelepipedo(10,40,35);
        System.out.println(regla);
        System.out.println(puerta);
        System.out.println(cpu);
        
        
        Linea borrador = new Rectangulo(15,5);
        Rectangulo caja = new Paralelepipedo(10,20,30);
        Linea lampara = new Paralelepipedo(120,30,15);
        
        Linea[] varios = new Linea[6];
        varios[0] = regla;
        varios[1] = puerta;
        varios[2] = cpu;
        varios[3] = borrador;
        varios[4] = caja;
        varios[5] = lampara;
        
        for(int i= 0;i< varios.length; i++)
            System.out.println(varios[i]);
        
        System.out.println("////////////////////////////////////////");
        
        for(Linea x:varios)
            System.out.println(x);
            
 
        
    }
    
}
