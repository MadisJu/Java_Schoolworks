package main.OOP_Madis.src.Lapsehoidija;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lastehoid {

    public static void main(String[] args) throws FileNotFoundException {

        List<Lapsehoidija> hoid = new ArrayList<Lapsehoidija>();

        File f = new File("OOP_Madis/src/Lapsehoidija/andmed");
        Scanner scam = new Scanner(f);

        while(scam.hasNext())
        {
            String[] andmed = scam.nextLine().split(" ");

            Lapsehoidija P = new Lapsehoidija(Integer.parseInt(andmed[0]), andmed[1]);
            hoid.add(P);
        }

        int temp_suurus = hoid.size();
        boolean is_jana_added = false;

        for (int i = 0; i < temp_suurus; i++)
        {
            int i1 = hoid.get(i).getNum();
            int i2 = i + 1 == temp_suurus ? -1 : hoid.get(i + 1).getNum();

            if(!is_jana_added)
            {
                if(i2 == -1)
                {
                    hoid.add(i, new Lapsehoidija(36, "Jana"));
                    temp_suurus++;
                    is_jana_added = true;
                }
                else if(i1 < 35 && i2 > 35)
                {
                    hoid.add(i + 1, new Lapsehoidija(35, "Jana"));
                    temp_suurus++;
                    is_jana_added = true;
                }

            }
            if(hoid.get(i).getNum() == 46)
            {
                hoid.remove(i);
                temp_suurus--;
            }
        }

        for (Lapsehoidija l: hoid)
        {
            System.out.println(l.toString());
        }


    }
}
