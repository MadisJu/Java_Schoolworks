package main.Rekursioon_Oliver;

import java.util.ArrayList;
import java.util.List;

public class KTYL {

    public static void main(String[] args) {

        ArrayList<Float> items = new ArrayList<>();

        for (int i = 0; i < 128; i++) {
            //generates random numbers between 0 and 1 with 1 decimal place
            items.add((int) ((Math.random() * 90) + 10) / 10.0f);
        }

        System.out.println("Items: " + items);

        float setWeight = 0;

        sets(items, setWeight, new ArrayList<Float>());

    }

    //using recursion method that finds and prints all possible sets with weight 10 and have between 12 and 14 items
    public static void sets(ArrayList<Float> items, float setWeight, ArrayList<Float> set) {

        if (setWeight == 10 && set.size() >= 12 && set.size() <= 14) {
            System.out.println("Set: " + set);
        }
        if (setWeight > 10) {
            return;
        }
        else{

            float FirstItem = items.get(0);
            items.remove(0);
            sets(items, setWeight, set);
            set.add(FirstItem);
            setWeight += FirstItem;
            sets(items, setWeight, set);

        }
    }

}
