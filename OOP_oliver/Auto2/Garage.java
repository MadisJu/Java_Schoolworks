package main.OOP_oliver.Auto2;
import main.OOP_oliver.Auto.Car;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Garage {

    ArrayList<Car2> cars;

    public Garage(ArrayList<Car2> cars) {
        this.cars = cars;
    }

    public ArrayList<Car2> add_car(Car2 car) {

        cars.add(car);
        return cars;

    }

    public ArrayList<Car2> remove_car(String reg_num) {

        cars.removeIf(car -> reg_num.equals(car.getReg_num()));
        return cars;

    }

    public void output_by_brand(String brand) {

        for (Car2 car : cars)
        {
            if (brand.equals(car.getBrand()))
            {
                System.out.println(car.car_data());
            }
        }
    }

    public void output_by_colour(String colour)
    {

        for (Car2 car : cars)
        {
            if (colour.equals(car.getColour()))
            {
                System.out.println(car.car_data());
            }
        }
    }

    public void output_by_speed(){

        ArrayList<Integer> list_speeds = new ArrayList<>();

        for (Car2 car : cars)
        {
            list_speeds.add(car.getMax_speed());
        }

        ArrayList<Integer> Copy_of_list_speeds = (ArrayList<Integer>) list_speeds.clone();

        Collections.sort(list_speeds, Collections.reverseOrder());

        for (int i = 0; i < list_speeds.size(); i++){

            //NO CLUE WHY IT DOESNT WORK


            System.out.println(list_speeds.get(i));

            System.out.println(cars.get(Copy_of_list_speeds.indexOf(list_speeds.get(i))).car_data());

            //System.out.println(cars.get(list_speeds.indexOf(temp)).car_data());

        }
    }
}
