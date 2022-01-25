package main.stuff;

public class Euler15 {

    public static long[] pascalTriangle(int n) {
        long[] pascal = {1};
        for (int cnt = 1; cnt <= n; cnt++) {
            long[] newPascal = new long[pascal.length + 1];
            for (int i = 0; i <= pascal.length; i++) {
                if (i == 0 || i == newPascal.length - 1) {
                    newPascal[i] = 1;
                } else {
                    newPascal[i] = pascal[i - 1] + pascal[i];
                }
            }
            pascal = newPascal;
        }

        return pascal;
    }

    public static void main(String[] args) {
        System.out.println(pascalTriangle(6)[3]);
    }
}
