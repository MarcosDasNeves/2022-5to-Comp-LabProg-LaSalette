

public class empleado {
    String nombre;
    double horas;
    double tarifa;

    public empleado (String nombre,double horas,double tarifa){
    
       this.horas=horas;
       this.nombre=nombre;
       this.tarifa=tarifa;
    }

    
    public double sueldobruto (){
    if(horas<=40){
        
         return horas*tarifa ;
                 
     }else{
    }if (horas>40){
     
        return (horas-40)*1.5;
     }
        return 0;
    }

}
