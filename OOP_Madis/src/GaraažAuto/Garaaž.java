package main.OOP_Madis.src.Garaa�Auto;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Garaa�
{
    ArrayList<Auto> autod = new ArrayList<Auto>();

    public Garaa�(ArrayList<Auto> autod)
    {
        this.autod = autod;
    }

    public void Lisa_auto(Auto auto)
    {
        autod.add(auto);
    }
    public void Eemalda_auto(String numbrim�rk)
    {

        int i = 0;
        for (Auto a : autod)
        {
            if(a.getNumbrid().equalsIgnoreCase(numbrim�rk))
            {

            }
        }
    }
    public void Kuva_margi_j�rgi()
    {

    }
    public void Kuva_v�rvi_j�rgi()
    {

    }
    public void Kuva_kiiruse_j�rgi()
    {

    }

}
