package usta.fis;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

public class ListaPeliculas {
    ArrayList<Pelicula> listaPeliculas=new ArrayList<>();

    public void AgregarPelicula(Pelicula peliculaNueva){
        listaPeliculas.add(peliculaNueva);
    }
    public void ListarPeliculas(String horaActual){
        Pelicula pelicula;
        Iterator<Pelicula> iterador=listaPeliculas.iterator();
        while (iterador.hasNext()){
            pelicula=iterador.next();
            if(pelicula.getHoraEntrada().equals(horaActual))
                System.out.println("** Activa en este momento **");
            System.out.println("Nombre pelicula: "+pelicula.getNombrePelicula());
            System.out.println("Clasificacion: "+pelicula.getClasificacion());
            System.out.println("Hora de inicio: "+pelicula.getHoraEntrada()+"\n");
        }
    }
    public int PeliculasPorHora(String hora){
        Pelicula pelicula;
        int cantidadPeliculas=0;
        Iterator<Pelicula>iterator=listaPeliculas.iterator();
        while (iterator.hasNext()){
            pelicula=iterator.next();
            if(pelicula.getHoraEntrada().equals(hora)){
                cantidadPeliculas++;
                System.out.println("Nombre pelicula: "+pelicula.getNombrePelicula());
                System.out.println("Clasificacion: "+pelicula.getClasificacion());
                System.out.println("Hora de inicio: "+pelicula.getHoraEntrada()+"h\n");

            }
        }
        return cantidadPeliculas;
    }
}
