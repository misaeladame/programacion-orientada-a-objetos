/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_05_23_buscarnumero;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

/**
 *
 * @author alope
 */
public class MiBoton extends JButton{
    private int numero;
    private static int color = 0;
    
    public MiBoton(int numero)
    {
        this.numero = numero;
        
        setSize(80,80);
        setFont(new Font("Arial",Font.BOLD,36));
        
        switch(color)
        {
            case 0: this.setBackground(Color.yellow); break;
            case 1: this.setBackground(Color.red); break;
            case 2: this.setBackground(Color.green); break;
            case 3: this.setBackground(Color.blue); break;
            case 4: this.setBackground(Color.pink); break;
            default: this.setBackground(Color.orange);
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public static int getColor() {
        return color;
    }

    public void mostrar()
    {
        setText(numero+"");
    }
    
    public static void setColor(int color) {
        MiBoton.color = color;
    }
   
    
}
