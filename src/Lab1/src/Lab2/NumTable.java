package Lab1.src.Lab2;

import java.util.Arrays;

public class NumTable {
    public static void main(String[] args) {
        for (String s : Arrays.asList(
                " Integer: " + " | " + "Min: " + Integer.MIN_VALUE + " | " + " Max:  " + Integer.MAX_VALUE + " | ",
                " Byte: " + " | " + "Min: " + Byte.MIN_VALUE + " | " + " Max:  " + Byte.MAX_VALUE + " | ",
                " Short: " + " | " + "Min: " + Short.MIN_VALUE + " | " + " Max:  " + Short.MAX_VALUE + " | ",
                " Float: " + " | " + "Min: " + Float.MIN_VALUE + " | " + " Max:  " + Float.MAX_VALUE + " | ",
                " Double: " + " | " + "Min: " + Double.MIN_VALUE + " | " + " Max:  " + Double.MAX_VALUE + " | ")) {
            System.out.println(s);
        }


    }
}
