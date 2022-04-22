package usta.fis;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaPersonas {
    ArrayList<Persona> listaPersonas=new ArrayList<>();
    ArrayList<Persona> listaPersonasCanceladas=new ArrayList<>();

    public void AgregarPersonas(Persona personaNueva){
        listaPersonas.add(personaNueva);
    }
    public void PersonasQueCancelaron(Persona personaCancelada){
        listaPersonasCanceladas.add(personaCancelada);
    }
    public void ListarPersonas(){
        Persona persona;
        Iterator<Persona> iterator=listaPersonas.iterator();
        while (iterator.hasNext()){
            persona=iterator.next();
            System.out.println("Nombre de la persona: "+persona.getNombrePersona());
            System.out.println("Cedula de la persona: "+persona.getCedula());
            System.out.println("Edad de la persona: "+persona.getEdad());
            System.out.println("Genero de la persona: "+persona.getGenero()+"\n");
        }
    }
    public void ListarPersonasCanceladas(){
        Persona persona;
        Iterator<Persona> iterator=listaPersonasCanceladas.iterator();
        while (iterator.hasNext()){
            persona=iterator.next();
            System.out.println("Nombre de la persona: "+persona.getNombrePersona());
            System.out.println("Cedula de la persona: "+persona.getCedula());
            System.out.println("Edad de la persona: "+persona.getEdad());
            System.out.println("Genero de la persona: "+persona.getGenero()+"\n");
        }
    }
    public int BuscarPersona(String nombre){
        Persona persona;
        int indice=0;
        Iterator<Persona> iterator=listaPersonas.iterator();
        while (iterator.hasNext()){
            persona=iterator.next();
            if(persona.getNombrePersona().equals(nombre)){
                return indice;
            }
            indice++;
        }
        return -1;
    }
    public void CancelarEntrada(int indice){
        listaPersonas.remove(indice);
    }
}
