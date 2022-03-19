package usta.fis;

import java.util.Scanner;

public class Main {

    public static Scanner reader= new Scanner(System.in);
    public static void main(String[] args) {
        int numero,potencia;
        System.out.println("Digite el número que desea buscar su potencia");
        numero=reader.nextInt();
        System.out.println("Digite la potencia hasta la que desea llegar");
        potencia=reader.nextInt();
        System.out.println("La potencia del numero digitado es: "+CalcularPotencia(numero,potencia));
    }
    public static double CalcularPotencia(int numero, int coeficiente){
        if(coeficiente==1)
            return numero;
        else{
            return numero*CalcularPotencia(numero,coeficiente-1);
        }
    }
}
