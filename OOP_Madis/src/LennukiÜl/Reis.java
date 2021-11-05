package main.OOP_Madis.src.LennukiÜl;

public class Reis {
    private String sihtpunk;
    private int kaugus;
    private Lennuk lennuk;
    private int piletite_arv;

    public Reis(String sihtpunk, int kaugus, Lennuk lennuk, int piletite_arv) {
        this.sihtpunk = sihtpunk;
        this.kaugus = kaugus;
        this.lennuk = lennuk;
        this.piletite_arv = piletite_arv;
    }

    public int reisikestvus()
    {
        return (int) (this.kaugus/this.lennuk.getKiirus());
    }

    public int vabad_kohad()
    {
        return this.lennuk.getMax_reisijad() - this.piletite_arv;
    }

    public String getSihtpunk() {
        return sihtpunk;
    }

    public void setSihtpunk(String sihtpunk) {
        this.sihtpunk = sihtpunk;
    }

    public int getKaugus() {
        return kaugus;
    }

    public void setKaugus(int kaugus) {
        this.kaugus = kaugus;
    }

    public Lennuk getLennuk() {
        return lennuk;
    }

    public void setLennuk(Lennuk lennuk) {
        this.lennuk = lennuk;
    }

    public int getPiletite_arv() {
        return piletite_arv;
    }

    public void setPiletite_arv(int piletite_arv) {
        this.piletite_arv = piletite_arv;
    }

    @Override
    public String toString() {
        return "Reis{" +
                "sihtpunk='" + sihtpunk + '\'' +
                ", kaugus=" + kaugus +
                ", lennuk=" + lennuk +
                ", piletite_arv=" + piletite_arv +
                ", kestab=" + this.reisikestvus() +
                ", ja vabu kohti=" + this.vabad_kohad() +
                '}';
    }
}
