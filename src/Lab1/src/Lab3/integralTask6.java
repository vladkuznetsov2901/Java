package Lab1.src.Lab3;

import java.util.Scanner;

public class integralTask6 {

    public static double getIntegralValueByLeftRectangle(double funcValues[], int from, int to) {
        int intervalsCount = funcValues.length; // кол-во интервалов можно определить из кол-ва переданных значений ф-ции
        double h = getIntervalLength(from, to, intervalsCount);
        double integral = 0;
        for (int i = 0; i < intervalsCount; i++) {
            integral += h * funcValues[i];
        }
        return integral;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int from = input.nextInt(), to = input.nextInt(), intervalsCount = 101;

        double intervalLength = getIntervalLength(from, to, intervalsCount);
        double funcValues[] = new double[intervalsCount];
        String format = "|%1$-16s|%2$-16s|\n";
        System.out.format(format, "----------------", "----------------");
        System.out.format(format, "      y(x)      ", "        x       ");
        System.out.format(format, "----------------", "----------------");
        double leftX = from;
        for (int i = 0; i < intervalsCount; i++, leftX += intervalLength) {
            System.out.format("|%15.7e |%15.2f |%n", Math.pow(Math.E, leftX) - leftX * leftX * leftX, leftX); // 15d -> 15.2f
            System.out.format(format, "----------------", "----------------");
            funcValues[i] = Math.pow(Math.E, leftX) - leftX * leftX * leftX;
        }
        System.out.println(getIntegralValueByLeftRectangle(funcValues, from, to));
    }

    public static double getIntervalLength(double from, double to, int intervalsCount) {
        return (to - from) / intervalsCount;


    }
}
