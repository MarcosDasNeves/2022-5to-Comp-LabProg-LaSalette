package ej2tp3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej2Tp3 {

    public static void main(String[] args) {
     
       int a,i,b; 
        
        
     Scanner sc = new Scanner (System.in);
        System.out.println("--------------------------------------------");
        System.out.println("                                            ");
        System.out.println("         1. promedio toda la clase          ");
        System.out.println("         2. promedio de un alumno           ");
        System.out.println("         3. nota mas baja                   ");
        System.out.println("         4. nota mas alta                   ");
        System.out.println("                                            ");                            
        System.out.println("--------------------------------------------"); 
         
        a=sc.nextInt();
        
       Alumnos n1=new Alumnos ("gorge","gorge", 23213213,3,4,5); 
       Alumnos n2=new Alumnos ("luis","luis",55443568,5,5,5); 
       Alumnos n3=new Alumnos ("mateo","mateo",86518579,1,2,1); 
       Alumnos n4=new Alumnos ("lautaro","lautaro",12345678,2,4,9 );
       Alumnos n5=new Alumnos ("lucci","nazo",87654321,7,6,9 );
       Alumnos n6=new Alumnos ("sekin","sekin",23568974,7,7,7);
       Alumnos n7=new Alumnos ("luna","luna",89453659,10,10,10);
       Alumnos n8=new Alumnos ("eze","eze",66666666,6,6,6);
       Alumnos n9=new Alumnos ("cone","cone",67676778,10,1,4);
       Alumnos n10=new Alumnos ("teje","teje",12569023,6,7,3);
       Alumnos n11=new Alumnos ("capia","carapez",12233455,1,2,3);
       Alumnos n12=new Alumnos ("napo","napo",11111111,1,1,1);
       Alumnos n13=new Alumnos ("leo","leo",43567412,10,1,6);
       Alumnos n14=new Alumnos ("tomas","tomas",22222222,9,9,5);
       Alumnos n15=new Alumnos ("dulce","dulce",56758493,6,8,1);
       
           ArrayList <Alumnos> lista=new ArrayList();
           
        lista.add (n1);
        lista.add (n2);
        lista.add (n3);
        lista.add (n4);
        lista.add (n5);
        lista.add (n6);
        lista.add (n7);
        lista.add (n8);
        lista.add (n9);
        lista.add (n10);
        lista.add (n11);
        lista.add (n12);
        lista.add (n13);
        lista.add (n14);
        lista.add (n15);
                
                 
     switch (a) {
     
         case 1:
             
                for(i=0;i<15;i++){
                System.out.println(lista.get(i).SumaNota());
                }
             break;
                
         case 2: 
               
             System.out.println("ingre el alumno(0 al 15)");
             b=sc.nextInt();
             
                System.out.println(lista.get(b).nombre);
                System.out.println(lista.get(b).SumaNota());
                
             break;
                  
         case 3:
             
             double menornota=11;
              for(i=0;i<15;i++){
             if(lista.get(i).SumaNota()< menornota){
                 menornota=lista.get(i).SumaNota();
                 
                 System.out.println(lista.get(i).SumaNota());
                }
             }
             
             break;
                  
         case 4:
             
              double mayornota=0;
              for(i=0;i<15;i++){
              if(lista.get(i).SumaNota()> mayornota){
                 mayornota=lista.get(i).SumaNota();
                 
                }
             }
              
             break;
     } 
        

    }
    
}
