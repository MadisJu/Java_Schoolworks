package main.Rekursioon_Oliver;

import java.util.*;

public class occurrence {

    public static void main(String[] args) {

        LinkedList<Character> words = new LinkedList<>();
        words.add('a');
        words.add('a');
        words.add('a');

        System.out.println(recursion('a', words, 3));

    }

    //Using recursion to find the number of occurrences of a character in a arraylist
    public static boolean recursion(char letter, LinkedList<Character> words, int amount) {
        if (amount == 0 && words.isEmpty()) {
            return true;
        } else if (amount == 0) {
            return false;
        }
        if (words.size() == 0) {
            return false;
        }
        else if (words.getFirst() == letter) {
            words.remove();
            return recursion(letter, words, amount - 1);
        }
        else {
            words.remove();
            return recursion(letter, words, amount);
        }
    }
}