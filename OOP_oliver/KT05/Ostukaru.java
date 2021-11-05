package main.OOP_oliver.KT05;

import java.math.RoundingMode;
import java.util.ArrayList;

//12. a programmeerimine
//Nimi : Oliver Puusalu
//Kuupäev : 05/11/2021

public class Ostukaru {

    int ID;
    ArrayList<Toode> tooted;

    public Ostukaru(int ID, ArrayList<Toode> tooted) {
        this.ID = ID;
        this.tooted = tooted;
    }

    public void lisakorvi(Toode toode) {

        tooted.add(toode);

    }

    public double korviKoguSumma() {

        double temporary_summa = 0;

        for (Toode toode : tooted
             ) {
            temporary_summa += toode.hind;
        }
        return temporary_summa;

    }

    public void ostukorviSisu() {

        for (Toode toode : tooted
             ) {
            System.out.println(toode.info());
        }

    }

}
