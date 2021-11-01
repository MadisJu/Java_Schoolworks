package main.OOP_oliver.Auto;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class Car {

    private String brand;
    private String model;
    private String reg_num;
    private String sort;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getReg_num() {
        return reg_num;
    }

    public String getSort() {
        return sort;
    }

    public LocalDate GenerateRandomDate() {

        LocalDate startDate = LocalDate.of(1990, 1, 1);
        long start = startDate.toEpochDay();

        LocalDate endDate = LocalDate.now();
        long end = endDate.toEpochDay();

        long randomEpochDay = ThreadLocalRandom.current().longs(start, end).findAny().getAsLong();
        return LocalDate.ofEpochDay(randomEpochDay);

    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", reg_num='" + reg_num + '\'' +
                ", sort='" + sort + '\'' +
                '}';
    }
}
