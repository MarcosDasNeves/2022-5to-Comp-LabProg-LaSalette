package ej4tp3;

public class Fecha {
   
    private int dia;
    private int mes;
    private int año;

    public Fecha(int dia, int mes, int año) {
       
      if(dia<=31){
        this.dia = dia;
      } else{
            System.out.println("Error");
      }
     
      if(mes<=12){
        this.mes = mes;
      }else{
            System.out.println("Error");
      }
        this.año = año;

    }  

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
   
        public static String mostrarFecha(int dia,int mes,int año){
            return (dia+"/"+mes+"/"+año);
        }
       
        public static String mostrarFecha(int dia,String mes,int año){
            return (mes+dia+","+año);
        }
       
        public static String mostrarFecha(String mes,int dia,int año){
            return (dia+mes+","+año);
        }


}