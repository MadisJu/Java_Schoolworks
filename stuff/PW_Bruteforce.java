package main.stuff;

public class PW_Bruteforce {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < Math.pow(10, n); i++) {

            if (i < 10) {
                String str = "0";
                str = str.repeat(n - 1);
                System.out.println(str + i);
            }
            else if (i < 100) {
                String str = "0";
                str = str.repeat(n - 2);
                System.out.println(str + i);
            }
            else if (i < 1000) {
                String str = "0";
                str = str.repeat(n - 3);
                System.out.println(str + i);
            }
            else if (i < 10000) {
                String str = "0";
                str = str.repeat(n - 4);
                System.out.println(str + i);
            }
            else {
                System.out.println(i);
            }
        }
    }
}