/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author PC01
 */
public class Factura {
    int numart;
    String descart;
    int cantart;
    double precart;
    
    public Factura (int numart, String descart, int cantart, double precart){
        this.numart = numart;
        this.descart = descart;
        this.cantart = cantart;
        this.precart = precart;
        
    }

    public int getNumart() {
        return numart;
    }

    public void setNumart(int numart) {
        this.numart = numart;
    }

    public String getDescart() {
        return descart;
    }

    public void setDescart(String descart) {
        this.descart = descart;
    }

    public int getCantart() {
        return cantart;
    }

    public void setCantart(int cantart) {
        this.cantart = cantart;
    }

    public double getPrecart() {
        return precart;
    }

    public void setPrecart(double precart) {
        this.precart = precart;
    }
    
    public double obtenerMontoFactura (int cantart, double precart){
        
        return cantart*precart;
    }
}
