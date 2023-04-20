package Lab1.src.Lab3;

public class MatrixTask2 {
    static int max = -9999;

    public static void main(String[] args) {
        int rows = 7, columns = 5;
        int[][] arr = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = (int) ((Math.random() * -40) + 1);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (arr[i][j] > max && arr[i][j] < 0) max = arr[i][j];
            }
        }
        System.out.println("Max: " + max);
    }
}
