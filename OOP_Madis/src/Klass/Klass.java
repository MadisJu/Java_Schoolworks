package main.OOP_Madis.src.Klass;

import java.util.ArrayList;

public class Klass
{
    private String ID;
    private ArrayList<Õpilane> õpilased;

    public Klass(String ID, ArrayList<Õpilane> õpilased)
    {
        this.ID = ID;
        this.õpilased = õpilased;
    }

    public Klass(String ID)
    {
        this.ID = ID;
    }

    public Õpilane vanimÕpilane()
    {
        Õpilane cur_vanim = this.õpilased.get(0);

        for (Õpilane temp_õ: this.õpilased)
        {
            if(temp_õ.getVanus() > cur_vanim.getVanus())
                cur_vanim = temp_õ;
        }

        return cur_vanim;
    }

    public String KasRohkemPoisseVõiTüdrukuid()
    {
        int poisid = 0, tüdrukud = 0;

        for (Õpilane õp: this.õpilased)
        {
            if(õp.getSugu() == "mees" ? true : false) poisid++; else tüdrukud++;
        }

        return poisid > tüdrukud ? "Poisse on rohkem" : "Tüdrukuid on rohkem";
    }

    public String klassiNimekiri()
    {
        return "";
    }

    public String getID()
    {
        return ID;
    }

    public ArrayList<Õpilane> getÕpilased()
    {
        return õpilased;
    }

    public void LisaÕpilane(Õpilane õpilane)
    {
        this.õpilased.add(õpilane);
    }
}
