package main.Rekursioon_Oliver;

import java.util.ArrayList;

public class Bits_upto3 {

    public static void main(String[] args) {

        recursion(3, "");
    }

    public static void recursion(int n, String bits) {

        if (n == 0 && bits.length() == 10)
        {
            System.out.println(bits);
        }
        else if (bits.length() < 10)
        {
            if (n != 0){
                recursion(n - 1, bits + "1");
            }
            recursion(n, bits + "0");
        }
    }

}
