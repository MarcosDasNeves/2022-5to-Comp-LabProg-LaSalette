package ej1tp3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej1Tp3 {

    
    public static void main(String[] args) {

    int i=0; 
    int op=0;
    int can;
    String nom;
    String fab;
    double pre;
        
      Scanner sc = new Scanner (System.in);
      
        System.out.println("--------------------------------------------");
        System.out.println("                                            ");
        System.out.println("                1. Agregar                  ");
        System.out.println("                2. Modificar                ");
        System.out.println("                3. Borrar                   "); 
        System.out.println("                4. Mostrar                  "); 
        System.out.println("                5. Salir                    "); 
        System.out.println("                                            ");
        System.out.println("--------------------------------------------"); 
         
        int r=sc.nextInt();
        
        ArrayList <Herramientas> lista = new ArrayList ();
        
       switch(op){
    
        case 1:
        
            System.out.println("Ingrese el nombre");
            nom=sc.nextLine();
            System.out.println("Ingrese el cantidad");
            can=sc.nextInt();
            System.out.println("Ingrese el precio");
            pre=sc.nextDouble();
            System.out.println("Ingrese el fabricante");
            fab=sc.nextLine();

            Herramientas h1=new Herramientas(nom,can,pre,fab);
            lista. add (h1);
          break;
        
        case 2:
            
            System.out.println("Ingrese el nro de herramienta que quiere modificar");
             i=sc.nextInt(i);
            
            System.out.println("Ingrese el nombre");
            String n=sc.nextLine();
            lista.get(i).setNombre(n);
            
            System.out.println("Ingrese la cantidad");
            int c=sc.nextInt();
            lista.get(i).setCantidad(c);
            
            System.out.println("Ingrese el precio");
            double p=sc.nextDouble();
            lista.get(i).setPrecioUnitario(p);
            
            System.out.println("Ingrese el fabricante");  
            String f=sc.nextLine();
            lista.get(i).setFabricante(f);
          break;
        
        case 3:
            
            System.out.println("Ingrese el numero que quiera eliminar");
            i=sc.nextInt();
            lista.remove (i);
          break;
          
        case 4:
            
            System.out.println("Ingrese el nro de herramientas que quiera ver");
            i=sc.nextInt();
            System.out.println(lista.get(i).getNombre());
            System.out.println(lista.get(i).getCantidad());        
            System.out.println(lista.get(i).getPrecioUnitario());        
            System.out.println(lista.get(i).getFabricante());    
          break;
          
        case 5:
            break;
                    
    }
    }
    
}
