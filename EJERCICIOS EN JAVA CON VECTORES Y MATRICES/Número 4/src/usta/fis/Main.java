package usta.fis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        int[][] matriz1;
        int[][] matriz2;
        int tamañoMatriz;

        System.out.println("Digite el tamaño de la matriz");
        tamañoMatriz=reader.nextInt();

        matriz1=new int[tamañoMatriz][tamañoMatriz];
        matriz2=new int[matriz1[0].length][matriz1.length];

        System.out.println("Digite los valores de la matriz");

        for(int i=0;i<matriz1.length;i++) {
            for (int a = 0; a < matriz1[i].length; a++) {
                matriz1[i][a]=reader.nextInt();
            }
        }

        for(int i=0;i<matriz1.length;i++){
            for(int a=0;a<matriz1[i].length;a++){
                System.out.print(matriz1[i][a]+" ");
                matriz2[a][i]=matriz1[i][a];
            }
            System.out.println("");
        }

        System.out.println("-----------");

        for(int i=0;i<matriz2.length;i++){
            for(int a=0;a<matriz2[i].length;a++){
                System.out.print(matriz2[i][a]+" ");
            }
            System.out.println("");
        }
    }
}
