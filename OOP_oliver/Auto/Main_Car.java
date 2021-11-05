package main.OOP_oliver.Auto;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main_Car {

    public static void main(String[] args) throws FileNotFoundException {


        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<Borrower> borrowers = new ArrayList<>();
        ArrayList<String> borrowers_names = new ArrayList<>();
        ArrayList<Car> available_cars = new ArrayList<>();

        File file1 = new File("OOP_oliver/Auto/autod.txt");
        Scanner content1 = new Scanner(file1);

        while (content1.hasNext()) {

            String line = content1.nextLine();

            String[] line_splitted = line.strip().split(" ");

            Car car = new Car(line_splitted[0], line_splitted[1], line_splitted[2], line_splitted[3]);

            cars.add(car);

        }

        content1.close();

        File file2 = new File("OOP_oliver/Auto/rentnik.txt");
        Scanner content2 = new Scanner(file2);

        while (content2.hasNext()) {

            String line = content2.nextLine();

            String[] line_splitted = line.strip().split(" ");

            borrowers_names.add(line_splitted[0]);

            Borrower aaron = new Borrower(line_splitted[0], available_cars, Double.parseDouble(line_splitted[1]), Double.parseDouble(line_splitted[2]));
            borrowers.add(aaron);

        }
        content2.close();

        int current_borrower = 0;
        int a = 0;
        boolean is_already_looped = false;

        ArrayList<ArrayList<Car>> available_cars_list = new ArrayList<>();

        available_cars_list.add(available_cars);

        while (!cars.isEmpty()) {

            if (current_borrower >= borrowers.size()) {
                current_borrower = current_borrower-borrowers.size();
                is_already_looped = true;
            }
            if (is_already_looped) {
                available_cars = available_cars_list.get(current_borrower);
            }

            available_cars.add(cars.get(a));
            available_cars_list.add(available_cars);

            borrowers.get(current_borrower).setAvailable_cars(available_cars_list.get(current_borrower));
            available_cars.removeAll(cars);
            cars.remove(a);
            ++current_borrower;

            System.out.println(borrowers.get(current_borrower).getAvailable_cars());

        }

        while (true) {

            System.out.println("What borrower are you looking for?");

            Scanner input_to_get_name = new Scanner(System.in);
            String input_name = input_to_get_name.nextLine();

            System.out.println(available_cars_list.get(1));

            available_cars = available_cars_list.get(borrowers_names.indexOf(input_name)+1);

            if (borrowers_names.contains(input_name)) {

                System.out.println(available_cars.size());

                for (Car car : available_cars
                     ) {
                    System.out.println(car.toString());
                }

                System.out.println(" ");
                System.out.println("Until what date are you looking to borrow?");

                Scanner input_to_get_date = new Scanner(System.in);
                LocalDate input_date = LocalDate.parse(input_to_get_date.nextLine());

                System.out.println("Enter the registration number of wanted car: ");
                Scanner input_to_get_reg_num = new Scanner(System.in);
                String input_reg_num = input_to_get_reg_num.nextLine();

                for (Car car : available_cars)
                {
                    if (Objects.equals(car.getReg_num(), input_reg_num)) {
                        System.out.println(borrowers.get(borrowers.indexOf(input_name)).RentToSetDate(car, input_date, available_cars));
                    }
                }

                break;
            }
            else {
                System.out.println("Something went wrong");
            }

        }

        for (Car car : cars) {
            System.out.println(car.toString());
        }

    }

}
