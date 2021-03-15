package pa_18131209_proyecto_04;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author José Misael Adame Sandoval
 */
class Triangulo
{
    // Atributos
    private String id;
    private int base;
    private int altura;
    private int x;
    private int y;
    
    // Constructores
    public Triangulo() 
    {
        id = "NoId";
        base = 0;
        altura = 0;
        x = 0;
        y = 0;
    }
    
    public Triangulo(String id, int base, int altura, int x, int y) 
    {
        this.id = id;
        this.base = base;
        this.altura = altura;
        this.x = x;
        this.y = y;
    }

    // Mérotods get/set
    public String getId() 
    {
        return id;
    }

    public int getBase() 
    {
        return base;
    }

    public int getAltura() 
    {
        return altura;
    }

    public int getX() 
    {
        return x;
    }

    public int getY() 
    {
        return y;
    }

    public void setId(String id) 
    {
        this.id = id;
    }

    public void setBase(int base) 
    {
        this.base = base;
    }

    public void setAltura(int altura) 
    {
        this.altura = altura;
    }

    public void setX(int x) 
    {
        this.x = x;
    }

    public void setY(int y) 
    {
        this.y = y;
    }
     
    // Método para dibujar
    public void dibujar(String color, Component c) 
    {
        Graphics g = c.getGraphics();
        
       // g.setColor(Color.black); 
        
        // Para asignar el color que ingreso el usuario
        if(color.equals("Negro"))
        {
            g.setColor(Color.black);
        }
        if(color.equals("Verde"))
        {
            g.setColor (Color.green);
        }
        if(color.equals("Azul"))
        {
            g.setColor (Color.blue);
        }    
        if(color.equals("Rojo"))
        {
            g.setColor (Color.red); 
        }
        if(color.equals("Gris")) 
        {
            g.setColor (Color.gray);
        }
        if(color.equals("Amarillo")) 
        {
            g.setColor (Color.yellow);
        }
        if(color.equals("Naranja")) 
        {
            g.setColor(Color.ORANGE);
        }
        if(color.equals("Magenta")) 
        {
            g.setColor(Color.MAGENTA);
        }
        if(color.equals("Rosa")) 
        {
            g.setColor(Color.PINK);
        }
        
        // Se crean los arreglos para formar los triángulos
        int [] vx1 = {x+150, x+150-base/2, x+150+base/2};
        int [] vy1 = {y+30, y+30+altura, y+30+altura};
        g.fillPolygon(vx1, vy1, 3);
         
        // Se dibuja el identificador dentro del triangulo
        g.setColor(Color.white);
        g.setFont(new Font("Courier", Font.BOLD, 20));
        g.drawString(id, x+143, y+30+altura/2);    
    }
}
