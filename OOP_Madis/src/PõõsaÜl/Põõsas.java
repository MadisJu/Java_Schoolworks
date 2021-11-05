package main.OOP_Madis.src.PõõsaÜl;

public class Põõsas {
    private double kõrgus;
    private double laius;

    public Põõsas(double kõrgus, double laius) {
        this.kõrgus = kõrgus;
        this.laius = laius;
    }

    public double getKõrgus() {
        return kõrgus;
    }

    public void setKõrgus(double kõrgus) {
        this.kõrgus = kõrgus;
    }

    public double getLaius() {
        return laius;
    }

    public void setLaius(double laius) {
        this.laius = laius;
    }

    @Override
    public String toString() {
        return "Põõsas{" +
                "kõrgus=" + kõrgus +
                ", laius=" + laius +
                '}';
    }
}
