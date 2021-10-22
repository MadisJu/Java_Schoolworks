package main.OOP_Madis.src.AutoRent;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Auto {
    private String mark, mudel, registrinumber, liik;

    public Auto(String mark, String mudel, String registrinumber, String liik) {
        this.mark = mark;
        this.mudel = mudel;
        this.registrinumber = registrinumber;
        this.liik = liik;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMudel() {
        return mudel;
    }

    public void setMudel(String mudel) {
        this.mudel = mudel;
    }

    public String getRegistrinumber() {
        return registrinumber;
    }

    public void setRegistrinumber(String registrinumber) {
        this.registrinumber = registrinumber;
    }

    public String getLiik() {
        return liik;
    }

    public void setLiik(String liik) {
        this.liik = liik;
    }

    public LocalDate suvalinekuupäev()
    {
        long a = LocalDate.of(2300, 12, 12).toEpochDay();
        long b = LocalDate.now().toEpochDay();

        long suvaline = ThreadLocalRandom.current().nextLong(b, 1);

        return LocalDate.ofEpochDay(suvaline);
    }
}
