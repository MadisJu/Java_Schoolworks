package main.Rekursioon_Oliver;

public class Bit_Vector {

    public static void bitVec(int n, String list)
    {
        if (list.length() <= n)
        {
            if (list.length() > 0)
            {
                System.out.println(list);
            }
            bitVec(n, list + "0");
            bitVec(n, list + "1");
        }

    }

    public static void main(String[] args)
    {

        bitVec(5, "");

    }
}