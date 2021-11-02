package main.OOP_Madis.src.AutoRent;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws FileNotFoundException {
        List<Auto> a = new ArrayList<Auto>();
        List<Rentnik> rentni = new ArrayList<Rentnik>();

        File auto_fail = new File("OOP_Madis/src/AutoRent/autod.txt");
        File rentnik = new File("OOP_Madis/src/AutoRent/rentnik.txt");

        Scanner scam = new Scanner(auto_fail);
        Scanner scam2 = new Scanner(rentnik);

        while (scam.hasNext())
        {
            a.add(new Auto(scam.next(),  scam.next(), scam.next(), scam.next()));
        }
        while (scam2.hasNext())
        {
            Random r = new Random();
            int i = r.nextInt(a.size());

            ArrayList<Auto> p = new ArrayList<Auto>();

            for (int j = 0; j < i; j++)
            {
                int temp = r.nextInt(a.size());
                p.add(a.get(temp));
                a.remove(temp);
                // Todo this shit later thank you.
                // Done!

            }

            rentni.add(new Rentnik(scam2.next(), p, (double) (scam2.nextInt()), (double) (scam2.nextInt())));
        }

        Scanner s = new Scanner(System.in);

        /*

                    THIS NEXT PART IS SERIOUSLY SCUFFED, I JUST CBA TO DO THIS NORMALLY THE
                    TÖÖKÄSUD ON NII CONFUSING LIHTSALT.

         */
        mainloop : while(true)
        {
            System.out.println("Millise rentniku poole soovite pöörduda?");
            String input = s.nextLine();

            for (Rentnik r: rentni)
            {
                if(r.getFirma().equals(input))
                {
                    System.out.println("Eripakkumised: ");

                    for (Auto x : r.getAutod())
                    {
                        LocalDate suv_kuupäev = x.suvalinekuupäev();
                        System.out.println("kas soovite " + x.toString() + " autot " + suv_kuupäev.toString() + "kuupäevani hinnaga " + r.Hind(x, suv_kuupäev));

                    }

                    System.out.println("Kas soovite eripakkumisi või kindlat autot kindlale kuupäevale? (E/K)");
                    input = s.nextLine();

                    if(input.equalsIgnoreCase("e"))
                    {
                        System.out.println("Võtsite ühe eripakkumise, minge kassa poole et täpsustada millist, kena päeva!");
                        break mainloop;
                    }
                    else
                    {
                        System.out.println("Valige auto (Numbrimargi järgi): ");
                        input = s.nextLine();
                        for (Auto y : r.getAutod())
                        {
                            if(y.getRegistrinumber().equalsIgnoreCase(input))
                            {
                                System.out.println("Valige kuupäev eraldi ridadele(aasta, kuu, päev) ");
                                LocalDate antudkuupäev = LocalDate.of(s.nextInt(), s.nextInt(), s.nextInt());
                                System.out.println("Antud auto hinnaks on : " + r.Hind(y, antudkuupäev));
                                break mainloop;
                            }
                        }
                    }
                }
            }

        }
    }
}
