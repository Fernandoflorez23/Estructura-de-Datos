package usta.fis;

import java.util.Scanner;

public class Main {
    public static Scanner reader=new Scanner(System.in);
    public static void main(String[] args) {
        int filas,columnas;
        int[] myVector;
        int[][] myMatriz;
        System.out.println("Digite el numero de filas que desea");
        filas=reader.nextInt();
        System.out.println("Digite el tamaño de la columnas que desea");
        columnas=reader.nextInt();
        myVector=CrearVector(columnas);
        myMatriz=CrearMatriz(filas,columnas);
        LeerVector(myVector,0);
        LeerMatriz(myMatriz);
        if(BuscarFila(myMatriz,myVector)==0)
            System.out.println("No se encontró el vector en la matriz");
    }
    public static int[] CrearVector(int columnas){
        int[] vector=new int[columnas];
        System.out.println("A continuacion digite los valores del arreglo");
        for (int i = 0; i < columnas; i++) {
            System.out.print("["+i+"] = ");
            vector[i]=reader.nextInt();
        }
        return vector;
    }
    public static int[][] CrearMatriz(int filas, int columnas){
        int[][] matriz=new int[filas][columnas];
        System.out.println("A continuacion digite los valores de la matriz");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("["+i+"]"+"["+j+"] = ");
                matriz[i][j]=reader.nextInt();
            }
        }
        return matriz;
    }
    public static void LeerVector(int[] vector, int contador){
        if(contador==vector.length)
            System.out.println("\nEl vector se ha leido");
        else{
            System.out.print(vector[contador]+" ");
            LeerVector(vector, contador+1);
        }
    }
    public static void LeerMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("La matriz se ha leido");
    }
    public static int BuscarFila(int[][] matriz, int[] vector){
        int contador, verificador=0;
        for (int i = 0; i < matriz.length; i++) {
            contador=0;
            for (int j = 0; j < matriz[0].length; j++) {
                if(matriz[i][j]==vector[j])
                    contador++;
                else break;
            }
            if(contador==matriz[0].length) {
                System.out.println("El vector se encuentra ubicado en la fila " + i);
                verificador++;
            }
        }
        return verificador;
    }
}
