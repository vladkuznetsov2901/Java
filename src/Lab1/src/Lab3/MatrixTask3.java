package Lab1.src.Lab3;

import java.util.Arrays;

public class MatrixTask3 {


    public static void main(String[] args){
        int rows = 3, columns = 3;
        int[][] arr = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = (int) ((Math.random() * 40) + 1);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < rows; i++) {

                Arrays.sort(arr[i]);

        }


        System.out.println("---------------------------------");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}

