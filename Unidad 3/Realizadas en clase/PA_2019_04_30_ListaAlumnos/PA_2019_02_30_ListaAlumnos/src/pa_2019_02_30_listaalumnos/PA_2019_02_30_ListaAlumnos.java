/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_02_30_listaalumnos;

import java.util.Arrays;

/**
 *
 * @author terry
 */
public class PA_2019_02_30_ListaAlumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Alumno [] grupo = {
                            new Alumno("Juan", 21, 68),
                            new Alumno("Juan", 21, 68),
                            new Alumno("Juan", 21, 68),
                            new Alumno("Juan", 21, 68),
                            new Alumno("Juan", 21, 68),
                            new Alumno("Juan", 21, 68),
                            new Alumno("Juan", 21, 68),
                          };
        
        Arrays.sort(grupo);
        
        for(Alumno x:grupo)
            System.out.println(x);
    }
    
}
