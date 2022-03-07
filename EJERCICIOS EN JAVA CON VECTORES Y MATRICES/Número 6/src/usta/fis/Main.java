package usta.fis;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner reader=new Scanner(System.in);
    public static Random rand= new Random();
    public static void main(String[] args) {
        int[][] matrizA, matrizB;
        int filas, columnas;
        System.out.println("Digite la cantidad de filas que desea generar en las dos matrices");
        filas=reader.nextInt();
        System.out.println("Digite la cantidad de columnas que desea generar en las dos matrices");
        columnas=reader.nextInt();
        matrizA=CrearMatriz(filas,columnas);
        matrizB=CrearMatriz(filas,columnas);
        LeerMatriz(matrizA);
        LeerMatriz(matrizB);
        if(CompararMatrices(matrizA,matrizB)==0)
            System.out.println("No se encontraron valores similares");
    }
    public static int[][] CrearMatriz(int filas, int columnas){
        int[][] matriz;
        matriz=new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j]=rand.nextInt(10);
            }
        }
        return matriz;
    }
    public static void LeerMatriz(int [][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("La matriz ha sido leida");
    }
    public static int CompararMatrices(int [][] matrizA, int[][] matrizB){
        int contador=0;
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                if(matrizA[i][j]==matrizB[i][j]){
                    System.out.print("El elemento " + matrizA[i][j] + " de la posicion ["+i+"]["+j+"] ");
                    System.out.println("esta presente en la matriz B ");
                    contador++;
                }
            }
        }
        return contador;
    }
}
