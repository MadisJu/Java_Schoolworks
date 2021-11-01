package main.OOP_Madis.src.P��sa�l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hekk {
    private P��sas[] p��sad;
    private String nimi;

    public Hekk(P��sas[] p��sad, String nimi) {
        this.p��sad = p��sad;
        this.nimi = nimi;
    }

    public double K�rgeim()
    {
        double  max_k�rgus = 0.0;

        for (P��sas p: p��sad
             ) {
            if(p.getK�rgus() > max_k�rgus)
            {
                max_k�rgus = p.getK�rgus();
            }
        }

        return max_k�rgus;
    }

    public double Laius()
    {
        double t = 0;

        for (P��sas p: p��sad
             ) {
            t += p.getLaius();
        }

        return t;
    }

    public P��sas[] getP��sad() {
        return p��sad;
    }

    public String getNimi() {
        return nimi;
    }

    @Override
    public String toString() {
        return "Hekk{" +
                "p��sad=" + Arrays.toString(p��sad) +
                ", nimi='" + nimi + '\'' +
                ", k�rgeim='" + this.K�rgeim() + '\'' +
                ", laius='" + this.Laius() + '\'' +
                '}';
    }
}
