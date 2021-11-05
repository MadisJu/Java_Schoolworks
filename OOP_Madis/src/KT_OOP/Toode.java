package main.OOP_Madis.src.KT_OOP;

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
        sb.append(nimi).append(" / ").append(hind).append(" / ").append(ID).append(" ");
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
