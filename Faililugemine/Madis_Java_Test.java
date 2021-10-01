package main.Faililugemine;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Madis_Java_Test {

    //Oh jesus lord i dont like the size of this code, maybe its normal but i think its not, couldve done it more effiently defenetyl
    //Just coudlve needed more time i think.
    //Maybe im not too sure.


    public static List<String> nimed = new ArrayList<>();

    public static int[][] Alagrupi_Tulemused() throws FileNotFoundException
    {

        File fail = new File("C:\\Users\\madis.tamberg\\IdeaProjects\\Java_Schoolworks\\Faililugemine\\Alagrupp.txt");

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
        nimed = Nimed;
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

            //Eelnevalt on nimed olemas, tulemused ka, vasakpoolne ja parempoolne
            //Selle järgi vaadata kumb pool suurem on ja seejärel küsida Nimede listist.

            if(Integer.parseInt(tulemused[0]) > Integer.parseInt(tulemused[1]))
            {
                tulemus_maatrix[Nimed.indexOf(jaotatud[0])][Nimed.indexOf(jaotatud[1])] = 2;
                tulemus_maatrix[Nimed.indexOf(jaotatud[1])][Nimed.indexOf(jaotatud[0])] = 0;
            }
            else if(Integer.parseInt(tulemused[1]) > Integer.parseInt(tulemused[0]))
            {
                tulemus_maatrix[Nimed.indexOf(jaotatud[1])][Nimed.indexOf(jaotatud[0])] = 2;
                tulemus_maatrix[Nimed.indexOf(jaotatud[0])][Nimed.indexOf(jaotatud[1])] = 0;
            }
            else if(Integer.parseInt(tulemused[1]) == Integer.parseInt(tulemused[0]))
            {
                tulemus_maatrix[Nimed.indexOf(jaotatud[1])][Nimed.indexOf(jaotatud[0])] = 1;
                tulemus_maatrix[Nimed.indexOf(jaotatud[0])][Nimed.indexOf(jaotatud[1])] = 1;
            }

        }
        return tulemus_maatrix;
    }

    public static int suurima_maatrixi_index(int[][] matrix) //Pm leiab Array summa ja kui on suurem siis salvestab selle ära see järel tagastab indexi suurima array oma.
    {
        int iterator = 0;
        int suurim_summa = 0;

        for (int i = 0; i < matrix.length - 1; i++) {
            int summa = 0;
            for (int j :
                    matrix[i]) {
                summa += j;
            }
            if(summa > suurim_summa) {suurim_summa = summa; iterator = i;}
        }

        return iterator;
    }

    public static void main(String[] args) throws FileNotFoundException {

        int[][] TulemusMaatrix = Alagrupi_Tulemused();

        for (int[] maatriksi_rida: TulemusMaatrix)
        {
            for (int tulemus: maatriksi_rida)
            {
                System.out.print(tulemus + " ");
            }
            System.out.print("\n");
        }

        System.out.println("Alagrupi võitis: " + nimed.get(suurima_maatrixi_index(TulemusMaatrix)));

    }
}
