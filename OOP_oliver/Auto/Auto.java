package main.OOP_oliver.Auto;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

public class Auto {

    String mark;
    String mudel;
    String reg_num;
    String liik;

    public Auto(String mark, String mudel, String reg_num, String liik) {
        this.mark = mark;
        this.mudel = mudel;
        this.reg_num = reg_num;
        this.liik = liik;
    }

    public LocalDate random_date() {
        Random r = new Random();
        LocalDate date = LocalDate.of(r.nextInt(2021), r.nextInt(12), r.nextInt(30));
        return date;
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

    public String getReg_num() {
        return reg_num;
    }

    public void setReg_num(String reg_num) {
        this.reg_num = reg_num;
    }

    public String getLiik() {
        return liik;
    }

    public void setLiik(String liik) {
        this.liik = liik;
    }
}
