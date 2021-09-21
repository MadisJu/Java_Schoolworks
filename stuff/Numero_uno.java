package main.stuff;
import java.util.Random;

public class Numero_uno {
    public static void main(String[] args) {

        int n = 5;
        int[][] matirix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = new Random().nextInt(1000);
                matirix[i][j] = num;
            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matirix[i][j] + " ");
            }
            System.out.println("\n");

        }

    }
}
