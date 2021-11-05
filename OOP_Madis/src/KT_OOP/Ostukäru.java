package main.OOP_Madis.src.KT_OOP;
// 12.A Programeerimine
// Nimi: Madis-Julius Tamberg
// Kuupäev: 05.11.2021

import java.util.ArrayList;

public class Ostukäru
{

    private ArrayList<Toode> tooted;
    private int ID;

    public Ostukäru(int ID)
    {
        this.tooted = new ArrayList<Toode>();
        this.ID = ID;
    }

    public ArrayList<Toode> getTooted()
    {
        return tooted;
    }

    public int getID()
    {
        return ID;
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
