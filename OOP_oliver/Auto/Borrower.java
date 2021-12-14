package main.OOP_oliver.Auto;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Objects;

public class Borrower {

    private final String company_name;
    private ArrayList<Car> available_cars;
    private double car_daily_rent;
    private double SUV_daily_rent;

    public Borrower(String company_name, ArrayList<Car> available_cars, double car_daily_rent, double SUV_daily_rent) {
        this.company_name = company_name;
        this.available_cars = available_cars;
        this.car_daily_rent = car_daily_rent;
        this.SUV_daily_rent = SUV_daily_rent;
    }

    public String getCompany_name() {
        return company_name;
    }

    public ArrayList<Car> getAvailable_cars() {
        return available_cars;
    }

    public void setAvailable_cars(ArrayList<Car> available_cars) {
        this.available_cars = available_cars;
    }

    public double getCar_daily_rent() {
        return car_daily_rent;
    }

    public void setCar_daily_rent(double car_daily_rent) {
        this.car_daily_rent = car_daily_rent;
    }

    public double getSUV_daily_rent() {
        return SUV_daily_rent;
    }

    public void setSUV_daily_rent(double SUV_daily_rent) {
        this.SUV_daily_rent = SUV_daily_rent;
    }


    public double RentToGeneratedDate(Car car) {

        long noOfDaysBetween = ChronoUnit.DAYS.between(car.GenerateRandomDate(), LocalDate.now());

        noOfDaysBetween = Math.abs(noOfDaysBetween);

        if (Objects.equals(car.getSort(), "maastur")) {
            return noOfDaysBetween*SUV_daily_rent*0.8;
        }
        else {
            return noOfDaysBetween*car_daily_rent*0.8;
        }

    }

    public double RentToSetDate(Car car, LocalDate date, ArrayList<Car> cars){

        if (cars.contains(car)) {

            long noOfDaysBetween = ChronoUnit.DAYS.between(date, LocalDate.now());

            noOfDaysBetween = Math.abs(noOfDaysBetween);

            if (Objects.equals(car.getSort(), "maastur")) {
                return noOfDaysBetween*SUV_daily_rent;
            }
            else {
                return noOfDaysBetween*car_daily_rent;
            }

        }

        return -1;

    }

    @Override
    public String toString() {
        return "Borrower{" +
                "company_name='" + company_name + '\'' +
                ", available_cars=" + available_cars +
                ", car_daily_rent=" + car_daily_rent +
                ", SUV_daily_rent=" + SUV_daily_rent +
                '}';
    }
}
