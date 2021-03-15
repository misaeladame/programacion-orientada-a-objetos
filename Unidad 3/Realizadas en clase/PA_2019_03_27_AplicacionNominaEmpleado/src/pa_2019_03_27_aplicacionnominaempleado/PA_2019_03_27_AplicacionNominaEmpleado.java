/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_03_27_aplicacionnominaempleado;

/**
 *
 * @author aa517
 */
public class PA_2019_03_27_AplicacionNominaEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Empleado juan = new Empleado(1,"Juan Perez");
        Administrativo maria = new Administrativo();
        maria.setNumero(2);
        maria.setNombre("Maria Lopez");
        maria.setDiasTrab(15);
        maria.setSueldoDia(300);
        
        Ejecutivo pedro = new Ejecutivo(3, "Pedro Gomez",30, 500, 6000);
        
        System.out.println(juan);
        System.out.println(maria);
        System.out.println(pedro);
        
        System.out.println("\nSueldo de "+maria.getNombre()+" $"+maria.sueldo());
        System.out.println("Sueldo de "+pedro.getNombre()+" $"+pedro.sueldo());
        
        Taller luis = new Taller(4, "Luis Hernandez", 1000, 3);
        Ventas laura = new Ventas();
        laura.setNumero(5);
        laura.setNombre("Laura Gonzalez");
        laura.setVentasTot(100000);
        laura.setComision(4.7);
        
        
        System.out.println(juan);
        System.out.println(maria);
        System.out.println(pedro);
        System.out.println(luis);
        System.out.println(laura);
        
        System.out.println("\nSueldo de "+maria.getNombre()+" $"+maria.sueldo());
        System.out.println("Sueldo de "+pedro.getNombre()+" $"+pedro.sueldo());
        System.out.println("Sueldo de "+luis.getNombre()+" $"+luis.sueldo());
        System.out.println("Sueldo de "+laura.getNombre()+" $"+laura.sueldo());
        
        Empleado [] nomina = new Empleado[5];
        nomina[0] = juan;
        nomina[1] = maria;
        nomina[2] = pedro;
        nomina[3] = luis;
        nomina[4] = laura;
        
        for(Empleado e:nomina)
            System.out.println(e.getNombre()+" ---> "+e.sueldo());
            
    }
    
}
