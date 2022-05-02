package prueba1;

public class Operario {
    
    private String Nombre;
    private String Domicilio;
    private int Telefono;
    private int Dni;
    private String const_cargo;
    private int hora_trabajadas; //(50 x hora)

    public Operario(String Nombre, String Domicilio, int Telefono, int Dni, String const_cargo, int hora_trabajadas) {
        this.Nombre = Nombre;
        this.Domicilio = Domicilio;
        this.Telefono = Telefono;
        this.Dni = Dni;
        this.const_cargo = const_cargo;
        this.hora_trabajadas = hora_trabajadas;
        
        
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

    public String getConst_cargo() {
        return const_cargo;
    }

    public void setConst_cargo(String const_cargo) {
        this.const_cargo = const_cargo;
    }

    public int getHora_trabajadas() {
        return hora_trabajadas;
    }

    public void setHora_trabajadas(int hora_trabajadas) {
        this.hora_trabajadas = hora_trabajadas;
    }

  
    public double plataXh (){
        return hora_trabajadas*50;
    }


    
    }

