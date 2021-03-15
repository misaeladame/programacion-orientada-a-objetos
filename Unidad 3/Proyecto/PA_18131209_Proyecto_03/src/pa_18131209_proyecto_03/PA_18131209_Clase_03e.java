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
class FilmeT1 extends Terror 
{
    // Atributo
    protected String productora;
    
    // Constructores
    public FilmeT1() 
    {
        super();
        productora = "No especificado";
    } 
    
    public FilmeT1(String nom, int añ, String dir, String per, String pro) 
    {
        super(nom, añ, dir, per);
        productora = pro;
    }
    
    // Métodos get/set
    public void setProductora (String pro) 
    {
        productora = pro;
    }
    
    public String getProductora () 
    {
        return productora;
    }
    
    //  Método para mostrar
    @Override
    public String mostrar() 
    {
        return super.mostrar() +"\nProductora: " +productora;
    }
    
    // Método para dibujar
    @Override
    public void dibujar(int y, Component c) 
    {
        Graphics papel = c.getGraphics();
        
        papel.setColor(c.getBackground());
        
        papel.setColor(c.getBackground());
        papel.fillRect(5, 55, c.getWidth(), 500);
        
        papel.setColor(Color.BLACK);
        papel.fillRect(20, y+80, 290, 85);
        
        papel.setColor(Color.WHITE);
        papel.setFont(new Font("Courier", Font.BOLD, 50));
        papel.drawString("REC", 100, y+140);
        
        papel.setColor(Color.WHITE);
        papel.setFont(new Font("Courier", Font.PLAIN, 70));
        papel.drawString("[         ]", 22, y+140);
        
        papel.setColor(Color.red);
        papel.fillOval(40, y+97, 50, 50);  
        
        papel.setColor(Color.red);
        papel.drawLine(20, y+85, 290, y+85);
        
        papel.setColor(Color.red);
        papel.drawLine(20, y+160, 290, y+160);
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
                Logger.getLogger(FilmeT1.class.getName()).log(Level.SEVERE, 
                                 null, ex);
            }
         }
    }
}
