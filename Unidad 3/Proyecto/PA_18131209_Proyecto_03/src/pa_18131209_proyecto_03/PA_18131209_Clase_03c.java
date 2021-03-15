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
class FilmeA1 extends Accion 
{
    // Atributo
    protected String pais;
    
    // Constructores
    public FilmeA1() 
    {
        super();
        pais = "No especificado";
    } 
    
    public FilmeA1(String nom, int añ, String dir, String sup, String pa) 
    {
        super(nom, añ, dir, sup);
        pais = pa;
    }
    
    // Métodos get/set
    public void setPais (String pa) 
    {
        pais = pa;
    }
    
    public String getPais () 
    {
        return pais;
    }
    
    //  Método para mostrar
    @Override
    public String mostrar() 
    {
        return super.mostrar() +"\nPaís: " +pais;
    }
    
    // Método para dibujar
    @Override
    public void dibujar(int y, Component c) 
    {
        Graphics papel = c.getGraphics();
        
        papel.setColor(c.getBackground());
        papel.fillRect(5, 55, c.getWidth(), 500);
       
        papel.setColor(Color.red);
        papel.fillOval(25, y+85, 150, 150);
        
        papel.setColor(Color.BLACK);
        papel.fillOval(40, y+100, 120, 120);
        
        papel.setColor(Color.RED);
        papel.fillRect(90, y+100, 20, 120);
        
        papel.setColor(Color.WHITE);
        papel.fillRect(50, y+155, 25, 10);
        
        papel.setColor(Color.WHITE);
        papel.fillRect(120, y+155, 25, 10);
        
        papel.setColor(Color.BLACK);
        papel.drawLine(25, y+238, 170, y+238);
        
        papel.setColor(Color.red);
        papel.setFont(new Font("Calibri", Font.BOLD, 30));
        papel.drawString("DEADPOOL", 30, y+260);
        
        papel.setColor(Color.BLACK);
        papel.drawLine(25, y+262, 170, y+262);
    }
    
    // Método para mover 
    @Override
    public void mover(Component c) 
    {
        for (int y = 0; y != 440; y++) 
        {
            dibujar(y, c);
            try 
            {
                //Esperamos 10 milesimas de segundo para repetir
                Thread.sleep(10);
            } 
            catch (InterruptedException ex) 
            {
                Logger.getLogger(FilmeA1.class.getName()).log(Level.SEVERE, 
                                 null, ex);
            }
         }
    }
}


