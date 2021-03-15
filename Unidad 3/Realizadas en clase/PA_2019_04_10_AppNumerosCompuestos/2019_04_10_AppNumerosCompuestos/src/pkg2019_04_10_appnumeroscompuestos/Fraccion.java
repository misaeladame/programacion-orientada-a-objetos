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
public class Fraccion extends NumeroCompuesto{
    
    public Fraccion()
    {
        super();
    }
    
    public Fraccion(int num, int den)
    {
        super(num,den);
    }
    
    public int getNum()
    {
        return getValor1();
    }
    
    public int getDen()
    {
        return getValor2();
    }

    public void setNum(int num)
    {
        setValor1(num);
    }
    
    public void setDen(int den)
    {
        setValor2(den);
    }
    
    public String desplegar()
    {
        return "[["+getNum()+","+getDen()+"]]";
    }

    @Override
    public String mostrar() {
        return getNum()+"/"+getDen();
    }
    
    
}
