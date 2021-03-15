/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_02_07_aplicacionproducto;

/**
 *
 * @author aa526
 */
public class PA_2019_02_07_AplicacionProducto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Producto laptop = new Producto("HP JDLH-2410",10000,20,5,16);
        
        System.out.println("Precio de "+laptop.getDescripcion()+" $"+laptop.precio());
        
        System.out.println(laptop);
        
    }
    
}
