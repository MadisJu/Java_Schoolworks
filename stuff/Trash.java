package main.stuff;

import java.io.*;
import java.util.Locale;

public class Trash {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("stuff/fail.txt"));

        System.out.println(readAllLines(bufferedReader, "has"));
        
    }

    public static Integer readAllLines(BufferedReader reader, String needed_word) throws IOException {
        String line;
        int word_count = 0;

        while ((line = reader.readLine()) != null) {
            String[] words = line.split(" ");
            for (String word : words
                 ) {
                if (word.strip().toLowerCase(Locale.ROOT).equals(needed_word)) {
                    word_count++;
                }
            }
        }
        return word_count;
    }
}
