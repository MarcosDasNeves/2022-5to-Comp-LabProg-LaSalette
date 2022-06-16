package ej7tp4;

public class Aficcionado extends Persona{
    
    private EquipoFutbol equipoFavorito;
    private JugadorFutbol JugadorFavorito;

    public Aficcionado(EquipoFutbol equipoFavorito, JugadorFutbol JugadorFavorito, String nombre, int edad, String apellido, char genero) {
        super(nombre, edad, apellido, genero);
        this.equipoFavorito = equipoFavorito;
        this.JugadorFavorito = JugadorFavorito;
    }

        @Override
    public String toString() {
        return "Aficcionado{" + "equipoFavorito=" + equipoFavorito + ", JugadorFavorito=" + JugadorFavorito + "nombre=" + nombre + ", edad=" + edad + ", apellido=" + apellido + ", genero=" + genero +'}';
    }
}

