package sistema.de.facturacion;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

public class SistemaDeFacturacion {

    public static void main(String[] args) {

            
      productos p1=new productos (200,123456789,"holaproducto",30); 
      productos p2=new productos (0,000000000,"holaproducto",300);       
       ArrayList <productos> lista=new ArrayList();
       lista.add (p1);
       lista.add (p2);
        
        try {
            PrintWriter writer = new PrintWriter("ticket.txt", "UTF-8");
            writer.println(lista.add(p1));           
            writer.println("Segunda línea");
            writer.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
        
      
    
    

