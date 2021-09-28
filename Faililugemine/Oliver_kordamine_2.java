package main.Faililugemine;

import java.io.File;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class Oliver_kordamine_2 {

    public static void main(String[] args) {

        Dictionary<String, Integer> dic = new Hashtable<String, Integer>();

        try {
            File file = new File("C:\\Users\\oliver.puusalu\\IdeaProjects\\Java_Schoolworks\\Faililugemine\\noolemangu_tulemused.txt");
            Scanner content = new Scanner(file);

            while (content.hasNext()) {
                int sum = 0;
                String line = content.nextLine();
                String name = line.split(":")[0];
                String numbrid = line.split(":")[1];
                numbrid = numbrid.trim();
                String[] tulemused = numbrid.split(" ");

                for (int i = 0; i < tulemused.length; i++) {
                    int num = Integer.parseInt(tulemused[i]);
                    sum += num;

                }
                dic.put(name, sum);
                //System.out.println(dic[0]);
            }
        }
        catch (Exception e) {
            System.out.println("Error!");
        }
    }
}
