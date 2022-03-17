package main.Rekursioon_Oliver;

import java.util.ArrayList;
import java.util.List;

public class KTYL {

    public static void main(String[] args) {

        ArrayList<Float> items = new ArrayList<>();

        for (int i = 0; i < 128; i++) {
            //generates random numbers between 0 and 1 with 1 decimal place
            items.add((int) ((Math.random() * 100)) / 10.0f);
        }

        System.out.println("Items: " + items);

        ArrayList<Float> set = new ArrayList<>();

        float setWeight = 0;

        sets(items, setWeight, set);

    }

    //using recursion method that finds and prints all possible sets with weight 10 and have between 12 and 14 items
    public static void sets(ArrayList<Float> items, float setWeight, ArrayList<Float> set) {

        if (setWeight == 10) {
            System.out.println("Set: " + set);
        }
        if (setWeight > 10) {
            return;
        }
        if (items.size() == 0) {
            return;
        }
        else{
            float FirstItem = items.get(0);
            items.remove(0);
            float newSetWeight = setWeight;
            ArrayList<Float> newSet = new ArrayList<>(set);

            sets(items, setWeight, newSet);
            newSet.add(FirstItem);
            newSetWeight += FirstItem;
            sets(items, newSetWeight, newSet);

        }
    }

}
