package main.OOP_oliver.Lennuk_package;

public class Reis {

    String siht;
    int kaugus;
    Lennuk lennuk;
    int piletite_arv;

    public Reis(String siht, int kaugus, Lennuk lennuk, int piletite_arv) {
        this.siht = siht;
        this.kaugus = kaugus;
        this.lennuk = lennuk;
        this.piletite_arv = piletite_arv;
    }

    @Override
    public String toString() {
        return "Reis{" +
                "siht='" + siht + '\'' +
                ", kaugus=" + kaugus +
                ", lennuk=" + lennuk +
                ", piletite_arv=" + piletite_arv +
                '}';
    }

    public int kestvus() {
        return (int) (this.kaugus/lennuk.getKiirus()) * 60;
    }
    public int vabad_kohad() {
        return lennuk.getMax_reisijad()-this.piletite_arv;
    }



    public String getSiht() {
        return siht;
    }

    public int getKaugus() {
        return kaugus;
    }

    public Lennuk getLennuk() {
        return lennuk;
    }

    public int getPiletite_arv() {
        return piletite_arv;
    }
}
