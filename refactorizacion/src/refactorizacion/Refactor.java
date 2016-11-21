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
    private static boolean p = false;
    
    public Refactor(){
        
    }
    
    
    public Refactor(int numDigitos,int nDigitos){
        
        this.numDigitos = numDigitos ; 
        this.nDigitos = nDigitos ;
    }
    
    
    
    public int pedirNumdigito(){
       
       int  numDigitos = Integer.parseInt(JOptionPane.showInputDialog("Introduce los dígitos"));     

                
           return numDigitos;
      
    }
    
   
       public void metodoPrimos(){
           
           
           
       } 
     
     
    
    

}