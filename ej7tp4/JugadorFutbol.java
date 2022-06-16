package ej7tp4;

public class JugadorFutbol extends Persona{
    
  private EquipoFutbol equipo;

    public JugadorFutbol(EquipoFutbol equipo, String nombre, int edad, String apellido, char genero) {
        super(nombre, edad, apellido, genero);
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "JugadorFutbol{" + "equipo=" + equipo + "nombre=" + nombre + ", edad=" + edad + ", apellido=" + apellido + ", genero=" + genero +'}';
    }

    public EquipoFutbol getEquipo() {
        return equipo;
    }

    public void setEquipo(EquipoFutbol equipo) {
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    
    
}
