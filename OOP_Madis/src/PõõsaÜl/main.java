package main.OOP_Madis.src.P��sa�l;

import java.util.Random;

public class main {

    public static void main(String[] args) {

        Random r = new Random();

        P��sas[] p = new P��sas[6];
        for (int i = 0; i < 6; i++) {
            P��sas temp = new P��sas(r.nextDouble(), r.nextDouble());
        }

        Hekk hekk = new Hekk(p, "suvakas");

        System.out.println(hekk.toString());

        for (P��sas z : hekk.getP��sad()
             ) {
            System.out.println(z.toString());
        }
    }

}
