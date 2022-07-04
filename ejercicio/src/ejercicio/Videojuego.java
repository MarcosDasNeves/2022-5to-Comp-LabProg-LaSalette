package ejercicio;

public class Videojuego {
    
    String Titulo;
    int HorasEstimadas=10;
    boolean Entregado=false;
    String Genero;
    String Compania;

    public Videojuego() {
    }

    public Videojuego(String Titulo, int HorasEstimadas) {
        this.Titulo = Titulo;
        this.HorasEstimadas = HorasEstimadas;
    }

    public Videojuego(String Titulo, int HorasEstimadas, String Genero, String Compania) {
        this.Titulo = Titulo;
        this.HorasEstimadas = HorasEstimadas;
        this.Genero = Genero;
        this.Compania = Compania;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getHorasEstimadas() {
        return HorasEstimadas;
    }

    public void setHorasEstimadas(int HorasEstimadas) {
        this.HorasEstimadas = HorasEstimadas;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getCompania() {
        return Compania;
    }

    public void setCompania(String Compania) {
        this.Compania = Compania;
    }

    @Override
    public String toString() {
        return "Videojuego{" + "Titulo=" + Titulo + ", HorasEstimadas=" + HorasEstimadas + ", Entregado=" + Entregado + ", Genero=" + Genero + ", Compania=" + Compania + '}';
    }
 //---------------------------------------------   
    public boolean entregar(){
    
        return Entregado = true;  
    }

    public boolean devolver(){
    
        return Entregado = false;  
    }   
    
        
    public boolean isEntregado(){
    
        return Entregado;  
    }
}
