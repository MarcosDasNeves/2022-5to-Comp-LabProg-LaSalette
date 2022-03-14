package ejercicio.pkg4;

import java.util.Scanner;

public class Ejercicio4 {

   
    public static void main(String[] args) {
     
        int a=0, i,cont=0;
        
        Scanner sc = new Scanner (System.in);
     System.out.print ("Introduzcan un nuemero"); 
     a=sc.nextInt();
      
     for (i=1; i<=a; i++){
         if (a % i == 0){
          
             System.out.println(i);
             cont++;
         }
    
                
              
        }
       System.out.println("Hay un total de "+cont+ " numeros divisibles" ) ;

     }
    }
    

