package pa_18131209_proyecto_04;

/**
 *
 * @author José Misael Adame Sandoval
 */

// Se usa esta clase para obtener las equivalencias de n numero a numero romano
class Romano
{
    // Atributo
    private static String valor;
    
    // Metodo
    public static String getNumeroEquivalente(int arabigo) 
    {
        // Valor en romano
        valor = "";
        
        int millares = arabigo / 1000; 
        int centenas = arabigo / 100 % 10; 
        int decenas = arabigo / 10 % 10; 
        int unidades = arabigo % 10; 
        
        // Valores para millares
        for(int i = 1; i <= millares; i++) 
        {
            valor = valor + "M"; 
        }
        
        // Valores para centenas
        if(centenas == 9) 
        {
            valor = valor + "CM";
        }
        else if (centenas >= 5)
        {
            valor = valor + "D";
            
            for(int i = 6; i <= centenas; i++) 
            {
                valor = valor +"C";
            }
        }
        else if (centenas == 4) 
        {
            valor = valor +"CD";
        } 
        else 
        {
            for(int i = 1; i <= centenas; i++) 
            {
                valor = valor + "C";
            }
        }
        
        // Valores para decenas
        if(decenas == 9) 
        {
            valor = valor +"XC";
        } 
        else if (decenas >= 5)
        {
            valor = valor +"L";
            
            for(int i = 6; i <= decenas; i++) 
            {
                valor = valor + "X";
            }
        } 
        else if (decenas == 4) 
        {
            valor = valor +"XL";
        }
        else 
        {
            for(int i = 1; i <= decenas; i++) 
            {
                valor = valor +"X";
            }
        }
        
        // Valores para unidades
        if(unidades == 9) 
        {
            valor = valor +"IX";
        }
        else if (unidades >= 5) 
        {
            valor = valor +"V";
            
            for(int i = 6; i <= unidades; i++) 
            {
                valor = valor +"I";
            }
        }
        else if (unidades == 4) 
        {
            valor = valor +"IV";
        }
        else 
        {
            for(int i = 1; i <= unidades; i++) 
            {
                valor = valor +"I";
            }
        }
        return valor;
    }
}
