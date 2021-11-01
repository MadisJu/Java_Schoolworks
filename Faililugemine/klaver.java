package main.Faililugemine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Madis-Julius
public class klaver {

    public static short[] katkised_klahvid;
    public static boolean saab_negatiivne_olla;
    public static boolean saab_positiivne_olla;

    public static int return_smallest()
    {
        short initial = 1;
        short i = 1;
        short neg_i = -1;

        if(!saab_negatiivne_olla && !saab_positiivne_olla) return 0;

        while(true)
        {
            for (short klahv: katkised_klahvid)
            {
                if(klahv + i < 1024 && saab_positiivne_olla)
                {
                    for(short temp_klahv: katkised_klahvid)
                    {
                        if(klahv + i == temp_klahv) i++;
                    }
                }
                else saab_positiivne_olla = false;
                if(klahv + neg_i < 1024 && saab_negatiivne_olla)
                {
                    for(short temp_klahv: katkised_klahvid)
                    {
                        if(klahv + neg_i == temp_klahv) neg_i--;
                    }
                }
                else saab_negatiivne_olla = false;
            }
            if(initial == i || initial == Math.abs(neg_i)) break;
        }
        if(Math.abs(neg_i) < i)
        {
            return neg_i;
        }
        else
        {
            return i;
        }
    }

    public static void main(String[] args)
    {
        saab_negatiivne_olla = true;
        saab_positiivne_olla = true;

        List<Integer> transponeeritavad_toonid = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);

        short katkiste_arv = Short.parseShort(scanner.nextLine());
        String[] temp_katkised_klahvid = scanner.nextLine().split(" ");

        katkised_klahvid = new short[katkiste_arv];

        for (int i = 0; i < katkised_klahvid.length; i++) {
            katkised_klahvid[i] = Short.parseShort(temp_katkised_klahvid[i]);
        }

        int nootide_arv = Integer.parseInt(scanner.nextLine());
        String[] temp_noodid = scanner.nextLine().split(" ");

        short[] noodid = new short[nootide_arv];

        for (int i = 0; i < noodid.length; i++) {
            noodid[i] = Short.parseShort(temp_noodid[i]);
        }


        short mängimata_nootide_arv = 0;

        for (int i = 0; i < nootide_arv; i++)
        {
            short cur_noot = noodid[i];
            for (short klahv: katkised_klahvid)
            {
                mängimata_nootide_arv += (klahv == cur_noot) ? 1 : 0;
            }

        }

        System.out.println(mängimata_nootide_arv);
        System.out.println(return_smallest());
    }
}
