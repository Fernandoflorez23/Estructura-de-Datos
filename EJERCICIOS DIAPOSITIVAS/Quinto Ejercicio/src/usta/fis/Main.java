package usta.fis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Por favor digite el número que desea evaluar");
        int number = reader.nextInt(), contador = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                contador++;
            }
        }
        if(contador>2){
            System.out.println("No es primo");
        }else
            System.out.println("Es primo");
    }
}
