/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_02_18_aplicacionnomina;

/**
 *
 * @author aa523
 */
public class PA_2019_02_18_AplicacionNomina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado juan = new Empleado("Juan Perez",14,180,5,8);
        System.out.println(juan);
        System.out.println("El sueldo de "+juan.getNombre()+" es "+juan.sueldo());
        
        System.out.println("\nSueldo parcial: "+juan.sueldoParcial());
        System.out.println("Horas extras  : "+juan.importeHorasExtra());
        System.out.println("Impuesto:     : "+juan.importeImpuesto());
        System.out.println("Sueldo neto   : $"+juan.sueldo());
        
        
        Empleado maria = new Empleado();
        
        maria.setNombre("Maria de los Angeles García");
        maria.setDiasTrabajados(30);
        maria.setSueldoDiario(500);
        maria.setPorcentajeImpuesto(20);
        
        System.out.println("\n"+maria);
        System.out.println("El sueldo de "+maria.getNombre()+" es "+maria.sueldo());
    }
    
}
