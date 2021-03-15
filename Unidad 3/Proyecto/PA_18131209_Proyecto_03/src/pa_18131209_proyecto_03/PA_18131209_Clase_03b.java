package pa_18131209_proyecto_03;

import java.awt.Component;

/**
 *
 * @author José Misael Adame Sandoval
 */
class Terror extends Pelicula 
{
    // Atributos
    protected String personaje;
    
    // Constructores
    public Terror() 
    {
        super();
        personaje = "No ID";
    }
    
    public Terror(String nom, int añ, String dir, String per) 
    {
        super(nom, añ, dir);
        personaje = per;
    }
    
    // Metodos get/set
    public void setPersonaje(String per) 
    {
        personaje = per;
    }
    
    public String getPersonaje() 
    {
        return personaje;
    }    

    // Método para mostrar
    @Override
    public String mostrar() 
    {
        return "Nombre: " +super.getNombre() +"\nAño: " +super.getAño() 
                +"\nDirector: " +super.getDirector() +"\nPersonaje: " 
                +personaje;
    }

    // Método para dibujar
    @Override
    public void dibujar(int y, Component c)
    {
        // Manda una excepción en caso de que no exista ningún dibujo
        throw new UnsupportedOperationException("No existe dibujo");
    }

    // Método para mover
    @Override
    public void mover(Component c) 
    {
        // Manda una excepción en caso de que no exista un movimiento
        throw new UnsupportedOperationException("No existe un movimiento");
    }
}
