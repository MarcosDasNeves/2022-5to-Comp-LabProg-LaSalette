package ejercicio.pkg3;

import java.util.Scanner;


public class Ejercicio3 {

    
    public static void main(String[] args) {
   
        int n=0,i,fac=1;
        
      Scanner sc = new Scanner (System.in);
     System.out.print ("ingrese el primer numero"); 
     n=sc.nextInt();
             
     for (i=1;i<=n;i++){
     
     fac = i*fac;
     
    System.out.println ("el factorial es" + fac);
     }
     
     
    }
    
}
