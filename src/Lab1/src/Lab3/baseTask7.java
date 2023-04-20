package Lab1.src.Lab3;

public class baseTask7 {

    private static int reverseNumber(int num) {
        int reverse = 0;
        while (num != 0) {
            reverse = reverse * 10;
            reverse = reverse + num % 10;
            num = num / 10;
        }
        return reverse;
    }

    public static int numbToBase(int number, int base) {
        StringBuilder rez = new StringBuilder();
        while (number >= base) {
            rez.append(number % base);
            number /= base;
        }
        rez.append(number % base);
        return reverseNumber(Integer.parseInt(rez.toString()));
    }

    public static void main(String[] args) {
        int number = 121;
        for (int i = 2; i <= 8; i++) {
            System.out.println("10 to " + i + " = " + numbToBase(number, i));
        }
    }
}
