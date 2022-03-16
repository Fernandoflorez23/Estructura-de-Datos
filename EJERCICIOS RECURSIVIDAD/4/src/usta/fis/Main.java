package usta.fis;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static Scanner reader= new Scanner(System.in);
    public static void main(String[] args) {
        String palabra;
        System.out.println("Digite la palabra que desea invertir");
        palabra=reader.next();
        System.out.println(InvertirPalabra(palabra, palabra.length()-1));
    }
    public static String InvertirPalabra(String palabra, int tamañoPalabra){
        if(tamañoPalabra==0)
            return palabra.charAt(tamañoPalabra)+"";
        else{
            return palabra.charAt(tamañoPalabra) + InvertirPalabra(palabra,tamañoPalabra-1);
        }
    }
}
