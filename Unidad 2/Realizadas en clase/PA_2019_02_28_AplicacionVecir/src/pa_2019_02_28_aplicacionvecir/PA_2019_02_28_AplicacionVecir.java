/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_02_28_aplicacionvecir;

/**
 *
 * @author aa535
 */
public class PA_2019_02_28_AplicacionVecir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        
        Vector f1 = new Vector(85,20);
        Vector f2 = new Vector();
        f2.setMagnitud(110);
        f2.setAngulo(70);
        
        Vector R = f1.suma(f2);
        
        System.out.println("f1 -> "+f1);
        System.out.println("f2 -> "+f2);
        System.out.println("-----------------------");
        System.out.println("R -> " +R);
        
        Vector uno = new Vector(), dos = new Vector(), tres = new Vector();
        uno.setXY(79.87, 29.07);
        dos.setXY(37.62, 103.36);
        tres.setXY(117.49, 132.42);
        
        System.out.println("\nUno -> "+uno);
        System.out.println("Dos -> "+dos);
        System.out.println("Tres -> "+tres);
        
    }
    
}
