package usta.fis;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner reader=new Scanner(System.in);
    public static Random rand= new Random();
    public static void main(String[] args) {
        int[][] matriz=CrearMatriz();
        LeerMatriz(matriz);
        ModificarMatriz(matriz);
        LeerMatriz(matriz);
    }
    public static int[][] CrearMatriz(){
        int[][] matriz;
        int filas, columnas;
        System.out.println("Digite la cantidad de filas que desea generar en la matriz");
        filas=reader.nextInt();
        System.out.println("Digite la cantidad de columnas que desea generar en la matriz");
        columnas=reader.nextInt();
        matriz=new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j]=rand.nextInt(50);
            }
        }
        return matriz;
    }
    public static int[][] ModificarMatriz(int [][] matriz){
        System.out.println("La matriz ha sido modificada");
        int[] guardarNumero=new int[matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            guardarNumero[i]=matriz[i][0];
            matriz[i][0]=matriz[i][matriz[0].length-1];
            matriz[i][matriz[0].length-1]=guardarNumero[i];
        }
        return matriz;
    }
    public static void LeerMatriz(int [][] matriz){
        System.out.println("Lectura de matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
}
