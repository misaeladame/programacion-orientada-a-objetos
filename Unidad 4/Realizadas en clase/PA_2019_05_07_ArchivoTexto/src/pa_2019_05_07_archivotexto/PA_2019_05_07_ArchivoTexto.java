/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_05_07_archivotexto;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author terry
 */
public class PA_2019_05_07_ArchivoTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Nombre del archivo: ");
        String archivo = teclado.next();
        
        teclado = new Scanner(System.in);
        System.out.print("Nombre del alumno: ");
        String nombre = teclado.next();
        
        System.out.print("¿Cuántas calificaciones?: ");
        int n = teclado.nextInt();
        
        int [] calif = new int[n];
        
        for(int i = 0; i<calif.length; i++) 
        {
            System.out.print("Calificación " +(i+1) +": ");
            calif[i] = teclado.nextInt();
        }
        
        try {
            
            // se crean los flujos para grabar (se graba y se cbre el archivo)
            FileWriter fw = new FileWriter(archivo);
            PrintWriter pw = new PrintWriter(fw);
            
            pw.println(nombre);
            pw.println(n);
            
            for(int i = 0; i<calif.length; i++)
                pw.println(calif[i]);
            
            // Cerramos los flujos (Cerramos el archivo)
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(PA_2019_05_07_ArchivoTexto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
