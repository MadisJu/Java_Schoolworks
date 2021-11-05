package main.OOP_oliver.KT05;

//12. a programmeerimine
//Nimi : Oliver Puusalu
//Kuupäev : 05/11/2021

public class Toode {

    String nimi;
    double hind;
    int ID;

    public Toode(String nimi, double hind, int ID) {
        this.nimi = nimi;
        this.hind = hind;
        this.ID = ID;
    }

    public String info() {
        return "Toode{" +
                "nimi='" + nimi + '\'' +
                ", hind=" + hind +
                ", ID=" + ID +
                '}';
    }
}
