package usta.fis;

public class Persona {
    private int cedula, edad;
    private String nombrePersona;
    private String genero;

    public Persona(int cedula,int edad,String nombrePersona,String genero){
        this.cedula=cedula;
        this.edad=edad;
        this.nombrePersona=nombrePersona;
        this.genero=genero;
    }

    public int getCedula() {
        return cedula;
    }
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombrePersona() {
        return nombrePersona;
    }
    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
}
