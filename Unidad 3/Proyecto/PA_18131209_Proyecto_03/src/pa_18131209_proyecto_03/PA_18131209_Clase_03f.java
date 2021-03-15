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
class FilmeT2 extends Terror 
{
    // Atributo
    protected int recaudacion;
    
    // Constructores
    public FilmeT2() 
    {
        super();
        recaudacion = 0;
    } 
    
    public FilmeT2(String nom, int añ, String dir, String per, int rec) 
    {
        super(nom, añ, dir, per);
        recaudacion = rec;
    }
    
    // Métodos get/set
    public void setRecaudacion (int rec) 
    {
        recaudacion = rec;
    }
    
    public int getRecaudacion() 
    {
        return recaudacion;
    }
    
    //  Método para mostrar
    @Override
    public String mostrar() 
    {
        return super.mostrar() +"\nRecaudacion: " +recaudacion;
    }
    
    // Método para dibujar
    @Override
    public void dibujar(int y, Component c) 
    {
        Graphics papel = c.getGraphics();
        
        papel.setColor(c.getBackground());
        papel.fillRect(0, 0, c.getWidth(), c.getHeight());
        
        papel.setColor(Color.BLACK);
        papel.drawLine(50, y+80, 50, y+190);
        
        papel.setColor(Color.RED);
        papel.fillOval(30, y+80, 40, 50);
        
        papel.setColor(Color.BLACK);
        papel.drawLine(180, y+80, 180, y+190);
        
        papel.setColor(Color.RED);
        papel.fillOval(160, y+80, 40, 50);
        
        papel.setColor(Color.YELLOW);
        papel.fillRect(90, y+170, 60, 20);
        
        papel.setColor(Color.YELLOW);
        papel.fillRoundRect(111, y+160, 17, 10, 5, 5);
        
        papel.setColor(Color.RED);
        papel.setFont(new Font("Arial", Font.ITALIC, 50));
        papel.drawString("I T",87, y+93);
        
        papel.setColor(Color.GRAY);
        papel.fillRect(40, y+190, 150, 4);
    }
    
    // Método para mover 
    @Override
    public void mover(Component c) 
    {
        for (int y = 0; y != 490; y++) 
        {
            dibujar(y, c);
            try 
            {
                //Esperamos 10 milesimas de segundo para repetir
                Thread.sleep(10);
            } 
            catch (InterruptedException ex) 
            {
                Logger.getLogger(FilmeT2.class.getName()).log(Level.SEVERE, 
                                 null, ex);
            }
         }
    }
}
