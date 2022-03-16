package usta.fis;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner reader= new Scanner(System.in);
    public static Random rand= new Random();
    public static void main(String[] args) {
        int numero;
        int [] myArray;
        myArray=CrearArray();
        LeerArreglo(myArray, 0);
        System.out.println("Digite el numero que desea buscar en el arreglo");
        numero=reader.nextInt();
        BuscarNumero(myArray,numero,0);
    }
    public static int[] CrearArray(){
        System.out.println("Digite la cantidad de columnas que desea en la matriz");
        int columnas = reader.nextInt();
        int[] array= new int [columnas];
        for (int i=0;i<array.length;i++){
            array[i]=rand.nextInt(10);
        }
        return array;
    }
    public static void LeerArreglo(int[] array, int numPosiciones){
        if(numPosiciones==array.length)
            System.out.println("\nEl arreglo se ha leido");
        else{
            System.out.print(array[numPosiciones]+" ");
            LeerArreglo(array,numPosiciones+1);
        }
    }
    public static void BuscarNumero(int[] array, int numero, int numeroPosiciones){
        if(numeroPosiciones== array.length){
            System.out.println("\nSe ha terminado el proceso");
        }
        else{
            if(array[numeroPosiciones]==numero){
                System.out.println("El numero solicitado se encuentra en la posicion: "+numeroPosiciones);
            }
            BuscarNumero(array,numero,numeroPosiciones+1);
        }
    }
}
