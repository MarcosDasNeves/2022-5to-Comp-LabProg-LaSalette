package sistema.de.facturacion;

public class productos {
    
    int stocks;
    int codigo;
    String descripcion;
    double precio;

    public productos(int stocks, int codigo, String descripcion, double precio) {
        this.stocks = stocks;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public int getStocks() {
        return stocks;
    }

    public void setStocks(int stocks) {
        this.stocks = stocks;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
    
}
