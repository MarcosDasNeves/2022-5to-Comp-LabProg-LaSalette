package evaluacion.pkg2;

public class Operario extends Empleados {
    
    private String const_cargo;
    private int hora_trabajadas; //(50 x hora)

    public Operario (String const_cargo,int hora_trabajadas,String Nombre,String Domicilio,int Telefono,int Dni) {
        super(Nombre,Domicilio,Telefono,Dni);

        this.const_cargo=const_cargo;
        this.hora_trabajadas=hora_trabajadas;
        
    }

    @Override
    public String toString() {
        return "Operario{" + "const_cargo=" + const_cargo + ", hora_trabajadas=" + hora_trabajadas + ",Nombre" + Nombre + ", Domicilio" + Domicilio +", Telefono" + Telefono + ", Dni" + Dni +'}';
    }

    public String getConst_cargo() {
        return const_cargo;
    }

    public int getHora_trabajadas() {
        return hora_trabajadas;
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

    public void setConst_cargo(String const_cargo) {
        this.const_cargo = const_cargo;
    }

    public void setHora_trabajadas(int hora_trabajadas) {
        this.hora_trabajadas = hora_trabajadas;
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
        public double plataXh (){
        return hora_trabajadas*50;
    }
}
    