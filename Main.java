package main;

import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) {

        int[][] tt = maatriks(10);

        for (int i = 0; i < tt.length; i++) {
            for (int j = 0; j < tt.length; j++) {
                System.out.print(tt[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static int[][] maatriks(int n)
    {
        int[][] matrix = new int[n][n];
        boolean a = false;

        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                matrix[j][k] = (a) ? 1 : 0;
                a ^= true;
            }
            a = (n%2 == 0) && (j%2 == 0) ^ true;
        }

        return matrix;
    }
}
