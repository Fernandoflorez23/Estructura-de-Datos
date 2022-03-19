package usta.fis;

import java.util.Scanner;

public class Main {
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int n1, n2, mcd;
        System.out.println("Bienvenido al programa que calcula el máximo común divisor");
        System.out.println("Digite el primer número de la pareja");
        n1 = reader.nextInt();
        System.out.println("Digite el segundo número de la pareja");
        n2 = reader.nextInt();
        System.out.println("El máximo común divisor de los valores ingresados es: "+CalcularMCD(n1,n2));
    }
    public static int CalcularMCD(int n1, int n2) {
        if (n2==0)
            return n1;
        else{
            return CalcularMCD(n2,n1%n2);
        }
    }
}
