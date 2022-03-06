package usta.fis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        int prom=0,result=0;
        System.out.println("Digite el numero de espacios que desea en el arreglo");
        int espacios=reader.nextInt();
        int[] array=new int[espacios];
        System.out.println("Ahora digite los valores de los diferentes espacios");
        for (int i=0;i<espacios;i++){
            array[i]=reader.nextInt();
            prom+=array[i];
        }
        result+=prom/array.length;
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        System.out.println("\nEl promedio es: "+result);
    }
}
