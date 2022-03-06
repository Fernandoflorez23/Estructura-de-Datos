package usta.fis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number;

        Scanner reader = new Scanner(System.in);
        System.out.println("Digite un número");
        number=reader.nextInt();

        if(number%2==0){
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }
}
