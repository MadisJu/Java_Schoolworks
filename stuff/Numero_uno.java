package main.stuff;
import java.util.Arrays;
import java.util.Random;

public class Numero_uno {
    public static void main(String[] args) {

        int n = 5;
        int[][] matirix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = new Random().nextInt(100);
                if (num<10) {
                    num = new Random().nextInt(100);
                }
                matirix[i][j] = num;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matirix[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println(diagonals(matirix, n));
    }

    public static int[][] corners_sum(int[][] matirix, int n){
        int corners_sum = 0;
        corners_sum += matirix[0][0];
        corners_sum += matirix[n-1][0];
        corners_sum += matirix[0][n-1];
        corners_sum += matirix[n-1][n-1];

        return matirix;
    }
    public static int diagonals(int[][] matirix, int n){
        int diag_sum = 0;
        int temp = n-1;

        for (int i = 0; i < n; i++) {
            if (i == temp) {
                temp -= 1;
            }
            else {
                diag_sum += matirix[i][i];
                diag_sum += matirix[i][temp];
                temp -= 1;
            }
        }

        return diag_sum;
        }
    public static int all_sum(int[][] matirix, int n) {
        int all_sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                all_sum += matirix[i][j];
            }
        }
        return all_sum;
    }
}
