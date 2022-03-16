package usta.fis;

import java.util.Scanner;

public class Main {
    public static Scanner reader= new Scanner(System.in);
    public static void main(String[] args) {
        int n, nFinal=0;
        System.out.println("Digite el número hasta el que desea sumar");
        n=reader.nextInt();
        SumNumber(n,nFinal);
    }
    public static void SumNumber(int n, int nFinal){
        if(n==0)
            System.out.println("El resultado es = "+nFinal);
        else{
            nFinal+=n;
            SumNumber(n-1,nFinal);
        }
    }
}
