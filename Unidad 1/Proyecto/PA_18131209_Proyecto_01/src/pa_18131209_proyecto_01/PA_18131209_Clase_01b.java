package pa_18131209_proyecto_01;

// libreras usadas
import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author José Misael Adame Sandoval
 */
class ConjuntoCircuitos 
{
    // Atributos
    private Circuito [] grupoCir;
   
    // Constructores
    public ConjuntoCircuitos()
    {
        grupoCir = new Circuito[4];
        
        for (int i=0; i<grupoCir.length; i++)
            grupoCir[i] = new Circuito();
    }
        
    public ConjuntoCircuitos(int n)
    {
        grupoCir = new Circuito[n];

        for (int i=0; i<grupoCir.length; i++)
            grupoCir[i] = new Circuito();
    }
    
    // Métodos
    public void setCircuito(Circuito e, int posicion)
    {
        grupoCir[posicion] = e;
    }

    public Circuito getCircuito(int posicion)
    {
        return grupoCir[posicion];
    }

    public int getTamaño()
    {
        return grupoCir.length;
    }
    
    // Método donde indica el circuito mayor en base a la resistencia
    public Circuito mayor()
    {
        Circuito may = grupoCir[0];
        
        for (int r=1; r<grupoCir.length; r++)
            if (grupoCir[r].resistencia() > may.resistencia())
                may = grupoCir[r];
       
        return may;
    }
    
    // Método donde indica el circuito menor en base a la resistencia
    public Circuito menor()
    {
        Circuito men = grupoCir[0];
        
        for (int r=1; r<grupoCir.length; r++)
            if (grupoCir[r].resistencia() < men.resistencia())
                men = grupoCir[r];
       
        return men;
    }
    
    // Método en donde se ordena descendentemente la Resistencia de los circuitos
    public void ordenarResistencia()
    {
        for (int i=0; i<grupoCir.length-1; i++)
            for (int j=i+1; j<grupoCir.length; j++)
                if (grupoCir[i].resistencia() < grupoCir[j].resistencia())
                {
                    Circuito aux = grupoCir[i];
                    grupoCir[i] = grupoCir[j];
                    grupoCir[j] = aux;
                }
    }
    
    // Método para mostrar los circuitos en orden Alfabetico de A a Z
    public void ordenarAlfabetico()
    {
        for (int i=0; i<grupoCir.length-1; i++)
            for (int j=i+1; j<grupoCir.length; j++)
                if (grupoCir[i].getNombre().compareTo(grupoCir[j].getNombre())>0)
                {
                    Circuito aux = grupoCir[i];
                    grupoCir[i] = grupoCir[j];
                    grupoCir[j] = aux;
                }
    }
    
    // Método para calcular e imprimir los valores en las tablas y etiquetas
    public void mostrar(JTable tabla, JLabel etiquetaImpedancia, 
                        JLabel etiquetaResistencia, JLabel etiquetaReacInductiva, 
                        JLabel etiquetaReacCapacitiva)
    {
        // Declararacion de variable para poner un formato decimal
        DecimalFormat d = new DecimalFormat("#0.0000");
        // Declaracion de variables
        double totalImp = 0;
        double sumaResist = 0;
        double promResist;
        double totalReacInd = 0;
        double sumaReacCap = 0;
        double promReacCap;
                
        
        for (int r=0; r<grupoCir.length; r++)
        {
            // Ohtiene los valores de la tabla para hacer los calculos
            tabla.setValueAt(grupoCir[r].getNombre(), r, 0);
            tabla.setValueAt(grupoCir[r].getImpedancia(), r, 1);
            tabla.setValueAt(grupoCir[r].getReactanciaInductiva(), r, 2);
            tabla.setValueAt(grupoCir[r].getReactanciaCapacitiva(), r, 3);
            tabla.setValueAt(d.format(grupoCir[r].resistencia()), r, 4);
            
            // Obtiene la suma de las resistencias de los circuitos de la tabla
            sumaResist += grupoCir[r].resistencia();
            
            // Obtiene el total de la Impedancia de los circuitos de la tabla
            totalImp += grupoCir[r].getImpedancia();
            
            /* Obtiene el total de la Reactancia Inductiva de los circuitos de
               de la tabla */
            totalReacInd += grupoCir[r].getReactanciaInductiva();
            
            /* Obtiene la suma de las Reactancias Capacitoras de los circuitos 
               de la tabla */
            sumaReacCap += grupoCir[r].getReactanciaCapacitiva();
        }
        // Los promedios de la Resistencia y Reactancia Capacitora
        promResist = sumaResist/(grupoCir.length);
        promReacCap = sumaReacCap/(grupoCir.length);  
        
        // Sobreescribre
        etiquetaImpedancia.setText(d.format(totalImp));
        etiquetaResistencia.setText(d.format(promResist));
        etiquetaReacInductiva.setText(d.format(totalReacInd));
        etiquetaReacCapacitiva.setText(d.format(promReacCap)); 
    }    
}
