package main.OOP_Madis.src.Klass;

import java.util.ArrayList;

public class Klass
{
    private String ID;
    private ArrayList<�pilane> �pilased;

    public Klass(String ID, ArrayList<�pilane> �pilased)
    {
        this.ID = ID;
        this.�pilased = �pilased;
    }

    public Klass(String ID)
    {
        this.ID = ID;
    }

    public �pilane vanim�pilane()
    {
        �pilane cur_vanim = this.�pilased.get(0);

        for (�pilane temp_�: this.�pilased)
        {
            if(temp_�.getVanus() > cur_vanim.getVanus())
                cur_vanim = temp_�;
        }

        return cur_vanim;
    }

    public String KasRohkemPoisseV�iT�drukuid()
    {
        int poisid = 0, t�drukud = 0;

        for (�pilane �p: this.�pilased)
        {
            if(�p.getSugu() == "mees" ? true : false) poisid++; else t�drukud++;
        }

        return poisid > t�drukud ? "Poisse on rohkem" : "T�drukuid on rohkem";
    }

    public String klassiNimekiri()
    {
        return "";
    }

    public String getID()
    {
        return ID;
    }

    public ArrayList<�pilane> get�pilased()
    {
        return �pilased;
    }

    public void Lisa�pilane(�pilane �pilane)
    {
        this.�pilased.add(�pilane);
    }
}
