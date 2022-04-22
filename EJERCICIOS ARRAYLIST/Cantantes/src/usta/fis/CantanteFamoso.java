package usta.fis;

public class CantanteFamoso {
    private String nombre;
    private String discoMasVendido;
    private int numeroDiscosVendidos;

    public CantanteFamoso(String nombre, String DiscoMasVendido, int NumeroDiscosVendidos){
        this.nombre=nombre;
        this.discoMasVendido=DiscoMasVendido;
        this.numeroDiscosVendidos=NumeroDiscosVendidos;
    }
    public String getNombre(){
        return nombre;
    }
    public String getDiscoMasVendido(){
        return discoMasVendido;
    }
    public int getNumeroDiscosVendidos() {
        return numeroDiscosVendidos;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setDiscoMasVendido(String nombreDisco){
        this.discoMasVendido=nombreDisco;
    }
    public void setNumeroDiscosVendidos(int numeroDiscosVendidos){
        this.numeroDiscosVendidos=numeroDiscosVendidos;
    }
}
