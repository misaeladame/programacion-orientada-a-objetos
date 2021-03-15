package pa_18131209_proyecto_03;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author José Misael Adame Sandoval
 */
class FilmeA2 extends Accion 
{
    // Atributo
    protected String franquicia;
    
    // Constructores
    public FilmeA2() 
    {
        super();
        franquicia = "No especificado";
    } 
    
    public FilmeA2(String nom, int añ, String dir, String sup, String fra) 
    {
        super(nom, añ, dir, sup);
        franquicia = fra;
    }
    
    // Métodos get/set
    public void setFranquicia (String fra) 
    {
        franquicia = fra;
    }
    
    public String getFranquicia () 
    {
        return franquicia;
    }
    
    //  Método para mostrar
    @Override
    public String mostrar() 
    {
        return super.mostrar() +"\nFranquicia: " +franquicia;
    }
    
    // Método para dibujar
    @Override
    public void dibujar(int y, Component c) 
    {
        Graphics papel = c.getGraphics();
        
        papel.setColor(c.getBackground());
        
        papel.fillRect(5, 55, c.getWidth()-10, 500);
        
        papel.setColor(new Color(0, 90, 0));
        papel.setFont(new Font("Arial", Font.PLAIN, 20));
        papel.drawString("GREEN LANTERN", 17, y+70);
        
        papel.setColor(new Color(0, 90 ,0));
        papel.fillRoundRect(20, y+80, 150, 150, 15, 15);
        
        papel.setColor(Color.WHITE);
        papel.fillOval(25, y+85, 140, 140);
        
        papel.setColor(new Color(0, 90, 0));
        papel.fillOval(50, y+110, 90, 90);
        
        papel.setColor(Color.WHITE);
        papel.fillOval(67, y+127, 56, 56);
        
        papel.setColor(new Color(0, 90, 0));
        papel.fillRect(50, y+105, 90, 15);
        
        papel.setColor(new Color(0, 90, 0));
        papel.fillRect(50, y+190, 90, 15);
        
        papel.setColor(new Color(0, 90, 0));
        papel.drawLine(20, y+240, 170, y+240);
    }
    
    // Método para mover 
    @Override
    public void mover(Component c) 
    {
        for (int y = 0; y != 460; y++) 
        {
            dibujar(y, c);
            try 
            {
                //Esperamos 10 milesimas de segundo para repetir
                Thread.sleep(10);
            } 
            catch (InterruptedException ex) 
            {
                Logger.getLogger(FilmeA2.class.getName()).log(Level.SEVERE,
                                 null, ex);
            }
         }
    }
}
