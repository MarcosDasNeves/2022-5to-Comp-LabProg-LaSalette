package evaluacion.pkg2;

import java.util.Scanner;

public class Evaluacion2 {

    public static void main(String[] args) {
     
      
        int clase;//,i;
        
        String nom,domi;
        int telf,dni;
        double suel,imp; //Constructor
        double tari; //Consultor
        int hora; //Consultor
        String con_cargo; //Operario
        int hora_tra; //Operario
         Scanner sc = new Scanner (System.in);
        
        System.out.println("-----------------------------------");
        System.out.println("-          1. constructor         -");
        System.out.println("-          2. operario            -");
        System.out.println("-          3. consultor           -");
        System.out.println("-----------------------------------");

        clase=sc.nextInt();
        
        switch(clase){
       // if(clase==1){
        
        case 1:
     System.out.print ("ingrese el nombre del Constructor ");  
     sc.nextLine();
     nom=sc.nextLine();
     
     System.out.print ("ingrese el domicilio ");  
     domi=sc.nextLine();
     
     System.out.print ("ingrese el telefono ");  
     telf=sc.nextInt();
     
     System.out.print ("ingrese el dni ");  
     dni=sc.nextInt();
     
     System.out.print ("ingrese el sueldo ");  
     suel=sc.nextDouble();
     
     System.out.print ("ingrese impuestos ");  
     imp=sc.nextDouble();
     
     Constructor primero = new Constructor (suel,imp,nom,domi,telf,dni);
      System.out.print ("ingrese el nombre del sueldo "); System.out.println(primero.plata());
          System.out.print ("ingrese el nombre del abonar a operario "); System.out.println(primero.pagar());
     
     
          System.out.print ("\ningrese el nombre del Constructor ");  
     sc.nextLine();
     nom=sc.nextLine();
     
     System.out.print ("ingrese el domicilio ");  
     domi=sc.nextLine();
     
     System.out.print ("ingrese el telefono ");  
     telf=sc.nextInt();
     
     System.out.print ("ingrese el dni ");  
     dni=sc.nextInt();
     
     System.out.print ("ingrese el sueldo ");  
     suel=sc.nextDouble();
     
     System.out.print ("ingrese impuestos ");  
     imp=sc.nextDouble();
     
     Constructor segundo = new Constructor (suel,imp,nom,domi,telf,dni);
        System.out.print ("ingrese el nombre del sueldo "); System.out.println(segundo.plata());
            System.out.print ("ingrese el nombre del abonar a operario "); System.out.println(segundo.pagar());
     
       // }else{
            break;
   //----   ----   ----   ----   ----   ----   ----   ----   ----   ----   ----   ----   ----   ---- 
     
       // }if (clase==2){ 
            
        case 3:
     System.out.print ("ingrese el nombre del Consultor ");  
     sc.nextLine();
     nom=sc.nextLine();
     
     System.out.print ("ingrese el domicilio ");  
     domi=sc.nextLine();
     
     System.out.print ("ingrese el telefono ");  
     telf=sc.nextInt();
     
     System.out.print ("ingrese el dni ");  
     dni=sc.nextInt();
     
     System.out.print ("ingrese la tarifa ");  
     tari=sc.nextDouble();
     
     System.out.print ("ingrese las horas ");  
     hora=sc.nextInt();
     
     Consultor tercero = new Consultor (hora,tari,nom,domi,telf,dni);   
        System.out.print ("\nSueldo por hora "); System.out.println(tercero.Tarifaxh());

     
          System.out.print ("\ningrese el nombre del Consultor ");  
     sc.nextLine();
     nom=sc.nextLine();
     
     System.out.print ("ingrese el domicilio ");  
     domi=sc.nextLine();
     
     System.out.print ("ingrese el telefono ");  
     telf=sc.nextInt();
     
     System.out.print ("ingrese el dni ");  
     dni=sc.nextInt();
     
     System.out.print ("ingrese la tarifa ");  
     tari=sc.nextDouble();
     
     System.out.print ("ingrese las horas ");  
     hora=sc.nextInt();
     
     Consultor cuarto  = new Consultor (hora,tari,nom,domi,telf,dni); 
        System.out.print ("\nSueldo por hora "); System.out.println(cuarto.Tarifaxh());
     
     if (cuarto.getHora()> tercero.getHora()){
         System.out.println("\nel operario que mas trabaja es el cuarto: "); System.out.println(cuarto.getNombre());
     }else{} if(cuarto.getHora()< tercero.getHora()){
         System.out.println("\nel operario que mas trabaja es el tercero: "); System.out.println(tercero.getNombre());
     }else{} if (cuarto.getHora()== tercero.getHora()){
         System.out.println("\ntrabajaron la misma cantidad de horas "); 
     } 
        
    
     
       // }else{
            break;
   //----   ----   ----   ----   ----   ----   ----   ----   ----   ----   ----   ----   ----   ---- 
      //  }if (clase==3){     
        case 2:  
     System.out.print ("ingrese el nombre del Operario ");  
     sc.nextLine();
     nom=sc.nextLine();
     
     System.out.print ("ingrese el domicilio ");  
     domi=sc.nextLine();
     
     System.out.print ("ingrese el telefono ");  
     telf=sc.nextInt();
     
     System.out.print ("ingrese el dni ");  
     dni=sc.nextInt();
     
     System.out.print ("ingrese el constructor a cargo ");  
        sc.nextLine();
     con_cargo=sc.nextLine();
     
     System.out.print ("ingrese las horas trabajadas ");  
     hora_tra=sc.nextInt();
     
     Operario quinto = new Operario (con_cargo,hora_tra,nom,domi,telf,dni);   
     System.out.print ("\nSueldo por hora "); System.out.println(quinto.plataXh());
     
     System.out.print ("\ningrese el nombre del Operario ");  
     sc.nextLine();
     nom=sc.nextLine();
     
     System.out.print ("ingrese el domicilio ");  
     domi=sc.nextLine();
     
     System.out.print ("ingrese el telefono ");  
     telf=sc.nextInt();
     
     System.out.print ("ingrese el dni ");  
     dni=sc.nextInt();
     
     System.out.print ("ingrese el constructor a cargo ");
        sc.nextLine();
     con_cargo=sc.nextLine();
     
     System.out.print ("ingrese las horas trabajadas ");  
     hora_tra=sc.nextInt();
     
     Operario sexto = new Operario (con_cargo,hora_tra,nom,domi,telf,dni);  
               System.out.println(sexto.plataXh());
               
       System.out.print ("\n\nOperario 1:\n");System.out.println (quinto.getNombre());
                System.out.println(quinto.plataXh());
       System.out.print ("\nOperario 2:\n");System.out.println (sexto.getNombre());
                System.out.println(sexto.plataXh());
     
        //}
            break;
   //----   ----   ----   ----   ----   ----   ----   ----   ----   ----   ----   ----   ----   ----        
    
            }
   
   
    }
  
}

    
    
