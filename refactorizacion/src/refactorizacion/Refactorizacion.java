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
        int numDigitos= obj.pedirNumdigito();
        int ndigitos=0;
        if(numDigitos<=0)
        System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        for(int i = 1; i <= 99999; i++ )
        {
            int divisionEntera = i;
 
            int contador=0;
 
            while (divisionEntera != 0)
        {
            divisionEntera = divisionEntera / 10;
            contador++;
        }
        ndigitos=contador;
            
            
            if(ndigitos==numDigitos){
                boolean numPrimo = false;
                   if (i < 4) numPrimo = true;
            else
            {
            if (i % 2 == 0) numPrimo = false; 
                else
                {
                    int contador1 = 0;  
                    int i1 = 1; 
                    int limite = (i - 1) / 2; 
                    if  (limite % 2 == 0) limite--;  
             
                    while(i1 <= limite)
                    {
                        if (i % i1 == 0) contador1++;
                            i1 += 2;
                            if (contador1 == 2) i1 = limite + 1;
                    }
 
        if (contador1 == 1) numPrimo = true;
            } 
        } 
     
                if (numPrimo == true) 
                    System.out.println(i);    
            }
        }
        }
 
    }
    

