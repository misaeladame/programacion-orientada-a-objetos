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
public class Complejo extends NumeroCompuesto{
    
    public Complejo()
    {
        super();
    }
    
    public Complejo(int real, int imag)
    {
        super(real,imag);
    }
    
    public int getReal()
    {
        return getValor1();
    }
    
    public int getImag()
    {
        return getValor2();
    }
    
    public void setReal(int real)
    {
        setValor1(real);
    }
    
    public void setImag(int imag)
    {
        setValor2(imag);
    }

    @Override
    public String mostrar() 
    {
        String cad = getReal()+"";
        
        if(getImag() >= 0)
            cad = cad + "+";
        
        cad = cad+getImag()+"i";
        
        return cad;
    }
    
    
    
}
