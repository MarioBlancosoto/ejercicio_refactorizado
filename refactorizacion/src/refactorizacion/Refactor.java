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
public class Refactor {
    
    private int numDigitos,nDigitos;
    private boolean esprimo = false;
    
    
    public Refactor(){
        
    }
    
    
    public Refactor(int numDigitos,int nDigitos){
        
        this.numDigitos = numDigitos ; 
        this.nDigitos = nDigitos ;
    }
    
    
    
    public int pedirNumdigito(){
       
       int  numDigitos = Integer.parseInt(JOptionPane.showInputDialog("Introduce los dígitos"));    
       while(numDigitos<0|numDigitos>5){
           numDigitos= Integer.parseInt(JOptionPane.showInputDialog("Introducie cifras entre 0 y 5"));
       }
           return numDigitos;
      
    }
    
   
   public int calculaDigitos(int numero){
       
               int divisionEntera = numero;
 
            int contador=0;
 
            while (divisionEntera != 0)
        {
            divisionEntera = divisionEntera / 10;
            contador++;
        }
       return contador;
   } 
     
    public void limite (int i){
                    boolean numPrimo =false;
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
        
        
              if (numPrimo == true){
                    System.out.println(i);  
        
            } 
        
       
            }
       
    }

      

         
         
    
