package usta.fis;

import java.util.Iterator;

public class PersonaViendoPelicula extends Persona {
    private String nombrePelicula;
    private String ingresoFuncion;

    public PersonaViendoPelicula(int cedula,int edad,String nombrePersona,String genero,String nombrePelicula,String ingresoFuncion){
        super(cedula,edad,nombrePersona,genero);
        this.nombrePelicula=nombrePelicula;
        this.ingresoFuncion=ingresoFuncion;
    }
    public String getNombrePelicula() {
        return nombrePelicula;
    }
    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }
    public String getIngresoFuncion() {
        return ingresoFuncion;
    }
    public void setIngresoFuncion(String ingresoFuncion) {
        this.ingresoFuncion = ingresoFuncion;
    }
}
