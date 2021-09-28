package main.Faililugemine;

import sun.awt.OSInfo;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Madis_Faililugemine {

    public static Scanner scam;

    public File GetFail()
    {
        return new File("C:\\Users\\madis.tamberg\\IdeaProjects\\Java_Schoolworks\\Faililugemine\\Fail.txt");
    }

    //Kordamine ül 1;
    public static int OtsiFailist(String failinimi, String sõna) throws FileNotFoundException {

        int i = 0;

        File fail = new File("C:\\Users\\eston\\IdeaProjects\\Java_Schoolworks\\Faililugemine\\" + failinimi);

        Scanner scam = new Scanner(fail);

        while(scam.hasNext())
        {
            String smallpp = scam.next();
            if(smallpp.contains(sõna))
            {
                i++;
            }
        }

        return i;
    }

    //Jesus christ this is a mess. ÜL2
    public static void Väljasta_noolemängu_tulemused() throws FileNotFoundException {

        File f = new File("C:\\Users\\eston\\IdeaProjects\\Java_Schoolworks\\Faililugemine\\nool.txt");

        TreeMap<Integer, String> t = new TreeMap<Integer, String>();

        Scanner scam = new Scanner(f);

        List<String> tulemused = new ArrayList<String>();

        while(scam.hasNext()) {
            String[] poolitatud = scam.nextLine().split(":");

            //ANYONE HAS ANY IDEA HOW TO DO THIS MORE EFFICIENTLY?
            poolitatud[1] = poolitatud[1].replaceAll("\t", "");
            poolitatud[1] = poolitatud[1].replaceAll("\n", "");

            Scanner buttcheeks = new Scanner(poolitatud[1]);
            int kogutulemus = 0;

            while (buttcheeks.hasNext()) {
                kogutulemus += buttcheeks.nextInt();
            }

            t.put(kogutulemus, poolitatud[0]);

        }

        Set treemapset = t.entrySet();
        Iterator i = treemapset.iterator();

        while(i.hasNext())
        {
            Map.Entry m = (Map.Entry) i.next();
            System.out.println(m.getValue() + ": " + m.getKey());
        }
    }

    public static void Nimed() throws FileNotFoundException
    {
        File f = new File("C:\\Users\\eston\\IdeaProjects\\Java_Schoolworks\\Faililugemine\\nimed.txt");

        Scanner scam = new Scanner(f);
        while(scam.hasNext())
        {
            scam.nextLine();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {

        /*
        Scanner temp = new Scanner(System.in);
        System.out.println("Sisestage sõna mida proovite leida");
        System.out.println(OtsiFailist("OtsiFailist.txt", temp.nextLine()));
        */

        //Väljasta_noolemängu_tulemused();

        Nimed();
    }

}
