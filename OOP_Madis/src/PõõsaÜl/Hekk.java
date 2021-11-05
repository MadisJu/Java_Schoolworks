package main.OOP_Madis.src.PõõsaÜl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hekk {
    private Põõsas[] põõsad;
    private String nimi;

    public Hekk(Põõsas[] põõsad, String nimi) {
        this.põõsad = põõsad;
        this.nimi = nimi;
    }

    public double Kõrgeim()
    {
        double  max_kõrgus = 0.0;

        for (Põõsas p: põõsad
             ) {
            if(p.getKõrgus() > max_kõrgus)
            {
                max_kõrgus = p.getKõrgus();
            }
        }

        return max_kõrgus;
    }

    public double Laius()
    {
        double t = 0;

        for (Põõsas p: põõsad
             ) {
            t += p.getLaius();
        }

        return t;
    }

    public Põõsas[] getPõõsad() {
        return põõsad;
    }

    public String getNimi() {
        return nimi;
    }

    @Override
    public String toString() {
        return "Hekk{" +
                "põõsad=" + Arrays.toString(põõsad) +
                ", nimi='" + nimi + '\'' +
                ", kõrgeim='" + this.Kõrgeim() + '\'' +
                ", laius='" + this.Laius() + '\'' +
                '}';
    }
}
