package main.Rekursioon_Oliver;

import java.util.ArrayList;

public class occurrence {

    public static void main(String[] args) {

        ArrayList<Character> words = new ArrayList<Character>();
        words.add('a');
        words.add('b');
        words.add('a');

        System.out.println(recursion('a', words, 2));

    }
    //Using recursion to find the number of occurrences of a character in a arraylist
    public static boolean recursion(char letter, ArrayList<Character> words, int amount){
        if (amount == 0){
            return true;
        }
        if (words.get(0) == letter){
            return recursion(letter, words.subList(1, words.size()), amount - 1);
        }
        return false;

    }



}

