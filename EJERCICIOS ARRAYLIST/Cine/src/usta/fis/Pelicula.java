package usta.fis;

public class Pelicula {
    private int codPelicula;
    private String nombrePelicula;
    private String clasificacion;
    private boolean estaActiva;
    private String horaEntrada;

    public Pelicula(int codPelicula, String nombrePelicula, String clasificacion, boolean estaActiva, String horaEntrada){
        this.codPelicula=codPelicula;
        this.nombrePelicula=nombrePelicula;
        this.clasificacion=clasificacion;
        this.estaActiva=estaActiva;
        this.horaEntrada=horaEntrada;
    }

    public int getCodPelicula() {
        return codPelicula;
    }
    public void setCodPelicula(int codPelicula){
        this.codPelicula=codPelicula;
    }
    public String getNombrePelicula(){
        return nombrePelicula;
    }
    public void setNombrePelicula(String nombrePelicula){
        this.nombrePelicula=nombrePelicula;
    }
    public String getClasificacion(){
        return clasificacion;
    }
    public void setClasificacion(String clasificacion){
        this.clasificacion=clasificacion;
    }
    public boolean getEstaActiva(){
        return estaActiva;
    }
    public void setEstaActiva(boolean estaActiva){
        this.estaActiva=estaActiva;
    }
    public String getHoraEntrada(){
        return horaEntrada;
    }
    public void setHoraEntrada(String horaEntrada){
        this.horaEntrada=horaEntrada;
    }
}
