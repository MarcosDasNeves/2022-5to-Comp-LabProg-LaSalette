/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author PC01
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double r,d,a;
        Scanner scanf = new Scanner (System.in);
        System.out.println("Ingrese el radio: ");
        r=scanf.nextDouble();
        
        d=r*2;
        a= Math.PI*(r*r);
        
        System.out.println("El diametro es "+d+" y el area es "+a);
    }
    
}
