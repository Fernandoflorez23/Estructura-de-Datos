package usta.fis;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Digite el limite hasta el cual quiere llegar en la serie:");
        int v_limit = keyboard.nextInt();
        int fibo_array[] = new int[100];
        System.out.println("The result is: " + serie_fibonacci(v_limit, fibo_array));
        String v_fiboprefinal = serie_fibonacci(v_limit, fibo_array);
        String[] v_fibonal = v_fiboprefinal.split(", ");
        for (String i : v_fibonal) {
            if (!i.equals("0") && !i.equals("0]"))
                System.out.print(i + ", ");
        }
        System.out.print("]");
    }

    public static String serie_fibonacci(int v_limit, int[] fibo_array) {
        fibo_array[0] = 0;
        fibo_array[1] = 1;
        for (int i = 2; fibo_array[i - 1] + fibo_array[i - 2] <= v_limit; i++) {
            fibo_array[i] = fibo_array[i - 1] + fibo_array[i - 2];
        }
        return Arrays.toString(fibo_array);
    }
}
