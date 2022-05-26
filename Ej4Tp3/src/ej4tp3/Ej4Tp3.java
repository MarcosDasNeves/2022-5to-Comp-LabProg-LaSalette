package ej4tp3;

import java.util.ArrayList;
import java.util.Scanner;


public class Ej4Tp3 {

  
    public static void main(String[] args) {
        
        int a,b,c;
        
        
        Scanner sc = new Scanner (System.in);
        System.out.println("ingrese el mes");
         a=sc.nextInt(); 
        System.out.println("ingrese el dia");
         b=sc.nextInt(); 
        System.out.println("ingrese el año");
         c=sc.nextInt(); 
            
        Fecha a1=new Fecha(a,b,c);
        Fecha a2=new Fecha(a,b,c);
        Fecha a3=new Fecha(b,a,c);
       
         ArrayList <Fecha> lista=new ArrayList();
        
         lista.add (a1);        
         lista.add (a2);               
         lista.add (a3);              
         
     //   System.out.println(lista.get().mes);
        
        
        //¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡NO ME SALE!!!!!!!!!!!!! 
                
        
        
        
        
    }
 
}