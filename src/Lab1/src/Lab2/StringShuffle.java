package Lab1.src.Lab2;

import java.util.Scanner;

public class StringShuffle {
    public static void main(String[] args) {
        String str = "123";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.substring(i) + str.substring(0, i));
        }
    }
}
