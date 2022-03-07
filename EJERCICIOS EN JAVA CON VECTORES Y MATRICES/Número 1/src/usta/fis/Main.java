package usta.fis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String[] subjects;
        int[] credits;
        double[] grades;
        int sumCredits=0;
        double sumMulti=0;
        double division=0;
        System.out.println("Digite el numero de materias que desea evaluar");
        int numSubjects=reader.nextInt();
        subjects=new String[numSubjects];
        credits=new int[numSubjects];
        grades=new double[numSubjects];
        for (int i=0;i<subjects.length;i++){
            System.out.println("Digite el nombre de la "+(i+1)+" asignatura");
            subjects[i]=reader.next();
            System.out.println("Digite los creditos de la "+(i+1)+" asignatura");
            credits[i]=reader.nextInt();
            System.out.println("Digite la definitiva de la "+(i+1)+" asignatura");
            grades[i]=reader.nextDouble();
            sumCredits+=credits[i];//sumCredits=sumCredits+credits[i]
            sumMulti+=credits[i]*grades[i];
            division=sumMulti/sumCredits;
        }
        System.out.println(sumCredits+", "+sumMulti+", "+division);
        if(division>3.3){
            System.out.println("Activo");
        }else {
            System.out.println("Inactivo");
        }
    }
}
