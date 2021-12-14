package main.Rekursioon_Oliver;

import java.util.Arrays;

public class CommitingToMainIsForPros {

    public static void main(String[] args) {

        // numbrid esimese jaoks
        int[] numbers = {1, 2, 3, 4, 5};

        // esimese kontroll
        System.out.println(isInList(numbers, 3));
        // teise kontroll
        System.out.println(removeVowels("telefon"));
    }

    // recursive method that checks if given number is in list
    public static boolean isInList(int[] list, int number) {
        // baas
        if (list.length == 0) {
            return false;
        }
        // rekursiivne
        else if (list[0] == number) {
            return true;
        }
        else {
            return isInList(Arrays.copyOfRange(list, 1, list.length), number);
        }
    }
    //rekursiive meetod, mis eemaldab sõnast täishäälikud
    public static String removeVowels(String str) {
        // baas
        if (str.length() == 0) {
            return "";
        }
        // rekursiivne
        else if (str.charAt(0) == 'a' || str.charAt(0) == 'e' || str.charAt(0) == 'i' || str.charAt(0) == 'o' || str.charAt(0) == 'u') {
            return removeVowels(str.substring(1));
        }
        else {
            return str.charAt(0) + removeVowels(str.substring(1));
        }
    }

}
