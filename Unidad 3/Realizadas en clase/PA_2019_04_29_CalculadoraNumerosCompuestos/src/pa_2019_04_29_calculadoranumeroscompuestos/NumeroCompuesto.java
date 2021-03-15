/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_04_29_calculadoranumeroscompuestos;

/**
 *
 * @author aa530
 */
public abstract class NumeroCompuesto {
    private int valor1;
    private int valor2;
    
    protected NumeroCompuesto()
    {
        valor1 = 0;
        valor2 = 0;
    }
    
    protected NumeroCompuesto(int x,int y)
    {
        valor1 = x;
        valor2 = y;
    }
    
    protected int getValor1()
    {
        return valor1;
    }
    
    protected int getValor2()
    {
        return valor2;
    }
    
    protected void setValor1(int x)
    {
        valor1 = x;
    }
    
    protected void setValor2(int y)
    {
        valor2 = y;
    }
    
    public String desplegar()
    {
        return "("+valor1+","+valor2+")";
    }
    
    public abstract String mostrar();
    
}
