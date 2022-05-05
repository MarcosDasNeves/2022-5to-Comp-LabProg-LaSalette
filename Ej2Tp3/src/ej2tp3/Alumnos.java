package ej2tp3;

public class Alumnos {
    
    String nombre;
    String apellido;
    int dni;
    double nota1;
    double nota2; 
    double nota3;
    
    public Alumnos (String nombre,String apellido,int dni,int nota1,int nota2,int nota3){
    
    this.nombre=nombre;    
    this.apellido=apellido;
    this.dni=dni;
    this.nota1=nota1;
    this.nota2=nota2;
    this.nota3=nota3;   
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    
    public double SumaNota (){
    
    return (nota1+nota2+nota3)/3;
    }
    
}
