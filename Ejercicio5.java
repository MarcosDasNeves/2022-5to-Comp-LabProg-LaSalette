package ejercicio.pkg5;

import java.util.Scanner;


public class Ejercicio5 {

  
    public static void main(String[] args) {
      
        int a=0, i,mul;
        
     Scanner sc = new Scanner (System.in);
       System.out.print ("Introduzcan un nuemero"); 
         a=sc.nextInt();
      
     for (i=1; i<=10; i++){
         
         mul=a*i;
         System.out.println(mul);
 
      }
     
     
    }
    
}
