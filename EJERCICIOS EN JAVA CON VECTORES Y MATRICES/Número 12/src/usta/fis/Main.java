package usta.fis;

import java.util.Scanner;

public class Main {

    public static Scanner reader=new Scanner(System.in);
    public static void main(String[] args) {
        int[] codigos;
        double[][] notasEstudiantes;
        int totalEstudiantes;
        System.out.println("Digite la cantidad de estudiantes que desea evaluar: ");
        totalEstudiantes=reader.nextInt();
        codigos=new int[totalEstudiantes];
        notasEstudiantes=new double[totalEstudiantes][3];
        notasEstudiantes=LlenarMatriz(notasEstudiantes);
        LeerArreglos(LlenarVector(codigos),notasEstudiantes);
        CalcularDefinitiva(notasEstudiantes);
    }
    public static int[] LlenarVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i]=(i+1);
        }
        return vector;
    }
    public static double[][] LlenarMatriz(double[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Digite la nota del "+(j+1)+" corte del "+(i+1)+" estudiante");
                matriz[i][j]=reader.nextDouble();
            }
        }
        return matriz;
    }
    public static void CalcularDefinitiva(double [][] matriz){
        int codigo;
        double notaPrimerCorte, notaSegundoCorte, notaTercerCorte, definitiva;
        System.out.println("Digite el codigo del estudiante que desea evaluar su definitiva");
        codigo=reader.nextInt();
        notaPrimerCorte=matriz[codigo-1][0]*0.35;
        notaSegundoCorte=matriz[codigo-1][1]*0.35;
        notaTercerCorte=matriz[codigo-1][2]*0.3;
        definitiva=notaPrimerCorte+notaSegundoCorte+notaTercerCorte;
        if(definitiva<3)
            System.out.println("El estudiante PERDIÓ la asignatura con una nota de "+definitiva);
        else
            System.out.println("El estudiante APROBÓ la asignatura con una nota de "+definitiva);
    }
    public static void LeerArreglos(int[] vector, double[][] matriz){
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]+" | ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]);
                if(j!=matriz[0].length-1)
                    System.out.print(" - ");
            }
            System.out.println();
        }
    }
}
