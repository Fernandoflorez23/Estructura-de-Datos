package usta.fis;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaPersonasViendo {
    ArrayList<PersonaViendoPelicula> listaPersonasViendo=new ArrayList<>();

    public void AgregarPersonaViendoPelicula(PersonaViendoPelicula personaViendoPelicula){
        listaPersonasViendo.add(personaViendoPelicula);
    }
    public void ListarPersonasViendo(){
        PersonaViendoPelicula personaViendoPelicula;
        Iterator<PersonaViendoPelicula> iterator=listaPersonasViendo.iterator();
        while (iterator.hasNext()){
            personaViendoPelicula=iterator.next();
            System.out.println("Nombre de persona: "+personaViendoPelicula.getNombrePersona());
            System.out.println("Nombre de pelicula: "+personaViendoPelicula.getNombrePelicula());
            System.out.println("Hora de la función: "+personaViendoPelicula.getIngresoFuncion()+"h\n");
        }
    }
    public int ListarPersonasPorHora(String hora){
        PersonaViendoPelicula personaViendoPelicula;
        int contador=0;
        Iterator<PersonaViendoPelicula> iterator=listaPersonasViendo.iterator();
        while (iterator.hasNext()){
            personaViendoPelicula=iterator.next();
            if(personaViendoPelicula.getIngresoFuncion().equals(hora)){
                contador++;
                System.out.println("Nombre de persona: "+personaViendoPelicula.getNombrePersona());
                System.out.println("Nombre de pelicula: "+personaViendoPelicula.getNombrePelicula());
                System.out.println("Hora de la función: "+personaViendoPelicula.getIngresoFuncion()+"\n");
            }
        }
        return contador;
    }
}
