package main.Rekursioon_Madis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main
{
    public static List<String> taishaalikud;
    public static void main(String[] args)
    {
        taishaalikud = List.of(new String[]{"a", "e", "i", "u", "o"});

        System.out.println(isInList(new int[]{1, 2, 3, 4, 5, 6 ,7}, 5));
        System.out.println(vocallessWord("Madis", ""));

    }

    public static boolean isInList(int[] list, int value)
    {
        if(list.length == 0)
        {
            return false;
        }
        else if(list[list.length - 1] == value)
        {
            return true;
        }
        else
        {
            int[] temp = Arrays.stream(list).limit(list.length - 1).toArray();
            return isInList(temp, value);
        }
    }

    public static String vocallessWord(String input, String output)
    {
        if(input.length() == 0)
        {
            return output;
        }
        else
        {
            output += taishaalikud.contains(String.valueOf(input.charAt(0))) ? "" : input.charAt(0);
            return vocallessWord(input.substring(1, input.length()), output);
        }
    }
}
