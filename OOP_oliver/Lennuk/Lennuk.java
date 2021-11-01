package main.OOP_oliver.Lennuk;

public class Lennuk {

    private String nimi;
    private double kiirus;
    private int max_reisijad;

    public Lennuk(String nimi, double kiirus, int max_reisijad) {
        this.nimi = nimi;
        this.kiirus = kiirus;
        this.max_reisijad = max_reisijad;
    }

    @Override
    public String toString() {
        return "Lennuk{" +
                "nimi='" + nimi + '\'' +
                ", kiirus=" + kiirus +
                ", max_reisijad=" + max_reisijad +
                '}';
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public double getKiirus() {
        return kiirus;
    }

    public void setKiirus(double kiirus) {
        this.kiirus = kiirus;
    }

    public int getMax_reisijad() {
        return max_reisijad;
    }

    public void setMax_reisijad(int max_reisijad) {
        this.max_reisijad = max_reisijad;
    }
}
