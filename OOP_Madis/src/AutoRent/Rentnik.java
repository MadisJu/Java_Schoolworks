package main.OOP_Madis.src.AutoRent;

import java.time.LocalDate;
import java.util.ArrayList;

public class Rentnik {

    private String firma;
    private ArrayList<Auto> autod;
    private double m_rendihind, a_rendihind;

    public Rentnik(String firma, ArrayList<Auto> autod, double m_rendihind, double a_rendihind) {
        this.firma = firma;
        this.autod = autod;
        this.m_rendihind = m_rendihind;
        this.a_rendihind = a_rendihind;
    }

    public double Hind(Auto a )
    {
        long suv_kuupäev = a.suvalinekuupäev().toEpochDay();
        return a_rendihind * (suv_kuupäev - LocalDate.now().toEpochDay()) - (a_rendihind * (suv_kuupäev - LocalDate.now().toEpochDay()) * 0.2);
    }

    public double Hind(Auto a, LocalDate kuup)
    {
        if(autod.contains(a)) return a_rendihind * kuup.toEpochDay() - LocalDate.now().toEpochDay();
        else return 0;
    }

    public String getFirma() {
        return firma;
    }

    public ArrayList<Auto> getAutod() {
        return autod;
    }

    public void setAutod(ArrayList<Auto> autod) {
        this.autod = autod;
    }

    public double getM_rendihind() {
        return m_rendihind;
    }

    public void setM_rendihind(double m_rendihind) {
        this.m_rendihind = m_rendihind;
    }

    public double getA_rendihind() {
        return a_rendihind;
    }

    public void setA_rendihind(double a_rendihind) {
        this.a_rendihind = a_rendihind;
    }

    @Override
    public String toString() {
        StringBuilder a = new StringBuilder();

        for (Auto auto :
                autod) {
            a.append(auto.toString());
        }

        return "Rentnik{" +
                "firma='" + firma + '\'' +
                ", autod=" + a.toString() +
                ", m_rendihind=" + m_rendihind +
                ", a_rendihind=" + a_rendihind +
                '}';
    }
}
