/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_02_18_aplicacionnomina;

import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author aa533
 */
public class Empresa  {
    private Empleado[] nomina;
    
    public Empresa(){
        nomina = new Empleado[5];
        for(int i=0; i<nomina.length; i++)
            nomina[i] = new Empleado();
    }
    
    public Empresa(int n){
        nomina = new Empleado[n];
        for(int i=0; i<nomina.length; i++)
            nomina[i] = new Empleado();
    }
    
    public void setEmpleado(Empleado e, int posicion){
        nomina[posicion] = e;
        //falta valir posicion
    }
    
    public Empleado getEmpleado(int posicion){
        return nomina[posicion];
        //falta validar la posicion
    }
    
    public int getTamaño(){
        return nomina.length;
    }
    
    public Empleado mayor(){
        Empleado may = nomina[0];

        for(int r=1; r<nomina.length; r++)
            if(nomina[r].sueldo()>may.sueldo())
                may = nomina[r];
        return may;
    }
    
    public Empleado menor(){
        Empleado men = nomina[0];

        for(int r=1; r<nomina.length; r++)
            if(nomina[r].sueldo()<men.sueldo())
                men = nomina[r];
        return men;
    }
    
    public void ordenarSueldo(){
        for(int i =0; i<nomina.length-1; i++)
            for(int j=i+1; j<nomina.length; j++)
                if(nomina[i].sueldo()<nomina[j].sueldo()){
                    Empleado aux = nomina[i];
                    nomina[i] = nomina[j];
                    nomina[j] = aux;
                }
    }
    
    public void ordenarAlfabetico(){
         for(int i =0; i<nomina.length-1; i++)
            for(int j=i+1; j<nomina.length; j++)
                if(nomina[i].getNombre().compareTo(nomina[j].getNombre()) > 0){
                    Empleado aux = nomina[i];
                    nomina[i] = nomina[j];
                    nomina[j] = aux;
                }

    }
    
    public void mostrar(JTable tabla, JLabel etiqueta){
        
        DecimalFormat d = new DecimalFormat("#,###,##0.00");
        double total = 0;
        
        for(int r=0; r<nomina.length; r++){
            tabla.setValueAt(nomina[r].getNombre(), r, 0);
            tabla.setValueAt(nomina[r].getDiasTrabajados(), r, 1);
            tabla.setValueAt(d.format(nomina[r].getSueldoDiario()), r, 2);
            tabla.setValueAt(nomina[r].getHorasExtras(), r, 3);
            tabla.setValueAt(nomina[r].getPorcentajeImpuesto(), r, 4);
            
            
            tabla.setValueAt(d.format(nomina[r].importeHorasExtra()), r, 5);
            tabla.setValueAt(d.format(nomina[r].importeImpuesto()), r, 6);
            tabla.setValueAt(d.format(nomina[r].sueldo()), r, 7);
            
            total+=nomina[r].sueldo();
        }
        
        etiqueta.setText(d.format(total)+"");
        
    }

}
