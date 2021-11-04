package main.OOP_oliver.Auto2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Car2_Main {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("OOP_oliver/Auto2/autod2.txt");
        Scanner content = new Scanner(file);

        ArrayList<Car2> temp1 = new ArrayList<>();
        ArrayList<Car2> temp2 = new ArrayList<>();
        ArrayList<Car2> temp3 = new ArrayList<>();

        Garage garage1 = new Garage(temp1);
        Garage garage2 = new Garage(temp2);
        Garage garage3 = new Garage(temp3);

        int max_garage1 = 5;
        int max_garage2 = 25;
        int max_garage3 = 50;

        boolean is_full_garage1 = false;
        boolean is_full_garage2 = false;
        boolean is_full_garage3 = false;

        boolean all_garages_full = false;

        while (content.hasNext() && !all_garages_full) {
            String line = content.nextLine();
            String[] line_split_1 = line.split(":");
            String[] line_split_2 = line_split_1[1].split("-");

            Car2 car = new Car2(line_split_2[0].strip(), line_split_1[0].strip(), line_split_2[1].strip(), Integer.parseInt(line_split_2[2].strip()));

            if (!is_full_garage1 && garage1.cars.size() < max_garage1) {
                garage1.add_car(car);
            }
            if (garage1.cars.size() == max_garage1) {
                is_full_garage1 = true;
            }
            if (is_full_garage1 && !is_full_garage2 && garage2.cars.size() < max_garage2){
                garage2.add_car(car);
            }
            if (garage2.cars.size() == max_garage2) {
                is_full_garage2 = true;
            }
            if (is_full_garage1 && is_full_garage2 && !is_full_garage3 && garage3.cars.size() < max_garage3) {
                garage3.add_car(car);
            }
            if (garage3.cars.size() == max_garage3) {
                is_full_garage3 = true;
            }

            if (is_full_garage1 && is_full_garage2 && is_full_garage3) {
                all_garages_full = true;
            }
        }

        garage1.output_by_brand("Lexus");
        garage3.output_by_speed();

    }

}
