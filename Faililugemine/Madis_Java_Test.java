package main.Faililugemine;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Madis_Java_Test {

    public static int[][] Alagrupi_Tulemused() throws FileNotFoundException
    {

        File fail = new File("C:\\Users\\madis.tamberg\\IdeaProjects\\Java_Schoolworks\\Faililugemine\\Fail.txt");

        Scanner lugeja = new Scanner(fail);


        //Nimed
        List<String> Nimed = new ArrayList<String>(); //Basically plaan on nii et, nimed hoida arraylistis.
        //Kuna Arraylistist saab nimede indexi küsida, saame selle int[][] mõlema indexid Nimed.indexOf()-ga

        while(lugeja.hasNext())
        {
            String praegune_rida = lugeja.nextLine();
            String[] jaotatud = praegune_rida.split(" vs "); // nimi 1, nimi 2 tulemused
            String[] temp = jaotatud[1].split(" "); // nimi 2, tulemused
            jaotatud[1] = temp[0]; //nimi2 tulemused asemele tuleb ainult nimi2.

            if(!Nimed.contains(jaotatud[0]))
            {
                Nimed.add(jaotatud[0]);
            }
            else if(!Nimed.contains(jaotatud[1]))
            {
                Nimed.add(jaotatud[1]);
            }
        }

        lugeja.close();
        //Nimed lõpp

        int[][] tulemus_maatrix = new int[Nimed.size()][Nimed.size()];

        lugeja = new Scanner(fail);

        while(lugeja.hasNext())
        {
            String praegune_rida = lugeja.nextLine();
            String[] jaotatud = praegune_rida.split(" vs "); // nimi 1, nimi 2 tulemused
            String[] tulemused = jaotatud[1].split(" "); // nimi 2, tulemused
            jaotatud[1] = tulemused[0];
            tulemused = tulemused[1].split(":");

            if(tulemused[0] > tulemused[1])
            {
                tulemus_maatrix[][] =
            }




        }
        return;
    }

    public static void main(String[] args) {

    }
}
