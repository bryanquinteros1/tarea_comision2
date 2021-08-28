/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Central;



import Comision.ClsComisions;
import java.util.Collection;



/**
 *
 * @author Bryan
 */
public class ClsPrincipal {
    
    public static void main(String[] args) {
    
   ClsComisions comi = new ClsComisions();
   comi.menu();
   
  
  
}

  public static void imprimir(Collection coleccion){
      
      for (Object elemento : coleccion){
          System.out.println("Elemento (item)="+elemento);
      }
  }
  


}