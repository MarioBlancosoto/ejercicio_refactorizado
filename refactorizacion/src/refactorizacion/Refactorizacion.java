/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorizacion;

import javax.swing.JOptionPane;

/**
 *
 * @author mblancosoto
 */
public class Refactorizacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Refactor obj = new Refactor();    
        boolean numPrimo = false;
                
        int numDigitos= obj.pedirNumdigito();
        int ndigitos=0;
        for(int i = 1; i <= 99999; i++ )
        {           
        ndigitos=obj.calculaDigitos(i);
                     
         if(ndigitos==numDigitos){
             obj.limite(i);
        } 
     
                if (numPrimo == true) 
                    System.out.println(i);    
            }
        }
        
}
    
    

