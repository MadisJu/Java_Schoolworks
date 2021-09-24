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
        System.out.println(all_sum(matirix, n));

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matirix[i][j] + " ");
            }
            System.out.println("");


        }

    }

    public static int[][] corners_sum(int[][] matirix, int n){
        int corners_sum = 0;
        corners_sum += matirix[0][0];
        corners_sum += matirix[n-1][0];
        corners_sum += matirix[0][n-1];
        corners_sum += matirix[n-1][n-1];

        return matirix;
    }
    public static int[] diagonals(int[][] matirix, int n){
        int[] diag_sum = new int[(n*2)-2];
        int temp_sum = 0;
        int temp = n;
        for (int i = 0; i <= (n*2)-2; i++)
            if (i == 0) {
                diag_sum[i+1] = matirix[i][temp];
            }
            else if (i == n) {
                diag_sum[i] = matirix[i][n];
            } else {
                temp_sum += matirix[i - 1][temp - 1];
            }
            temp -= 1;
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
