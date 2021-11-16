package main.OOP_Madis.src.Klass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class main
{
    public static ArrayList<Klass> klassid;

    public static void main(String[] args) throws FileNotFoundException
    {
        File f = new File("OOP_Madis/src/Klass/õpilased.txt");
        Scanner s = new Scanner(f);

        klassid = new ArrayList<Klass>();

        while(s.hasNext())
        {
            String[] andmed = s.nextLine().split(" ");
            String nimi = "";
            for (int i = 0; i < andmed.length - 3; i++)
            {
                nimi += andmed[i] + " ";
            }
            nimi.strip();

            Õpilane õpilane = new Õpilane(nimi, andmed[andmed.length-2], andmed[andmed.length-1], Integer.parseInt(andmed[andmed.length-3]));

            LisaKlassi(õpilane, andmed[andmed.length - 2]);
        }

        for (Klass k: klassid)
        {
            k.klassiNimekiri();
        }
    }

    public static void LisaKlassi(Õpilane õp, String klass)
    {
        for (Klass k: klassid)
        {
            if(k.getID().equals(klass))
            {
                k.LisaÕpilane(õp);
                return;
            }

        }

        Klass klass1 = new Klass(klass);
        klass1.LisaÕpilane(õp);
        klassid.add(klass1);
    }
}
