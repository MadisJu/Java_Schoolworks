package main.OOP_oliver.Bush_package;

import java.util.Arrays;

public class Hedge {

    String hedge_name;
    Bush[] Bushes;

    public Hedge(String hedge_name, Bush[] Bushes) {
        this.hedge_name = hedge_name;
        this.Bushes = Bushes;
    }

    public double  highest () {

        double highest_bush = 0;

        for (int i = 0; i < Bushes.length; i++) {
            if (Bushes[i].getHeight()-highest_bush > 0) {
                highest_bush = Bushes[i].getHeight();
                }
            }
        return highest_bush;

        }
    public double total_width() {

        double total = 0;

        for (int i = 0; i < Bushes.length; i++) {
            total += Bushes[i].getWidth();
        }
        return total;

    }
    @Override
    public String toString() {
        return "hedge{" +
                "hedge_name='" + hedge_name + '\'' +
                ", bushes=" + Arrays.toString(Bushes) +
                '}';
    }
}