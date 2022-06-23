package ej3tp4;

public class CuentaAhorros {
    
    private static int tasalnteresAnual;
    private int saldoAhorros;

    public CuentaAhorros(int saldoAhorros) {
        this.saldoAhorros = saldoAhorros;
    }
    
    
    
    public int calcularlnteresMensual (){
    
        int calcularlnteresMensual=tasalnteresAnual*saldoAhorros/12;
        
        return calcularlnteresMensual;
    }
    
    public static void ModificarInteres(int nuevosInteres){
        tasalnteresAnual=nuevosInteres;
    }
}
