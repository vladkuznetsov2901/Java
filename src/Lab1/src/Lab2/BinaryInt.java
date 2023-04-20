package Lab1.src.Lab2;

import java.util.Scanner;

public class BinaryInt {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println("Decimal: " + n);
        System.out.println("Binary: " + Integer.toString(n, 2));
        System.out.println("Octal: " + Integer.toString(n, 8));
        System.out.println("Hex: " + Integer.toString(n, 16));
    }
}
