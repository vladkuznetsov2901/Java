package Lab1.src.Lab3;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int n = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите cтепень полинома");
        if(scan.hasNextInt()) n = scan.nextInt();
        double [] koaf = new double[n + 1];
        System.out.println("Введите значения коэффициентов");
        for (int i = 0; i < n + 1; i++){
            System.out.print("k[" + i + "]= ");
            if(scan.hasNextDouble()) koaf[i] = scan.nextDouble();
        }
        double x = 1, P = koaf[koaf.length - 1] * x + koaf[koaf.length - 2];
        for(int i = koaf.length - 3; i >= 0; i--){
            P = P * x + koaf[i];
        }
        System.out.println(P);
    }
}