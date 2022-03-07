package usta.fis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int filas, columnas, posicion=0, cantidadPrimos=0, primosFilas, primosColumnas=0;
        int[][] matriz;
        int[] primos;
        System.out.println("Digite el número de filas que desea:");
        filas=reader.nextInt();
        System.out.println("Digite las columnas que desea");
        columnas=reader.nextInt();
        matriz=new int[filas][columnas];
        primos=new int [filas*columnas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j]=reader.nextInt();
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println();
        }
        for (int i = 0; i < filas; i++) {
            primosFilas=0;
            for (int j = 0; j < columnas; j++) {
                if(!VerificarPrimo(matriz[i][j])){
                    primosFilas++;
                    AgregarPrimos(primos,posicion,matriz[i][j]);
                    posicion++;
                    cantidadPrimos++;
                }
            }
            System.out.println("Se encontraron "+primosFilas+" números primos en la fila "+i);
        }
        for (int i = 0; i < columnas; i++) {
            primosColumnas=0;
            for (int j = 0; j < filas; j++) {
                if(!VerificarPrimo(matriz[j][i])){
                    primosColumnas++;
                }
            }
            System.out.println("Se encontraron "+primosColumnas+" en la columna "+i);
        }
        for (int primo : primos) {
            System.out.print(primo + ", ");
        }
        System.out.println("\nEncontre " + cantidadPrimos + " primos en toda la matriz");
    }
    public static boolean VerificarPrimo(int number) {
        int contador = 0;
        for (int i = 1; i <= number; i++){
            if (number % i == 0)
                contador++;
        }
        return contador > 2;
    }
    public static void AgregarPrimos (int[] primos,int posicion, int numeroPrimo) {
        primos[posicion]=numeroPrimo;
    }
}
