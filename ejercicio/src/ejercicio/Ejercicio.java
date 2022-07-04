package ejercicio;

import java.util.ArrayList;

public class Ejercicio {

    public static void main(String[] args) {
        
        int i,JEntregados=0,SEntregados = 0;
        
    Serie s1=new Serie("dark",3,"Misterio","Baran bo Odar");
    Serie s2=new Serie("Flash",8,"Ciencia ficción","Greg Berlanti, Andrew Kreisberg, Geoff Johns");
    Serie s3=new Serie("The Rain",3,"Drama","Jannik Tai Mosholt; Esben Toft Jacobsen; Christian Potalivo");
    Serie s4=new Serie("Equinox",1,"Suspenso ","Søren Balle; Mads Matthiesen");
    Serie s5=new Serie("13 Reasons Why",4,"Drama ","Brian Yorkey");
    
        ArrayList <Serie> lista=new ArrayList();
    
        lista.add (s1);
        lista.add (s2);
        lista.add (s3);
        lista.add (s4);
        lista.add (s5);    
        
    Videojuego v1=new Videojuego("lol",10,"MOBA","Riot Games");
    Videojuego v2=new Videojuego("terraria",10,"Sandbox","Re-Logic");
    Videojuego v3=new Videojuego("gta v",10,"Accion","Rockstar");
    Videojuego v4=new Videojuego("factorio",10,"Supervivencia","Wube Software");
    Videojuego v5=new Videojuego("minecraft",10,"Sandbox","Mojang Studios​");
    
        ArrayList <Videojuego> lista2=new ArrayList();
    
        lista2.add (v1);
        lista2.add (v2);
        lista2.add (v3);
        lista2.add (v4);
        lista2.add (v5);
        
        
        for (i=0; i<5; i++) 
            if (lista2.get(i).isEntregado() == true) JEntregados++;
        System.out.println("Juegos Entregados: " + JEntregados);
        for (i=0; i<5; i++) 
            if (lista.get(i).isEntregado() == true) SEntregados++;
        System.out.println("Juegos Entregados: " + JEntregados);  
   
        for (i=0; i<5; i++) lista2.get(i).devolver();
        for (i=0; i<5; i++) lista.get(i).devolver();
       
    
    
    }
    
    
    
}
