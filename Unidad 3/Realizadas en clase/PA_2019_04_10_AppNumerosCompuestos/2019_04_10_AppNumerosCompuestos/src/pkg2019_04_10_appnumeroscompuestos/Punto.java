/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2019_04_10_appnumeroscompuestos;

/**
 *
 * @author aa530
 */
public class Punto extends NumeroCompuesto{
    
    public Punto()
    {
        super();
    }
    
    public Punto(int x,int y)
    {
        super(x,y);
    }
    
    public int getX()
    {
        return getValor1();
    }
    
    public int getY()
    {
        return getValor2();
    }
    
    public void setX(int x)
    {
        setValor1(x);
    }
    
    public void setY(int y)
    {
        setValor2(y);
    }

    @Override
    public String mostrar() {
        return "("+getX()+","+getY()+")";
    }
    
    
}
