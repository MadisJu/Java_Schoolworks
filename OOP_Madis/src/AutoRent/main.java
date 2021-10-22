package main.OOP_Madis.src.AutoRent;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
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
            rentni.add(new Rentnik(scam2.next(), scam2.nextInt(), scam2.nextInt()));
        }
    }
}
