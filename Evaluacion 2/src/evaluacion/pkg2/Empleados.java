package evaluacion.pkg2;

public class Empleados {
    
    protected String Nombre;
    protected String Domicilio;
    protected int Telefono;
    protected int Dni;

    public Empleados(String Nombre, String Domicilio, int Telefono, int Dni) {
        this.Nombre = Nombre;
        this.Domicilio = Domicilio;
        this.Telefono = Telefono;
        this.Dni = Dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public int getTelefono() {
        return Telefono;
    }

    public int getDni() {
        return Dni;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }
    
}
