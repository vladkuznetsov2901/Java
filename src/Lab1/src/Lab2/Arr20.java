package Lab1.src.Lab2;

import java.util.Scanner;

public class Arr20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = 2;
        int proizv = 1;
        int cnt = 0;
        int[] array = {-3, -3};

        System.out.print("Inserted array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }

        for (int i = 0; i < size; i++) {
            if (array[i] < 0) {
                proizv *= array[i];
                cnt += 1;
            }
        }

        System.out.println("\nProizv: " + proizv + " Cnt: " + cnt);
        System.out.println("\nGeometric mean: " + Math.pow(proizv, 1.0 / cnt));
    }
}
