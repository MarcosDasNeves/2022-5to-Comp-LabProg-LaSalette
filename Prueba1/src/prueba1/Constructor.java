package prueba1;

public class Constructor {
 
    private String Nombre;
    private  String Domicilio;
    private int Telefono;
    private int Dni;
    private double Sueldo;
    private double Impuestos;

    public Constructor(String Nombre, String Domicilio, int Telefono, int Dni, double Sueldo, double Impuestos) {
        this.Nombre = Nombre;
        this.Domicilio = Domicilio;
        this.Telefono = Telefono;
        this.Dni = Dni;
        this.Sueldo = Sueldo;
        this.Impuestos = Impuestos;
        
        
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    public double getImpuestos() {
        return Impuestos;
    }

    public void setImpuestos(double Impuestos) {
        this.Impuestos = Impuestos;
    }
        public double plata (){
        return Sueldo - Impuestos;
        }
        
        public double pagar (){
            double plata = Sueldo - Impuestos;
        return Sueldo-plata;
        }
}

