package evaluacion.pkg2;

public class Consultor extends Empleados {

    private int hora;
    private double Tarifaxh;

    public Consultor (int hora,double Tarifaxh,String Nombre,String Domicilio,int Telefono,int Dni) {
        super(Nombre,Domicilio,Telefono,Dni);

        this.hora=hora;
        this.Tarifaxh=Tarifaxh;
    }  

    @Override
    public String toString() {
        return "Consultor{" + "hora=" + hora + ", Tarifaxh=" + Tarifaxh + ",Nombre" + Nombre + ", Domicilio" + Domicilio +", Telefono" + Telefono + ", Dni" + Dni +'}';
    }

    public int getHora() {
        return hora;
    }

    public double getTarifaxh() {
        return Tarifaxh;
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

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setTarifaxh(double Tarifaxh) {
        this.Tarifaxh = Tarifaxh;
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

            
    public double Tarifaxh (){
            Tarifaxh = Tarifaxh * hora;
        return Tarifaxh;
    }
}

 
   