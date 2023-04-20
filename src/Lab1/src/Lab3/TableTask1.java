package Lab1.src.Lab3;

import java.text.DecimalFormat;

public class TableTask1 {
    public static void main(String[] args){
        for (double i = (3.14/15); i < 3.14; i += 3.14/15){
            DecimalFormat decimalFormat = new DecimalFormat( "#.#####" );
            DecimalFormat decimalFormat2 = new DecimalFormat( "#.#######" );
            double a = Math.exp(i)/(i * Math.log(i));
            System.out.println("----------------------------------------");
            System.out.format("%10s%8s", "sin(" + decimalFormat.format(i) + ") = ", decimalFormat.format(Math.sin(i)) + "\n");
            System.out.println("----------------------------------------");
            System.out.format("%10s%10s", "e^x / (x * lg(" + decimalFormat2.format(i) + ")) = ", decimalFormat2.format(a) + "\n");

        }
    }
}
