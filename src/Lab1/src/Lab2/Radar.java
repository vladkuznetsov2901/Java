package Lab1.src.Lab2;

import java.util.Scanner;

public class Radar {
    public static void main(String[] args) {

        double r = Double.parseDouble(args[0]);

        double R = Double.parseDouble(args[1]);


        double x = Double.parseDouble(args[2]);

        double y = Double.parseDouble(args[3]);

        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        if (distance > R){
            System.out.println("Не обнаружен");
        } else if (distance > r && distance <= R) {
            System.out.println("Обнаружен");
        } else if (distance <= r) {
            System.out.println("Тревога");
        }

    }



}
