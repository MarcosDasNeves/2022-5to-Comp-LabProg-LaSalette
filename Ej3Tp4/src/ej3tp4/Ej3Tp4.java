package ej3tp4;

import static ej3tp4.CuentaAhorros.ModificarInteres;

public class Ej3Tp4 {
    
    public static void main(String[] args) {
       
        CuentaAhorros h1=new CuentaAhorros(30000);
        CuentaAhorros h2=new CuentaAhorros(20000);
        
        ModificarInteres(4);
        
        int mens=h1.calcularlnteresMensual();
        System.out.println(mens);
        
        mens=h2.calcularlnteresMensual();
        System.out.println(mens);
    
         ModificarInteres(5);
         
         System.out.println(h1.calcularlnteresMensual());
         System.out.println(h2.calcularlnteresMensual());
    }
    
}
