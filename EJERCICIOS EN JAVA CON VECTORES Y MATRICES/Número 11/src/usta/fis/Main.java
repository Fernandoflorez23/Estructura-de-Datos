package usta.fis;

import java.util.Scanner;

public class Main {
    public static Scanner reader= new Scanner(System.in);

    public static void main(String[] args) {
        String[][] matrizFinal;
        matrizFinal=CrearMatriz();
        LeerMatriz(matrizFinal);
        double promedio=CalcularPromedio(matrizFinal);
        System.out.print("Su promedio de notas es "+promedio);
        if(promedio>3.3)
            System.out.print(" por lo tanto usted sigue ACTIVO con la institución");
        else
            System.out.print(" por lo tanto usted se encuentra INACTIVO con la institución");
    }
    public static String[][] CrearMatriz(){
        String[][] subjects;
        System.out.println("Digite el numero de materias que desea evaluar");
        int numSubjects=reader.nextInt();
        subjects=new String[3][numSubjects+1];
        subjects[0][0]="Asignatura";
        subjects[1][0]="Creditos  ";
        subjects[2][0]="Definitiva";
        for (int i=1;i<subjects[0].length;i++){
            System.out.println("Digite el nombre de la "+(i)+" asignatura");
            subjects[0][i]=reader.next();
            System.out.println("Digite los creditos de "+subjects[0][i]);
            subjects[1][i]=reader.next();
            System.out.println("Digite la definitiva de "+subjects[0][i]);
            subjects[2][i]=reader.next();
        }
        return subjects;
    }
    public static void LeerMatriz(String [][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+"   ");
            }
            System.out.println();
        }
    }
    public static double CalcularPromedio(String [][] matriz){
        int sumCredits=0;
        double sumMulti=0;
        for (int i = 1; i < matriz.length; i++) {
            sumCredits+=Integer.parseInt(matriz[1][i]);
            sumMulti+=(Integer.parseInt(matriz[1][i])*Double.parseDouble(matriz[2][i]));
        }
        return sumMulti/sumCredits;
    }
}
