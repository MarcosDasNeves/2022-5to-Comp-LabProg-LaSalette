package ejercicio;

public class Serie {
   
    String titulo;
    int Numerodetemporadas=3;
    boolean Entregado=false;
    String genero;
    String creador;

    public Serie() {
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, int Numerodetemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.Numerodetemporadas = Numerodetemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumerodetemporadas() {
        return Numerodetemporadas;
    }

    public void setNumerodetemporadas(int Numerodetemporadas) {
        this.Numerodetemporadas = Numerodetemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" + "titulo=" + titulo + ", Numerodetemporadas=" + Numerodetemporadas + ", Entregado=" + Entregado + ", genero=" + genero + ", creador=" + creador + '}';
    }
//--------------------------------------------
    public boolean entregar(){
    
        return true;  
    }

    public boolean devolver(){
    
        return false;  
    }      
    
    public boolean isEntregado(){
    
        return Entregado;  
    }      
    
}
