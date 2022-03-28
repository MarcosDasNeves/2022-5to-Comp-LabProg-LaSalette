
import java.util.ArrayList;
import java.util.Scanner;


public class JavaApplication10 {
    
    public static void main(String[] args) {
        
        String a;
        int b,c,i;
        
     Scanner sc = new Scanner (System.in);
     System.out.print ("ingrese el nombre del empleado ");  
     a=sc.nextLine();
     System.out.print ("ingrese las horas trabajadas ");  
     b=sc.nextInt();
     System.out.print ("ingrese la tarifa  ");  
     c=sc.nextInt();
     
        empleado e1=new empleado (a,b,c);
//------------------------------------------------------------------------------

     sc.nextLine();
     System.out.print ("ingrese el nombre del empleado ");  
     a=sc.nextLine();
     System.out.print ("ingrese las horas trabajadas ");  
     b=sc.nextInt();
     System.out.print ("ingrese la tarifa  ");  
     c=sc.nextInt();
     
        empleado e2=new empleado (a,b,c);

    //------------------------------------------------------------------------------
  
    sc.nextLine();
     System.out.print ("ingrese el nombre del empleado ");  
     a=sc.nextLine();
     System.out.print ("ingrese las horas trabajadas ");  
     b=sc.nextInt();
     System.out.print ("ingrese la tarifa  ");  
     c=sc.nextInt();
     
        empleado e3=new empleado (a,b,c);
//------------------------------------------------------------------------------
 
    sc.nextLine();
     System.out.print ("ingrese el nombre del empleado ");  
     a=sc.nextLine();
     System.out.print ("ingrese las horas trabajadas ");  
     b=sc.nextInt();
     System.out.print ("ingrese la tarifa  ");  
     c=sc.nextInt();
     
        empleado e4=new empleado (a,b,c);
//------------------------------------------------------------------------------
   
    sc.nextLine();
     System.out.print ("ingrese el nombre del empleado ");  
     a=sc.nextLine();
     System.out.print ("ingrese las horas trabajadas ");  
     b=sc.nextInt();
     System.out.print ("ingrese la tarifa  ");  
     c=sc.nextInt();
     
        empleado e5=new empleado (a,b,c);
//------------------------------------------------------------------------------ 
        
    ArrayList <empleado> lista=new ArrayList();
    
    lista.add (e1);
    lista.add (e2);
    lista.add (e3);
    lista.add (e4);
    lista.add (e5);
     
        for (i=0;i<lista.size();i++){
            System.out.println(lista.get(i).sueldobruto());
        }
    }
    
}
