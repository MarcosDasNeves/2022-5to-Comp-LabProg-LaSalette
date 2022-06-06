package ej2tp4;

import java.util.ArrayList;
import java.util.Scanner;


public class Ej2Tp4 {


    public static void main(String[] args) {
        
        int a,b,c,d,e,i;
        
      Scanner sc = new Scanner (System.in);
        //System.out.println("ingrese el nombre");
        //System.out.println("ingrese la edad");
        //System.out.println("ingrese el sexo");
        //System.out.println("ingrese el peso");
        //System.out.println("ingrese la altura");
        
        //a=sc.nextInt();
        //b=sc.nextInt();
        //c=sc.nextInt();
        //d=sc.nextInt();
        //e=sc.nextInt();
        
        Persona p1=new Persona("pedro",18,'h',95,2.10);
        Persona p2=new Persona("Sandra",15,'m',35,1.60);
        Persona p3=new Persona("Juan",46,'i',95,1.87);
        
            ArrayList <Persona> lista=new ArrayList();
    
        lista.add (p1);
        lista.add (p2);
        lista.add (p3);
        
                for(i=0;i<3;i++){
                System.out.println(lista.get(i).toStrin());System.out.println("\n");
                System.out.println(lista.get(i).calcular_IMC());
                System.out.println(lista.get(i).esMayorDeEdad());System.out.println("\n");
                    System.out.println("-----------------------------------------------------------");
                }  
    }
}
