package main.OOP_Madis.src.KT_OOP;

import java.util.ArrayList;

public class Ostuk�ru
{

    private ArrayList<Toode> tooted;
    private int ID;

    public Ostuk�ru(int ID)
    {
        this.tooted = new ArrayList<Toode>();
        this.ID = ID;
    }

    public void LisaKorvi(Toode lisatavToode)
    {
        tooted.add(lisatavToode);
    }

    public float KorviKoguSumma()
    {
        float sum = 0;
        for (Toode tempToode: tooted)
        {
            sum += tempToode.getHind();
        }
        return sum;
    }

    public void OstukorviSisu()
    {
        for (Toode tempToode: tooted)
        {
            System.out.println(tempToode.Info());
        }
    }
}
