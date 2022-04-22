package usta.fis;

import java.util.ArrayList;
import java.util.Iterator;


public class ListaCantantesFamosos {

    CantanteFamoso c1=new CantanteFamoso("Maluma", "4 Babys",25);
    CantanteFamoso c2=new CantanteFamoso("Feid", "Monastery",10);
    ArrayList<CantanteFamoso> listaCantantesFamosos=new ArrayList<>();

    public void AgregarCantante(CantanteFamoso cantante){
        listaCantantesFamosos.add(cantante);
    }
    public void EliminarCantante(int indice){
        listaCantantesFamosos.remove(indice);
    }
    public int BuscarIndice(String nombre){
        CantanteFamoso cantante;
        int indice=0;
        Iterator<CantanteFamoso> iterador=listaCantantesFamosos.iterator();
        while (iterador.hasNext()){
            cantante= iterador.next();
            if(cantante.getNombre().equals(nombre)){
                return indice;
            }
            indice++;
        }
        return -1;
    }
    public void ModificarCantante(int indice,String nombre, String DiscoMasVendido, int NumeroDiscosVendidos){
        listaCantantesFamosos.get(indice).setNombre(nombre);
        listaCantantesFamosos.get(indice).setDiscoMasVendido(DiscoMasVendido);
        listaCantantesFamosos.get(indice).setNumeroDiscosVendidos(NumeroDiscosVendidos);
    }
    public void ListarCantantes(){
        CantanteFamoso cantante;
        Iterator<CantanteFamoso> iterador=listaCantantesFamosos.iterator();
        while (iterador.hasNext()){
            cantante=iterador.next();
            System.out.println("Cantante: "+cantante.getNombre());
            System.out.println("Disco con más ventas: "+cantante.getDiscoMasVendido());
            System.out.println("Cantidad de discos vendidos: "+cantante.getNumeroDiscosVendidos()+"\n");
        }
    }
}

