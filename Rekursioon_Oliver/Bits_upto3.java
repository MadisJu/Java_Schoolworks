package main.Rekursioon_Oliver;

import java.util.ArrayList;

public class Bits_upto3 {

    public static void main(String[] args) {

        recursion(5, 10, "");
    }

    public static void recursion(int n, int k, String bits) {

        if (n == 0 && bits.length() == k)
        {
            System.out.println(bits);
        }
        else if (bits.length() < k)
        {
            if (n != 0){
                recursion(n - 1, k, bits + "1");
            }
            recursion(n, k, bits + "0");
        }
    }

}