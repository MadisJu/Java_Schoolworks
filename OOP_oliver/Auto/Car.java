package main.OOP_oliver.Auto;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class Car {

    private String brand;
    private String model;
    private String reg_num;
    private String sort;

    public Car(String brand, String model, String reg_num, String sort) {
        this.brand = brand;
        this.model = model;
        this.reg_num = reg_num;
        this.sort = sort;
    }

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

        LocalDate startDate = LocalDate.now();
        long start = startDate.toEpochDay();

        LocalDate endDate = LocalDate.of(2030, 12, 30);
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
