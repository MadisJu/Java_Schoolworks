package main.Faililugemine;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class Oliver_kordamine_1 {

    public static void main(String[] args) {

        String word = "et";
        int word_count = 0;

        try {
            File file = new File("C:\\Users\\oliver.puusalu\\IdeaProjects\\Java_Schoolworks\\Faililugemine\\OtsiFailist.txt");

            Scanner content = new Scanner(file);
            while (content.hasNext()) {
                String line = content.nextLine();
                String[] words = line.toLowerCase().split(" ");
                for (int i = 0; i < words.length; i++) {
                    if (words[i].matches(word)) {
                        ++word_count;
                    }
                }

            }

    }
        catch (Exception e) {
            System.out.println("Error!");
        }
        System.out.println(word_count);
    }

}
