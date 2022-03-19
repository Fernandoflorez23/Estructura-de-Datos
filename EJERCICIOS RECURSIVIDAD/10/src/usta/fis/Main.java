package usta.fis;

import java.util.Scanner;

public class Main {
    public static Scanner reader= new Scanner(System.in);
    public static void main(String[] args) {
        String palabra;
        char letra;
        System.out.println("Digite la palabra");
        palabra=reader.next();
        System.out.println("Diigte la letra que desea contar en la palabra");
        letra= reader.next().charAt(0);
        System.out.println("La letra se ha encontrado " +BuscarLetra(palabra,letra, palabra.length()-1, 0)+ " veces");
    }
    public static int BuscarLetra(String palabra, char letra, int tamañaPalabra, int vecesEncontrada){
        if(tamañaPalabra==0)
            return vecesEncontrada;
        else if(letra==palabra.charAt(tamañaPalabra))
            vecesEncontrada++;
        return BuscarLetra(palabra,letra,tamañaPalabra-1,vecesEncontrada);
    }
}
