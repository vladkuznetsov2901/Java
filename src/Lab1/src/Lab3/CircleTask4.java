package Lab1.src.Lab3;

import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.max;
import static java.lang.Math.min;


enum Otvet {
    Match, //Совпадают
    intersectAt1Point,
    intersectAt2Point,
    OneInTwo,
    TwoInOne,
    NotCrosses
}
class Plane {
    int x;
    int y;
    int r;

    void displayInfo(){
        System.out.printf("x: %d \ty: %d\tr: %d\n", x, y, r);
    }

}

public class CircleTask4 {

    static Otvet examination(Plane plane1, Plane plane2) {
        float len = (float) pow(pow(abs(plane1.x - plane2.x), 2)+ pow(abs(plane1.y - plane2.y), 2), 0.5);
        if (plane1.x == plane2.x & plane1.y == plane2.y & plane1.r == plane2.r){
            System.out.println("Совпадают");
            return Otvet.Match;
        }
        if (len +min(plane1.r, plane2.r) < max(plane1.r, plane2.r)){
            System.out.printf("окружность c радиусом-%d вписана в окружность c и радиусом-%d", min(plane1.r, plane2.r), max(plane1.r, plane2.r) );
            return Otvet.OneInTwo;
        }

        if (len > plane1.r + plane2.r){
            System.out.println("Не пересекаются");
            return Otvet.NotCrosses;
        } else if (len == plane1.r + plane2.r) {
            System.out.println("Пересекаются в 1 точке");
            return Otvet.intersectAt1Point;
        } else {
            System.out.println("Пересекаются в 2 точках");
            return Otvet.intersectAt2Point;
        }

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Plane plane1 = new Plane();
        System.out.println("Введите x ");
        plane1.x = in.nextInt();
        System.out.println("Введите y ");
        plane1.y = in.nextInt();
        System.out.println("Введите r ");
        plane1.r = in.nextInt();

        plane1.displayInfo();

        Plane plane2 = new Plane();
        System.out.println("Введите x ");
        plane2.x = in.nextInt();
        System.out.println("Введите y ");
        plane2.y = in.nextInt();
        System.out.println("Введите r ");
        plane2.r = in.nextInt();

        plane2.displayInfo();


        examination(plane1, plane2);
    }


}