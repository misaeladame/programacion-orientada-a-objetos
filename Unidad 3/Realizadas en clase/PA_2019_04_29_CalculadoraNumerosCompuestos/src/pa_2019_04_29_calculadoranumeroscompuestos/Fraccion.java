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
public class Fraccion extends NumeroCompuesto implements IOperacionesBasicas {
    
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

    @Override
    public String suma(Object o) {
        Fraccion f = (Fraccion)o;
        
        return new Fraccion(this.getNum()*f.getDen()+this.getDen()*f.getNum(), this.getDen()*f.getDen()).mostrar();
    }

    @Override
    public String resta(Object o) {
            
        Fraccion f = (Fraccion)o;
    
        return new Fraccion(this.getNum()*f.getDen()-this.getDen()*f.getNum(), this.getDen()*f.getDen()).mostrar();
    }
    
    
}
