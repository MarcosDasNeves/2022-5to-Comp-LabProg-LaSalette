package ejercicio.pkg6;

import java.util.Scanner;


public class Ejercicio6 {


    public static void main(String[] args) {
        
        int a,b,i,s = 0;
        
        Scanner sc = new Scanner (System.in);
       System.out.print ("Introduzcan un nuemero "); 
         a=sc.nextInt();
       System.out.print ("Introduzcan un nuemero "); 
         b=sc.nextInt();
         
        for (i=a+1;i<b;i++){
            
            if (i%5==0){
            s=s+i;
            }

         }
             System.out.print ("la suma de los multiplos son: "+s ); 
        
    }
}
