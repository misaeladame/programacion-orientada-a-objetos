/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_02_01_aplicacionalumnovisual;

/**
 *
 * @author aa523
 */
public class PA_2019_02_01_AplicacionAlumnoVisual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno uno = new Alumno();
        Alumno dos = new Alumno("Misal Chicha", 75, 82, 63, 90);
        Alumno tres = new Alumno(dos);
        
        tres.setNombre("María");
        
        System.out.println("Calificaiones de "+uno.getNombre()+": "+uno.Calificacion());
        System.out.println("Calificaiones de "+dos.getNombre()+": "+dos.Calificacion());
        System.out.println("Calificaiones de "+tres.getNombre()+": "+tres.Calificacion());
        
        System.out.println();
        System.out.println(uno);
        System.out.println(dos);
        System.out.println(tres);
        
    }
    
}
