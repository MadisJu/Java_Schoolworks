package main.Faililugemine;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class Oliver_Faililugemine {

    public static void main(String[] args) {
        
        int t2hed = 0;
        char let = 'a';
        
        try {
            File file = new File("C:\\Users\\oliver.puusalu\\IdeaProjects\\Java_Schoolworks\\Faililugemine\\Fail.txt");

            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    if (line.toLowerCase(Locale.ROOT).charAt(i) == let) {
                    t2hed += 1;
                    }
                }
                }
        }
        catch (Exception e) {
            System.out.println("Error!");
        }
        String out = String.format("Failis on %s korda %s tähte.", t2hed, let);
        System.out.println(out);

    }

}
