package ej3tp3;

public class Autos {
    
    String nombre;
    String marca;
    double precio;
    String estado;

    public Autos(String nombre, String marca, double precio, String estado) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.estado = estado;
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


}