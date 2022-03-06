package usta.fis;

import java.util.Scanner;

public class Main {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int numero;
        System.out.println("Digite el numero del cual desea conocer su factorial");
        numero = reader.nextInt();
        CalcularFactorial(numero, numero-1);
    }

    public static void CalcularFactorial(int factorial, int contador) {
        if (contador == 0)
            System.out.println("El factorial del numero ingresado es: " + factorial);
        else {
            factorial *= contador;
            CalcularFactorial(factorial, contador - 1);
        }
    }
}
