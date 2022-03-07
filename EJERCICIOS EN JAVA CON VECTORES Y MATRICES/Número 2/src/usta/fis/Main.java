package usta.fis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sumEdades=0;
        double promEdad;
        String[] nombresEstudiantes;
        int[] edadEstudiantes;

        System.out.println("Digite la cantidad total de estudiantes");
        nombresEstudiantes = new String[DigitarNúmero()];
        edadEstudiantes = new int[nombresEstudiantes.length];

        System.out.println("A continuacion digite los datos de los estudiantes");
        for (int i = 0; i < nombresEstudiantes.length; i++) {
            System.out.println("Digite el nombre del " + (i + 1) + " estudiante");
            AlmacenarNombre(nombresEstudiantes, i);
            System.out.println("Digite la edad del " + (i + 1) + " estudiante");
            AlmacenarEdad(edadEstudiantes, i);
            sumEdades+=edadEstudiantes[i];
        }
        do {
            System.out.println("Esocoja la opción que desea visualizar:");
            System.out.println("1 Ver el promedio de edad");
            System.out.println("2 Ver el estudiante de menor edad");
            System.out.println("3 Ver el estudiante de mayor edad");
            System.out.println("4 Ver la cantidad de menores de edad");
            System.out.println("5 Ver la cantidad de mayores de edad");
            System.out.println("6 Ver los nombres de los menores de edad");
            System.out.println("7 Ver los nombres de los mayores de edad");
            System.out.println("0 Para salir");

            switch (DigitarNúmero()) {
                case 1:
                    System.out.println("El promedio de edades " +
                            "es: " + PromedioEdades(sumEdades, edadEstudiantes.length));
                    break;
                case 2:
                    System.out.print("El estudiante con menor edad " +
                            "es " + nombresEstudiantes[EstudianteMenorEdad(edadEstudiantes)]);
                    System.out.println(" con una edad " +
                            "de: " + edadEstudiantes[EstudianteMenorEdad(edadEstudiantes)]);
                    break;
                case 3:
                    System.out.print("El estudiante con mayor edad " +
                            "es " + nombresEstudiantes[EstudianteMayorEdad(edadEstudiantes)]);
                    System.out.println(" con una edad " +
                            "de: " + edadEstudiantes[EstudianteMayorEdad(edadEstudiantes)]);
                    break;
                case 4:
                    System.out.println("La cantidad de menores de edad es " +
                            "de: "+CantidadMenoresEdad(nombresEstudiantes.length, edadEstudiantes));
                    break;
                case 5:
                    System.out.println("La cantidad de mayores de edad es " +
                            "de: "+CantidadMayoresEdad(nombresEstudiantes.length, edadEstudiantes));
                    break;
                case 6:
                    System.out.println("Menores");
                    MostrarMenores(nombresEstudiantes, edadEstudiantes);
                    break;
                case 7:
                    System.out.println("Mayores");
                    MostrarMayores(nombresEstudiantes, edadEstudiantes);
                    break;
            }
            System.out.println("Si desea continuar presione el número 1, si salir presione el numero 0");
        }while ( (DigitarNúmero()!=0));
        for (int i = 0; i < nombresEstudiantes.length; i++) {
            System.out.println(nombresEstudiantes[i] + ", " + edadEstudiantes[i]);
        }
    }

    public static int DigitarNúmero() {
        Scanner reader = new Scanner(System.in);
        return reader.nextInt();
    }

    public static void AlmacenarNombre(String[] nombreEstudiantes, int i) {
        Scanner reader = new Scanner(System.in);
        nombreEstudiantes[i] = reader.next();
    }

    public static void AlmacenarEdad(int[] edadEstudianes, int i) {
        Scanner reader = new Scanner(System.in);
        edadEstudianes[i] = reader.nextInt();
    }
    public static double PromedioEdades(int sumEdades, int totalEstudiantes){
        return sumEdades/totalEstudiantes;
    }
    public static int EstudianteMenorEdad(int[] edadEstudiantes){
        int menor=edadEstudiantes[0], posicion=0;
        for (int i = 1; i < edadEstudiantes.length; i++) {
            if(edadEstudiantes[i]<menor){
                menor=edadEstudiantes[i];
                posicion=i;
            }
        }return posicion;
    }
    public static int EstudianteMayorEdad(int[] edadEstudiantes){
        int mayor=edadEstudiantes[0], posicion=0;
        for (int i = 1; i < edadEstudiantes.length; i++) {
            if(edadEstudiantes[i]>mayor){
                mayor=edadEstudiantes[i];
                posicion=i;
            }
        }return posicion;
    }
    public static int CantidadMenoresEdad(int totalEstudiantes, int[] edadEstudiantes) {
        int totalMenores = 0;
        for (int i = 0; i < totalEstudiantes; i++) {
            if (edadEstudiantes[i] < 18) {
                totalMenores++;
            }
        }
        return totalMenores;
    }

    public static int CantidadMayoresEdad(int totalEstudiantes, int[] edadEstudiantes) {
        int totalMayoresEdad = 0;
        for (int i = 0; i < totalEstudiantes; i++) {
            if (edadEstudiantes[i] >= 18) {
                totalMayoresEdad++;
            }
        }
        return totalMayoresEdad;
    }

    public static void MostrarMenores(String[] nombresEstudiantes, int[] edadEstudiantes) {
        for (int i = 0; i < nombresEstudiantes.length; i++) {
            if (edadEstudiantes[i] < 18)
                System.out.println(nombresEstudiantes[i]+" con una edad de "+edadEstudiantes[i]);
        }System.out.println("No hay menores de edad");
    }

    public static void MostrarMayores(String[] nombresEstudiantes, int[] edadEstudiantes) {
        for (int i = 0; i < nombresEstudiantes.length; i++) {
            if (edadEstudiantes[i] >= 18)
                System.out.println(nombresEstudiantes[i]+" con una edad de "+edadEstudiantes[i]);
        }System.out.println("No hay mayores de edad");
    }
}
