package sistema.de.facturacion;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaDeFacturacion {

    public static void main(String[] args) {

                int a,i;
        
      Scanner sc = new Scanner (System.in);
        System.out.println("--------------------------------------------");
        System.out.println("                                            ");
        System.out.println("                1. ver compra               ");
        System.out.println("                2. ingresar producto        ");
        System.out.println("                3. precio                   ");  
        System.out.println("                4. cambiar precio           ");
        System.out.println("                5. guardar                  ");
        System.out.println("                6.                          ");
        System.out.println("                                            ");
        System.out.println("--------------------------------------------"); 
         
        a=sc.nextInt();
        
        switch (a){
        
            case 1:
                    break;
            case 2:
                    break;
            case 3:
                    break;
            case 4:
                    break;
            case 5:
                    break;
        }
        
        
      productos p1=new productos (200,123456789,"holaproducto",30);      
       ArrayList <productos> lista=new ArrayList();
       lista.add (p1);

        try {
            PrintWriter writer = new PrintWriter("ticket.txt", "UTF-8");
            writer.println(lista.add(p1));     
            writer.println(p1);             
            writer.println("Segunda línea") ;
            writer.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
        
      
    
    

