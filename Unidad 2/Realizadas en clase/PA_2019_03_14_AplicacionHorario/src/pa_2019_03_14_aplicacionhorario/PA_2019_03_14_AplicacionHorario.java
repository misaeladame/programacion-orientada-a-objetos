/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_03_14_aplicacionhorario;

/**
 *
 * @author aa526
 */
public class PA_2019_03_14_AplicacionHorario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Horario h1 = new Horario(5,27,43);
        
        Horario h2 = new Horario();
        h2.setHoras(8);
        h2.setMinutos(34);
        h2.setSegundos(21);
        
        Horario h3 = h1.suma(h2);
        
        System.out.println(h1);
        System.out.println(h2);
        System.out.println("----------------------------");
        System.out.println(h3);
        
        Horario h4 = new Horario(9, 59, 59);
        Horario h5 = new Horario(0,0,1);
        Horario h6 = h4.suma(h5);
        
        System.out.println("\n"+h6);
        
        Horario h7 = h1.suma(h2).suma(h3).suma(h4).suma(h5).suma(h6);
        
        System.out.println("\n"+h7);
        
        
    }
    
}
