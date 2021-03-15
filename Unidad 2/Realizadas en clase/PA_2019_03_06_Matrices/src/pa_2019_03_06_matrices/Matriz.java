package pa_2019_03_06_matrices;

/*
-------------------
Matriz
------------------
- datos [][]: double


------------------
+ suma (m:Matriz) : Matriz
+ resta (m:Matriz) : Matriz
*/
public class Matriz 
{
    // atributos 
    private double [][] datos;
    
    // constructores
    
    public Matriz()
    {
        datos = new double[1][1];
    }
    public Matriz(int ren, int col)
    {
        if(ren > 0 && col > 0)
            datos = new double [ren][col];
        else
            datos = new double[1][1];
    }
    public Matriz(double [][] d)
    {
        datos = new double [d.length][d[0].length];
        
        for(int i = 0; i < d.length; i++)
            for(int j = 0; j < d[0].length; j++)
                datos[i][j] = d[i][j];
    }
    
    // Metodos get y set
    
    public int getRenglones()
    {
        return datos.length;
    }    
    public int getColumnas()
    {
        return datos[0].length;
    }
    public void setValor(double valor, int ren, int col)
    {
        if(ren >= 0 && ren < getRenglones() && col >= 0 && col < getColumnas())
            datos[ren][col] = valor;
    }
    public double getValor(int ren, int col)
    {
        if(ren >= 0 && ren < getRenglones() && col >= 0 && col < getColumnas())
            return datos[ren][col];
        else
            return 0;
    }
    public void mostrar()
    {
        for (int i = 0; i < getRenglones(); i++)
        {
             for (int j = 0; j < getColumnas(); j++)
                System.out.print(datos[i][j]+" ");
             
             System.out.println();
        }
        System.out.println();
    }
    
    public Matriz suma(Matriz m)
    {
        // Este método involucra tres objetos de la clase matriz.
        // 1- El que llamar al método (this)
        // 2- El que llega como parámetro (m)
        // 3- El que regresa el resultado de sumar this y m.
        
        if(getRenglones() !=m.getRenglones() || getColumnas() !=m.getColumnas())
            return new Matriz();
        
        // Si se pueden sumar las matrices 
        Matriz resultante = new Matriz(getRenglones(), getColumnas());
        
        for(int r=0; r<getRenglones(); r++)
            for(int c=0; c<getColumnas(); c++)
                resultante.setValor(getValor(r,c)+ m.getValor(r, c), r, c);
        
        return resultante; 
    }
    
    public Matriz Multiplicacion(double escalar)
    {
        Matriz resultante = new Matriz(getRenglones(), getColumnas());
        
        for(int r=0; r<getRenglones(); r++)
            for(int c=0; c<getColumnas(); c++)
                resultante.setValor(getValor(r,c)*escalar, r, c);
        
        return resultante;
    }
    
    public Matriz resta(Matriz m)
    {
        // Este método involucra tres objetos de la clase matriz.
        // 1- El que llamar al método (this)
        // 2- El que llega como parámetro (m)
        // 3- El que regresa el resultado de restar this y m.        
        return suma(m.Multiplicacion(-1));
    }
   
    public Matriz multiplicacion(Matriz m)
    {
        // Este método involucra tres objetos de la clase matriz.
        // 1- El que llamar al método (this)
        // 2- El que llega como parámetro (m)
        // 3- El que regresa el resultado de multiplicar this y m (Resultante).
        
        if(getColumnas() != m.getRenglones()) // no se pueden multiplicar
            return new Matriz();
        
        //si se pueden multiplicar
        Matriz resultante = new Matriz(getRenglones(), m.getColumnas());
        
        double suma;
        for(int r=0; r<resultante.getRenglones(); r++)
            for(int c=0; c<resultante.getColumnas(); c++)
            {
                suma = 0;
                for(int k=0; k<getColumnas(); k++)
                    suma+= getValor(r, k) * m.getValor(r,c);
            }
        return new Matriz();
    }
    
    
}
