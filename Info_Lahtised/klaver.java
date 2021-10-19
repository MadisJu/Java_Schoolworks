package main.Info_Lahtised;

import java.util.*;

//Madis-Julius
public class klaver {

    public static ArrayList<Short> katkised_klahvid;
    public static boolean saab_negatiivne_olla;
    public static boolean saab_positiivne_olla;
    public static short[] noodid;

    public static void main(String[] args) {

        saab_negatiivne_olla = true;
        saab_positiivne_olla = true;

        Scanner scanner = new Scanner(System.in);

        short katkiste_arv = Short.parseShort(scanner.nextLine());
        String temp_katkised_klahvid = scanner.nextLine();

        katkised_klahvid = new ArrayList<Short>();

        Scanner temp = new Scanner(temp_katkised_klahvid);

        while(temp.hasNext())
        {
            katkised_klahvid.add(temp.nextShort());
        }
        temp.close();


        int nootide_arv = Integer.parseInt(scanner.nextLine());
        String temp_noodid = scanner.nextLine();

        Scanner temp1 = new Scanner(temp_noodid);

        noodid = new short[nootide_arv];
        int len = noodid.length;
        for (int i = 0; i < len; i++) {
            noodid[i] = temp1.nextShort();
        }

        short mängimata_nootide_arv = 0;



        for (int i = 0; i < nootide_arv; i++) {
            short cur_noot = noodid[i];
            for (short klahv : katkised_klahvid) {
                if(klahv == cur_noot) mängimata_nootide_arv++;
            }

        }

        short i = 0;
        short neg_i = 0;

        pealoop:
        while (true) {

            short initial_i = i;
            short initial_neg_i = neg_i;

            for (short noot : noodid) {
                if(katkised_klahvid.contains((short) (noot + i))) i++;
                if(katkised_klahvid.contains((short) (noot + neg_i))) neg_i--;

                if(initial_i != i || initial_neg_i != neg_i) continue pealoop;

                if (!(noot + i < 1024 && saab_positiivne_olla)) saab_positiivne_olla = false;
                if (!(noot + neg_i >= 0 && saab_negatiivne_olla)) saab_negatiivne_olla = false;
            }
            break pealoop;
        }


        System.out.println(mängimata_nootide_arv);

        if (!saab_negatiivne_olla && !saab_positiivne_olla) System.out.println("X");
        else
        {

            if(Math.abs(neg_i) <= i && saab_negatiivne_olla) {
                System.out.println(neg_i);
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}
