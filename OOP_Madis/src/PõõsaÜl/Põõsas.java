package main.OOP_Madis.src.P��sa�l;

public class P��sas {
    private double k�rgus;
    private double laius;

    public P��sas(double k�rgus, double laius) {
        this.k�rgus = k�rgus;
        this.laius = laius;
    }

    public double getK�rgus() {
        return k�rgus;
    }

    public void setK�rgus(double k�rgus) {
        this.k�rgus = k�rgus;
    }

    public double getLaius() {
        return laius;
    }

    public void setLaius(double laius) {
        this.laius = laius;
    }

    @Override
    public String toString() {
        return "P��sas{" +
                "k�rgus=" + k�rgus +
                ", laius=" + laius +
                '}';
    }
}
