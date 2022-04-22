package usta.fis;

import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Main {

    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int opcion,id,edad,indice;
        String nombre,clasificacion,genero,hora;
        String horaActual=new SimpleDateFormat("HH").format(Calendar.getInstance().getTime());

        ListaPeliculas listaPeliculas=new ListaPeliculas();
        ListaPersonas listaPersonas=new ListaPersonas();
        ListaPersonasViendo listaPersonasViendo=new ListaPersonasViendo();

        Pelicula Encanto=new Pelicula(1,"Encanto","+12",true,"16");
        Pelicula SpiderMan=new Pelicula(2,"SpiderMan","+12",true,"17");
        Pelicula EndGame=new Pelicula(3,"EndGame","+15",true,"18");
        listaPeliculas.AgregarPelicula(Encanto);
        listaPeliculas.AgregarPelicula(SpiderMan);
        listaPeliculas.AgregarPelicula(EndGame);

        Persona Fernando=new Persona(1111,18,"Fernando","Masculino");
        Persona Santiago=new Persona(1112,21,"Santiago","Masculino");
        PersonaViendoPelicula Sofia=new PersonaViendoPelicula(1113,21,"Sofia","Femenino",Encanto.getNombrePelicula(), Encanto.getHoraEntrada());
        listaPersonas.AgregarPersonas(Fernando);
        listaPersonas.AgregarPersonas(Santiago);
        listaPersonasViendo.AgregarPersonaViendoPelicula(Sofia);

        do{
            System.out.println("Digite la el número de la opcion que desea ejecutar");
            System.out.println("1. Para agregar una pelicula");
            System.out.println("2. Para ingresar personas");
            System.out.println("3. Listar las personas que NO estan viendo una pelicula en este momento");
            System.out.println("4. Listar las personas que estan viendo una pelicula en este momento");
            System.out.println("5. Listar las personas que estan viendo cine en una hora especifica");
            System.out.println("6. Listar las películas se están ofreciendo (activas)");
            System.out.println("7. Listar las películas que se proyectan a una hora específica");
            System.out.println("8. Cancelar entrada de una persona");
            System.out.println("9. Listar personas que cancelaron entrada");
            System.out.println("10. Salir");
            opcion=reader.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Digite el codigo de la pelicula");
                    id = reader.nextInt();
                    System.out.println("Escriba el nombre de la pelicula");
                    nombre = reader.next();
                    System.out.println("Escriba la clasificacion de la pelicula");
                    clasificacion = reader.next();
                    System.out.println("Escriba la hora de entrada");
                    hora = reader.next();
                    listaPeliculas.AgregarPelicula(new Pelicula(id, nombre, clasificacion, true, hora));
                    System.out.println("Actualizando lista...");
                    listaPeliculas.ListarPeliculas(horaActual);
                }
                case 2 -> {
                    System.out.println("Digite el nombre de la persona");
                    nombre = reader.next();
                    System.out.println("Digite la cedula de la persona");
                    id = reader.nextInt();
                    System.out.println("Digite la edad de la persona");
                    edad = reader.nextInt();
                    System.out.println("Digite el genero de la persona");
                    genero = reader.next();
                    listaPersonas.AgregarPersonas(new Persona(id, edad, nombre, genero));
                    System.out.println("Actualizando lista...");
                    listaPersonas.ListarPersonas();
                }
                case 3 -> {
                    System.out.println("Realizando consulta...");
                    System.out.println("Las siguientes personas NO estan viendo una pelicula en este momento: ");
                    listaPersonas.ListarPersonas();
                }
                case 4 ->{
                    System.out.println("Realizando consulta...");
                    System.out.println("Las siguientes personas estan viendo una pelicula en este momento: ");
                    listaPersonasViendo.ListarPersonasViendo();
                }
                case 5 ->{
                    System.out.println("Ingrese la hora de consulta: ");
                    hora=reader.next();
                    System.out.println("Realizando consulta...");
                    System.out.println("Se encontraron "+listaPersonasViendo.ListarPersonasPorHora(hora)+" personas en la hora consultada");
                }
                case 6 ->{
                    System.out.println("Las peliculas activas en este momento son las siguientes: ");
                    listaPeliculas.ListarPeliculas(horaActual);
                }
                case 7 ->{
                    System.out.println("Digite la hora de consulta:");
                    hora=reader.next();
                    System.out.println("Realizando consulta...");
                    System.out.println("Se encontraron "+listaPeliculas.PeliculasPorHora(hora)+" perlicula(s) en la hora consultada"+"\n");
                }
                case 8 ->{
                    System.out.println("Digite el nombre de la persona que va a cancelar su entrada: ");
                    nombre=reader.next();
                    indice=listaPersonas.BuscarPersona(nombre);
                    if(indice!=-1){
                        System.out.println("Cancelando entrada...");
                        listaPersonas.PersonasQueCancelaron(listaPersonas.listaPersonas.get(indice));
                        listaPersonas.CancelarEntrada(indice);
                    }
                    else {
                        System.out.println("No se encontró ninguna entrada con el nombre consultado"+"\n");
                    }
                }
                case 9 ->{
                    System.out.println("Las siguientes personas cancelaron sus entradas: ");
                    listaPersonas.ListarPersonasCanceladas();
                }
                default -> System.out.println("Las opciones deben ser entre 1 y 10");
            }
        }while (opcion!=10);
    }
}
