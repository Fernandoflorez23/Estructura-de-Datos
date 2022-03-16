package usta.fis;

import java.util.Scanner;

public class Main {
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        int tablaM = 0;
        int numero = 0;

        System.out.println("Digite la tabla de multiplicar");
        tablaM = keyboard.nextInt();
        System.out.println("Digite el número máximo al que quiere llegar");
        numero = keyboard.nextInt();

        multiplicar(tablaM, numero);

    }
    public static void multiplicar(int tablaM, int numero){

        if(numero>= 1){
            int multi=0;
            multi = tablaM*numero;
            multiplicar(tablaM, numero-1);
            System.out.println(tablaM+  " x "  +numero+  " = "  +multi);
        }

    }
}
