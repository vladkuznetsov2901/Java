package Lab1.src.Lab2;

import java.util.Scanner;

public class StringIndexOf {
    public static int cntStrings(String str, String str2) {
        int ind = 0, cnt = 0;
        while (ind < str.length()) {
            ind = str.indexOf(str2, ind);
            if (ind != -1) {
                cnt += 1;
                ind += str2.length();
            } else break;
        }
        return cnt;
    }

    public static void main(String[] args) {
        String str = "aaaabbbaagg";
        String str2 = "aa";


        System.out.println("Number of occurrences: " + cntStrings(str, str2));

    }
}
