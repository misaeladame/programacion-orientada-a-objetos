package pa_18131209_proyecto_03;

import java.awt.Component;

/**
 *
 * @author José Misael Adame Sandoval
 */
class Accion extends Pelicula
{
    // Atributos
    protected String superheroe;
    
    // Constructores
    public Accion() 
    {
        super();
        superheroe = "No ID";
    }
    
    public Accion(String nom, int añ, String dir, String sup) 
    {
        super(nom, añ, dir);
        superheroe = sup;
    }
    
    // Metodos get/set
    public void setSuperheroe(String sup) 
    {
        superheroe = sup;
    }
    
    public String getSuperheroe() 
    {
        return superheroe;
    }
    
    /* Se utiliza el polimorfismo en estos tres métodos
       Método de mostrar */
    @Override
    public String mostrar() 
    {
        return "Nombre: " +super.getNombre() +"\nAño: " +super.getAño() 
                +"\nDirector: " +super.getDirector() +"\nSuperhérore: " 
                +superheroe;
    }
    
    // Método para dibujar
    @Override
    public void dibujar(int y, Component c) 
    {
        // Manda una excepción en caso de que no exista ningún dibujo
        throw new UnsupportedOperationException("No existe dibujo");
    }

    // Metodo para mover
    @Override
    public void mover(Component c) 
    {
        // Manda una excepción en caso de que no exista un movimiento
        throw new UnsupportedOperationException("No existe un movimiento");
    }
}

