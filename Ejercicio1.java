package ejercicio.pkg1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
     
    int a,b,c,prom,sum,may = 0,med = 0,men = 0,prod;    
       
    Scanner sc = new Scanner (System.in);
     System.out.print ("ingrese el primer numero");  
     a=sc.nextInt();
     System.out.print ("ingrese el seundo numero");  
     b=sc.nextInt();
     System.out.print ("ingrese el tercer numero");  
     c=sc.nextInt();
     
        if(a==b){
            if(a==c){
            System.out.print("\ntodos los numeros son iguales"); }
            else {
            System.out.print("\nA Y B son iguales"); }
        }
        else  if (b==c){
            System.out.print("\nB Y C son iguales");
        } else{
            System.out.print("\nSon todos los numeros distintos");}

        sum = (a+b+c);
        prom = (sum)/3;  
             System.out.printf ("\nEl promedio es %d", prom);
             System.out.printf ("\nLa suma de todos los numero es: %d" ,sum);
             
             if (a > b && a >c ){ may = a; if (b>c){ med = b; men = c; }else{med = c; men = b;}}
             if (b > a && b >c ){ may = b; if (a>c){ med = c; men = a; }else{med = a; men = c;}}
             if (c > b && c >a ){ may = c; if (a>b){ med = a; men = b; }else{med = b; men = a;}}
             
        prod = may * men;  
             System.out.printf ("\nEl producto entre el mayor y el menor es: %d", prod);
        }
     
    }