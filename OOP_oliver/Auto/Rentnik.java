package main.OOP_oliver.Auto;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Rentnik {

    private String firma_nimi;
    private ArrayList<Auto> autod;
    private double car_daily_hind;
    private double maastur_daily_hind;

    public Rentnik(String firma_nimi, ArrayList<Auto> autod, double car_daily_hind, double maastur_daily_hind) {
        this.firma_nimi = firma_nimi;
        this.autod = autod;
        this.car_daily_hind = car_daily_hind;
        this.maastur_daily_hind = maastur_daily_hind;
    }

    public double rent(Auto auto) {
        double rent = car_daily_hind*(ChronoUnit.DAYS.between(LocalDate.now(), auto.random_date()));

        return rent;
    }


    public ArrayList<Auto> getAutod() {
        return autod;
    }

    public void setAutod(ArrayList<Auto> autod) {
        this.autod = autod;
    }

    public double getCar_daily_hind() {
        return car_daily_hind;
    }

    public void setCar_daily_hind(double car_daily_hind) {
        this.car_daily_hind = car_daily_hind;
    }

    public double getMaastur_daily_hind() {
        return maastur_daily_hind;
    }

    public void setMaastur_daily_hind(double maastur_daily_hind) {
        this.maastur_daily_hind = maastur_daily_hind;
    }
}
