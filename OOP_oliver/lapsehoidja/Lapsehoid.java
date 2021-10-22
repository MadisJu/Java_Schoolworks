package main.OOP_oliver.lapsehoidja;

import main.OOP_oliver.lapsehoidja.Lapsehoidja;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lapsehoid {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("OOP_oliver/input");
        Scanner content = new Scanner(file);

        ArrayList<Lapsehoidja> persons = new ArrayList<>();

        int last_num = 0;
        boolean is_jana_there = false;

        while (content.hasNext()) {
            String[] content_list = content.nextLine().split(" ");

            Lapsehoidja person = new Lapsehoidja(Integer.parseInt(content_list[0]), content_list[1]);

            if (person.getCompany_num() > 35 && last_num < 35 && !is_jana_there) {

                Lapsehoidja jana = new Lapsehoidja(35, "Jana");
                persons.add(jana);
                is_jana_there = true;
            }
            else if (person.getCompany_num() == 46) {
                continue;
            }
            else {
                persons.add(person);
                last_num = person.getCompany_num();
            }
        }
        for (Lapsehoidja i : persons) {
            System.out.println(i.getCompany_num() + " " + i.getName());
        }
        content.close();
    }
}
