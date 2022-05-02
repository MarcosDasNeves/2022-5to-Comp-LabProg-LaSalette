package prueba1;

public class Consultor {
    
    private String Nombre;
    private String Domicilio;
    private int Telefono;
    private int Dni;
    private int hora;
    private double Tarifaxh;

    public Consultor(String Nombre, String Domicilio, int Telefono, int Dni, int hora, double Tarifaxh) {
        this.Nombre = Nombre;
        this.Domicilio = Domicilio;
        this.Telefono = Telefono;
        this.Dni = Dni;
        this.hora = hora;
        this.Tarifaxh = Tarifaxh;
        
        
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

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public double getTarifaxh() {
        return Tarifaxh;
    }

    public void setTarifaxh(double Tarifaxh) {
        this.Tarifaxh = Tarifaxh;
    }
    
    
    
}
