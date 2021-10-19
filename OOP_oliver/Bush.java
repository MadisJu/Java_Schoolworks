package main.OOP_oliver;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Bush {

    private double height;
    private double width;

    public Bush(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double growth() {
        double temp = ThreadLocalRandom.current().nextDouble(0, 0.1);

        this.height += temp;

        return this.height;

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "bush{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
