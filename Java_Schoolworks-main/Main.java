package main;

import java.util.Random;


public class Main {

    public static Random r;

    public static void main(String[] args) {

        int[][] tt = maatriks(10);
        int[][] pp = rand_maatriks(10);

        r = new Random();

        for (int[] ints : tt) {
            for (int j = 0; j < tt.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static int[][] maatriks(int n) //Making an alternating matrix between 1/0 whatever, trying to make it with as less if's as possible
    {
        int[][] matrix = new int[n][n];
        boolean a = false;

        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                matrix[j][k] = (a) ? 1 : 0;
                a ^= true;
            }
            a = !((n % 2 == 0) && ((j - 1) % 2 == 0)); // this doesnt work yet ill fix it sometime in the future.
        }
        return matrix;
    }
    public static int[][] rand_maatriks(int n) //Making an alternating matrix between 1/0 whatever, trying to make it with as less if's as possible
    {
        int[][] matrix = new int[n][n];

        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                matrix[j][k] = r.nextInt();
            }
        }

        return matrix;
    }
    public static void matrix_diagonals(int[][] matrix)
    {
        long sum = 0;

        int x_len = matrix.length;



        for (int i = 0; i < x_len; i++) {
            for (int j = 0; j < x_len; j++) {
                if(j == 0 || j == x_len) {
                    break;
                }

            }
        }
    }
}
