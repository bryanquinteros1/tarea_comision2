/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comision;

import Models.ClsVendedor;
import java.util.*;

/**
 *
 * @author Bryan
 */
public class ClsComisions {
   public  List <ClsVendedor> todos = new ArrayList<ClsVendedor>();
   Scanner t = new Scanner(System.in); 
   
   
   private ClsVendedor In_Informacion(){
   System.out.println("-----Ingreso de Informacion-----");
   ClsVendedor vende = new ClsVendedor();
   System.out.println("ingrese Nombre:");
   vende.Nombre = t.nextLine();
   System.out.println("Enero:"); 
   vende.Enero = t.nextDouble();
   System.out.println("Febrero:");
   vende.Febrero = t.nextDouble();
   System.out.println("Marzo:");
   vende.Marzo = t.nextDouble();
   
   vende.total=vende.Enero+vende.Febrero+vende.Marzo;
        vende.Promedio=vende.total/3;
        
        
   todos.add(vende);
       return null;
 
   }
       
   public void Datos(){
       
   System.out.println("-----Datos-----"); 
   for(ClsVendedor ele:todos){
   System.out.println("Nombre ="+ele.Nombre);
   System.out.println("Enero:"+ele.Enero);
   System.out.println("Febrero:"+ele.Febrero);
   System.out.println("Marzo: "+ele.Marzo);
  System.out.println("----------------");
  
   
   }

   
   }
      
   
   public void suma(){
    System.out.println("-----Suma por mes-----");
    
    
     
   
   
   }
   
   private void ImprimirFila(ClsVendedor vendedor){
        System.out.println(vendedor.Nombre+"  "+vendedor.Enero+"  "+vendedor.Febrero+"  "+vendedor.Marzo+"  "+vendedor.total+"  "+vendedor.Promedio);
    }
   
   
   
    
       
    public void menu (){
    
    String opc="";
    
    do{ 
    System.out.println("1- Ingrese Informacion");
    System.out.println("2-  Informacion");
    System.out.println("3-  totales de los  mes ");
    System.out.println("4-  buscar dato ");
    
    
    System.out.println("5-  salir");
    opc = t.nextLine();
    
    switch(opc){
        case"1": In_Informacion();
        break;
        case"2":Datos();
        break;
        case"3":suma();
        break;
        case"4":
            
            
            break;
            
        
   
    }
    
   
    
    } while(!opc.equals("5"));
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
     
   
    }
    
   
   
   
   
   
   
   
   
   
   
   


