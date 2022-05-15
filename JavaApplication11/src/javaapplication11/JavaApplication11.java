/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author PC01
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanf = new Scanner(System.in);
        int bin, i, j, t=1, dec=0, mu=1;

        System.out.println("ingrese el codigo binario (8 digitos) ");
        bin = scanf.nextInt();

        ArrayList<Integer> particion = new ArrayList();

        for (i=0; i<8; i++) {
            if (bin % 10 == 0) { particion.add(0); }
            else { particion.add(1); }
            bin = bin / 10;
        }
        
        for (i=0; i<=7; i++) {
            //for (j=0; j<=i; j++) {
            dec = dec + particion.get(i) * mu;
            //}
            System.out.println(particion.get(i)+" * "+mu);
            mu= mu * 2;
        }

        System.out.println("el numero es " + dec);

    }

}
    
    
