package usta.fis;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String nombre, discoMasVendido;
        int cantidadDiscosVendidos;
        int opcion;
        int indice;

        ListaCantantesFamosos listaCantantesFamosos = new ListaCantantesFamosos();
        listaCantantesFamosos.AgregarCantante(listaCantantesFamosos.c1);
        listaCantantesFamosos.AgregarCantante(listaCantantesFamosos.c2);

        do {
            System.out.println("Introduzca el número de la opción que desea digitar");
            System.out.println("1. Agregar cantante");
            System.out.println("2. Modificar cantante");
            System.out.println("3. Eliminar cantante");
            System.out.println("4. Salir");
            opcion = reader.nextInt();
            switch (opcion) {
                case 1:
                    listaCantantesFamosos.ListarCantantes();
                    System.out.println("Escriba el nombre del cantante");
                    nombre = reader.next();
                    System.out.println("Escriba el nombre del disco más vendido");
                    discoMasVendido = reader.next();
                    System.out.println("Escriba la cantidad de discos vendidos");
                    cantidadDiscosVendidos = reader.nextInt();
                    listaCantantesFamosos.AgregarCantante(new CantanteFamoso(nombre, discoMasVendido, cantidadDiscosVendidos));
                    listaCantantesFamosos.ListarCantantes();
                    break;
                case 2:
                    listaCantantesFamosos.ListarCantantes();
                    System.out.println("Escriba el nombre del cantante que desea modificar");
                    nombre = reader.next();
                    indice=listaCantantesFamosos.BuscarIndice(nombre);
                    if(indice!=-1){
                        System.out.println("¡Se encontró el cantante!");
                        System.out.println("Escriba el nombre del cantante");
                        nombre = reader.next();
                        System.out.println("Escriba el nombre del disco más vendido");
                        discoMasVendido = reader.next();
                        System.out.println("Escriba la cantidad de discos vendidos");
                        cantidadDiscosVendidos = reader.nextInt();
                        listaCantantesFamosos.ModificarCantante(indice, nombre, discoMasVendido, cantidadDiscosVendidos);
                        System.out.println("Cantante modificado....");
                        listaCantantesFamosos.ListarCantantes();
                    }
                    else
                        System.out.println("El cantante no existe");
                    break;
                case 3:
                    listaCantantesFamosos.ListarCantantes();
                    System.out.println("Escriba el nombre del cantante que desea eliminar");
                    nombre = reader.next();
                    indice=listaCantantesFamosos.BuscarIndice(nombre);
                    if(indice!=-1){
                        System.out.println("Eliminando cantante...");
                        listaCantantesFamosos.EliminarCantante(indice);
                        listaCantantesFamosos.ListarCantantes();
                    }
                    else
                        System.out.println("No se encontró el cantante");
                    break;
                default:
                    System.out.println("Digite un número entre 1 y 4");
            }
        } while (opcion != 4);
    }
}
