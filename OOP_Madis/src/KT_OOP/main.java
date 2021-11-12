package main.OOP_Madis.src.KT_OOP;
// 12.A Programeerimine
// Nimi: Madis-Julius Tamberg
// Kuupäev: 05.11.2021

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class main
{
    public static ArrayList<Ostukäru> ostukärud;

    public static void main(String[] args) throws FileNotFoundException
    {
        ostukärud = new ArrayList<Ostukäru>();

        File fail = new File("OOP_Madis/src/KT_OOP/e2.txt");
        Scanner lugeja = new Scanner(fail);

        while(lugeja.hasNext())
        {
            String[] data = lugeja.nextLine().split(" ");
            int datalen = data.length;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < datalen - 2; i++)
            {
                sb.append(data[i] + " ");
            }
            double hind = Double.parseDouble(data[datalen - 2]);
            int ID = Integer.parseInt(data[datalen - 1]);

            Toode tempToode = new Toode(sb.toString(), hind, ID);

            LisaToodeÕigesseOstukärru(tempToode, ID);
        }

        for (Ostukäru ok: ostukärud)
        {
            System.out.println("Ostukorv ID-ga " + ok.getID() + ": toodete kogusumma on " + ok.KorviKoguSumma() + " eurot.");
            ok.OstukorviSisu();
            System.out.println("\n\n");
        }
    }

    public static void LisaToodeÕigesseOstukärru(Toode toode, int ID)
    {
        for (Ostukäru ok: ostukärud)
        {
            if(ok.getID() == ID)
            {
                ok.LisaKorvi(toode);
                return;
            }
        }

        Ostukäru UusOk = new Ostukäru(ID);
        UusOk.LisaKorvi(toode);
        ostukärud.add(UusOk);
        return;

    }
}
