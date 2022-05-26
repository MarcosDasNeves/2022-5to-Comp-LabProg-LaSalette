package ej4tp3;

public class Fecha {
     
    String mes2;
    int mes;
    int dia;
    int año;

    public Fecha(int mes, int dia, int año) {
        this.mes = mes;
        this.dia = dia;
        this.año = año;
        
        
    }

    public Fecha(String mes2, int dia, int año) {
        this.mes2 = mes2;
        this.dia = dia;
        this.año = año;
    }
    
    
    public Fecha(int dia,String mes2, int año) {
        this.dia = dia;
        this.mes2 = mes2;
        this.año = año;
    }
    

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
}