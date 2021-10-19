package main.OOP_Madis.src.Lapsehoidija;

public class Lapsehoidija {
    private int num;
    private String nimi;

    public Lapsehoidija(int num, String nimi) {
        this.num = num;
        this.nimi = nimi;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    @Override
    public String toString() {
        return "Lapsehoidija{" +
                "num=" + num +
                ", nimi='" + nimi + '\'' +
                '}';
    }
}
