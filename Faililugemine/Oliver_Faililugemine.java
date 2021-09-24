package main.Faililugemine;

import java.io.File;
import java.util.Scanner;

public class Oliver_Faililugemine {

    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\oliver.puusalu\\IdeaProjects\\Java_Schoolworks\\Faililugemine\\Fail.txt");

            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        }
        catch (Exception e) {
            System.out.println("Error!");
        }

    }

}
