package usta.fis;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Random rand=new Random();
    public static Scanner reader= new Scanner(System.in);
    public static void main(String[] args) {
        int[] myArreglo;
        myArreglo=CrearArreglo();
        LeerArreglo(myArreglo, 0);
    }
    public static int[] CrearArreglo(){
        int columnas;
        int[] myArray;
        System.out.println("Digite el número de datos que desea tener en el arreglo");
        columnas=reader.nextInt();
        myArray=new int[columnas];
        for (int i = 0; i < columnas; i++) {
            myArray[i]=rand.nextInt(50);
        }
        return myArray;
    }
    public static void LeerArreglo(int[] myArray, int posiciones){
        if(posiciones==myArray.length)
            System.out.println("\nEl arreglo se ha leido");
        else{
            System.out.print(myArray[posiciones]+" ");
            LeerArreglo(myArray,posiciones+1);
        }
    }
}
