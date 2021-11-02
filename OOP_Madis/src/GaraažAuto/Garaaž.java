package main.OOP_Madis.src.GaraaþAuto;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Garaaþ
{
    ArrayList<Auto> autod = new ArrayList<Auto>();

    public Garaaþ(ArrayList<Auto> autod)
    {
        this.autod = autod;
    }

    public void Lisa_auto(Auto auto)
    {
        autod.add(auto);
    }
    public void Eemalda_auto(String numbrimärk)
    {

        int i = 0;
        for (Auto a : autod)
        {
            if(a.getNumbrid().equalsIgnoreCase(numbrimärk))
            {

            }
        }
    }
    public void Kuva_margi_järgi()
    {

    }
    public void Kuva_värvi_järgi()
    {

    }
    public void Kuva_kiiruse_järgi()
    {

    }

}
