package main.OOP_Madis.src.PõõsaÜl;

import java.util.Random;

public class main {

    public static void main(String[] args) {

        Random r = new Random();

        Põõsas[] p = new Põõsas[6];
        for (int i = 0; i < 6; i++) {
            Põõsas temp = new Põõsas(r.nextDouble(), r.nextDouble());
        }

        Hekk hekk = new Hekk(p, "suvakas");

        System.out.println(hekk.toString());

        for (Põõsas z : hekk.getPõõsad()
             ) {
            System.out.println(z.toString());
        }
    }

}
