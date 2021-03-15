/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_13_05_aplicacionarchivobinariovisual;

import java.util.Random;

/**
 *
 * @author aa514
 */
public class MiRandom extends Random {
    private static String []nom = {"Juan","Luis","Maria","Laura","Pedro","Ruben","Diana","Patricia","Jesus","Daniel","Jorge","Miguel"};
    private static String []ape = {"Lopéz","García","Pérez","Mendez","Ruiz","Goméz","Hernández","Fernandez","Ortiz"};
    
    public MiRandom(){
        super();
    }
    public MiRandom(int x){
        super(x);
    }
    
    public String nextNombre(){
        return nom[nextInt(nom.length)]+" "+ ape[nextInt(ape.length)];
    }
    public String nextNombreCompleto(){
        return nom[nextInt(nom.length)]+" "+ 
                ape[nextInt(ape.length)]+" "+
                ape[nextInt(ape.length)];
    }
    public String nextNombreLegal(){
        return ape[nextInt(ape.length)]+" "+ 
                ape[nextInt(ape.length)]+" "+
                nom[nextInt(nom.length)];
    }
    public int nextInt(int ini,int fin){
        return ini+nextInt(fin-ini);   
    }
    
    public int nextInt(int ini,int fin,int multiplo){
        return nextInt(ini/multiplo,fin/multiplo) * multiplo;   
    }    
    public double nextDouble(int ini,int fin,double multiplo){
        return nextInt((int)(ini/multiplo),(int)(fin/multiplo)) * multiplo;   
    }       
}
