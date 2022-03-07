package usta.fis;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner reader = new Scanner(System.in);
    public static Random rand = new Random();
    public static void main(String[] args) {
        int[][] numeros=CrearMatriz();
        SumarValores(numeros);
        LeerMatriz(numeros);
    }
    public static int[][] CrearMatriz(){
        int filas,columnas;
        int [][] numeros;
        System.out.println("Digite el número de filas");
        filas=reader.nextInt();
        System.out.println("Digite el número de columnas");
        columnas=reader.nextInt();
        numeros=new int[filas+1][columnas+1];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                numeros[i][j]=rand.nextInt(50+10)+10;
            }
        }
        return numeros;
    }
    public static void LeerMatriz(int [][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            if(i==matriz.length-1)
                System.out.println("--");
            for (int j = 0; j < matriz[0].length; j++) {
                if(j==matriz[0].length-1)
                    System.out.print("|");
                System.out.print(matriz[i][j]+"   ");
            }
            System.out.println();
        }
    }
    public static int[][] SumarValores(int[][] matriz){
        for (int i = 0; i < matriz.length-1; i++) {
            int sumFilas=0,sumColumnas=0;
            for (int j = 0; j < matriz[0].length-1; j++) {
                sumFilas+=matriz[i][j];
                sumColumnas+=matriz[j][i];
            }
            matriz[i][matriz[0].length-1]=sumFilas;
            matriz[matriz.length-1][i]=sumColumnas;
        }
        return matriz;
    }
}
