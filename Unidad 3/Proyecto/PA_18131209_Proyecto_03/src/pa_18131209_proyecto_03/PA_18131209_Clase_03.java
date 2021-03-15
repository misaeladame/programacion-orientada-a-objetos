package pa_18131209_proyecto_03;

import java.awt.Component;

/**
 *
 * @author José Misael Adame Sandoval
 */
abstract class Pelicula
{
    // Atributos
    protected String nombre;
    protected int año;
    protected String director;
    
    // Constructores
    public Pelicula() 
    {
        nombre = "No ID";
        año = 0;
        director = "No ID";
    }
    
    public Pelicula(String nom, int añ, String dir) 
    {
        nombre = nom;
        año = añ;
        director = dir;
    }
    
    // Métodos get/set
    public void setNombre(String nom) 
    {
        nombre = nom;
    }
    
    public void setAño(int añ) 
    {
        año = añ;
    }
    
    public void setDirector(String dir) 
    {
        director = dir;
    }
    
    public String getNombre() 
    {
        return nombre;
    }
    
    public int getAño() 
    {
        return año;
    }
    
    public String getDirector() 
    {
        return director;
    } 
    
    // Método para mostrar la información
    public abstract String mostrar();
    
    // Método para poder dibujar
    public abstract void dibujar(int y, Component c);
    
    // Método para mover 
    public abstract void mover(Component c);
}
