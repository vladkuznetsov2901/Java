package Lab1.src.Lab2;

import java.util.Scanner;

public class StringCnt {
    public static void main(String[] args) {

        String str = "abcdTCDYTFHnbui7346237840239--=p[;']'[pfkpweihfoqw";

        int letter = 0, uppercaseLetter = 0, lowercase = 0, numbers = 0,
                arabicLetter = 0, englishLetter = 0, otherSymbols = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                letter += 1;
                if (Character.isUpperCase(c)) {
                    uppercaseLetter += 1;
                }
                if (Character.isLowerCase(c)) {
                    lowercase += 1;
                }
                if (c >= 0x0600 && c <= 0x06E0) {
                    arabicLetter += 1;
                } else if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                    englishLetter += 1;
                }
            } else if (Character.isDigit(c)) {
                numbers += 1;
            } else otherSymbols += 1;
        }

        System.out.println("Your string: " + str);
        System.out.println("Letters: " + letter);
        System.out.println("Uppercase Letters: " + uppercaseLetter);
        System.out.println("Lowercase Letters: " + lowercase);
        System.out.println("Numbers: " + numbers);
        System.out.println("Arabic Letters: " + arabicLetter);
        System.out.println("English Letters: " + englishLetter);
        System.out.println("Other Symbols: " + otherSymbols);
        System.out.println("All Symbols: " + str.length());


    }
}
