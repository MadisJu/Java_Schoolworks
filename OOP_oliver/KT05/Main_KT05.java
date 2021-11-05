package main.OOP_oliver.KT05;

//12. a programmeerimine
//Nimi : Oliver Puusalu
//Kuup?ev : 05/11/2021

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main_KT05 {

    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Ostukaru> ostukorvid = new ArrayList<>();
        ArrayList<Integer> olemasolevad_ID = new ArrayList<>();

        File fail = new File("C:\\Users\\oliver.puusalu\\IdeaProjects\\Java_Schoolworks\\OOP_oliver\\KT05\\e2_new.txt");
        Scanner sisu = new Scanner(fail);

        while (sisu.hasNext()) {

            String rida = sisu.nextLine();
            String[] rida_poolitatud = rida.split(" ");


            Toode toode = toote_tagastamine(rida_poolitatud);


            if (olemasolevad_ID.contains(toode.ID)) {
                Ostukaru ostukaru = ostukorvid.get(olemasolevad_ID.indexOf(toode.ID));
                ostukaru.lisakorvi(toode);
            } else {
                olemasolevad_ID.add(toode.ID);
                ArrayList<Toode> tooted = new ArrayList<>();
                tooted.add(toode);
                Ostukaru ostukaru = new Ostukaru(toode.ID, tooted);
                ostukorvid.add(ostukaru);
            }
        }

        for (Ostukaru ostukaru : ostukorvid) {
            System.out.println("Tooted: ");
            ostukaru.ostukorviSisu();
            System.out.println("Ostukorvi kogusumma: " + ostukaru.korviKoguSumma());
            System.out.println(" ");
        }
    }


    public static Toode toote_tagastamine(String[] rida_poolitatud) {

        if (rida_poolitatud.length == 4) {
            String nimi = rida_poolitatud[0] + " " + rida_poolitatud[1];
            double hind = Double.parseDouble(rida_poolitatud[2]);
            int temp_ID = Integer.parseInt(rida_poolitatud[3]);
            Toode toode = new Toode(nimi, hind, temp_ID);
            return toode;
        }

        else if (rida_poolitatud.length == 3) {
            String nimi = rida_poolitatud[0];
            double hind = Double.parseDouble(rida_poolitatud[1]);
            int temp_ID = Integer.parseInt(rida_poolitatud[2]);
            Toode toode = new Toode(nimi, hind, temp_ID);
            return toode;
        }

        else {
            String nimi = rida_poolitatud[0] + " " + rida_poolitatud[1] + " " + rida_poolitatud[2];
            double hind = Double.parseDouble(rida_poolitatud[3]);
            int temp_ID = Integer.parseInt(rida_poolitatud[4]);
            Toode toode = new Toode(nimi, hind, temp_ID);
            return toode;
        }
    }
}
