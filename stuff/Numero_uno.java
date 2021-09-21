package main.stuff;
import java.util.Random;

public class Numero_uno {
    public static void main(String[] args) {

        int n = 5;
        int[][] matirix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = new Random().nextInt(100);
                matirix[i][j] = num;
            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matirix[i][j] + " ");
            }
            System.out.println("");

        }
        int numm2 = 0;
        for (int i = 0; i < 6; i++) {
            matirix[i + 1][numm2] = matirix[numm2][i + 1];
            numm2 += 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matirix[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
