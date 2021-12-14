package main.OOP_Madis.src.KT_OOP;
// 12.A Programeerimine
// Nimi: Madis-Julius Tamberg
// Kuupäev: 05.11.2021

public class Toode
{
    private String nimi;
    private double hind;
    private int ID;

    public Toode(String nimi, double hind, int ID)
    {
        this.nimi = nimi;
        this.hind = hind;
        this.ID = ID;
    }

    public String Info()
    {
        final StringBuilder sb = new StringBuilder("Toode - ");
        sb.append(nimi).append(" | maksumusega : ").append(hind).append(" | ostukorvis : ").append(ID).append(" ");
        return sb.toString();
    }

    public double getHind()
    {
        return hind;
    }

    public int getID()
    {
        return ID;
    }
}
