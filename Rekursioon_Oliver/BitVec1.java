package main.Rekursioon_Oliver;

public class BitVec1 {

    public static void BitVec(int n, String s)
    {
        if (s.length() == n)
        {
            System.out.println(s);
        }
        else
        {
            BitVec(n, s + "0");
            BitVec(n, s + "1");
        }
    }

    public static void main(String[] args) {
        BitVec(7, "");
    }

}
