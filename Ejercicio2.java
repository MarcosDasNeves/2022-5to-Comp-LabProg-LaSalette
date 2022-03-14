package ejercicio.pkg2;

import java.util.Scanner;


public class Ejercicio2 {


    public static void main(String[] args) {
  
        int a = 0;
        
        if ((a % 4 == 0) && ((a % 100 != 0) || (a % 400 == 0)))
	System.out.println("El año es bisiesto");
else
	System.out.println("El año no es bisiesto");
    }
    
}
