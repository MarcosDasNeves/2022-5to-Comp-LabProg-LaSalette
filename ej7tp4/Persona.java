package ej7tp4;

public class Persona {
    
protected String nombre;
protected int edad;
protected String apellido;
protected char genero;

    public Persona(String nombre, int edad, String apellido, char genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellido = apellido;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", apellido=" + apellido + ", genero=" + genero + '}';
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
