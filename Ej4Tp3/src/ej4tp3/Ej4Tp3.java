package ej4tp3;

import static ej4tp3.Fecha.mostrarFecha;

public class Ej4Tp3 {

    public static void main(String[] args) {
       
       Fecha f1=new Fecha(02,06,2022);
        System.out.println(mostrarFecha(02,6,2022));
        System.out.println(mostrarFecha(02,"junio ",2022));
        System.out.println(mostrarFecha(" junio",02,2022));
    }
   
}