package usta.fis;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner reader= new Scanner(System.in);
    public static Random rand= new Random();

    public static void main(String[] args) {
        int number;
        int[][] matriz1;
        do {
            System.out.println("Bienvenido al juego encuentra el número v1.0");
            matriz1 = CrearMatriz();
            System.out.println("La matriz ha sido creada exitosamente.");
            System.out.println("Digite el numero que desea buscar en la matriz");
            System.out.println(BuscarNumero(matriz1));
            LeerMatriz(matriz1);
            System.out.println("Si desea salir del juego digite el número 0, si desea continuar " +
                    "digite cualquier otro número");
            number=reader.nextInt();
        }while (number!=0);
    }
    public static int[][] CrearMatriz(){
        System.out.println("Digite la cantidad de filas que desea en la matriz");
        int filas = reader.nextInt();
        System.out.println("Digite la cantidad de columnas que desea en la matriz");
        int columnas = reader.nextInt();
        int[][] matriz= new int [filas][columnas];
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[0].length;j++){
                matriz[i][j]=rand.nextInt(50);
            }
        }
        return matriz;
    }
    public static void LeerMatriz(int[][] matriz){
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[0].length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    public static String BuscarNumero(int[][] matriz){
        int numero= reader.nextInt();
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[0].length;j++){
                if(numero==matriz[i][j])
                    return "El numero digitado se encuntra en la posicion "+"["+i+"]"+"["+j+"]";
            }
        }
        return "El número digitado no se encuentra en la matriz";
    }
}
