package main.Rekursioon_Oliver;

import java.util.ArrayList;

public class possible_addups {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        recursion(5, list);

    }

    public static void recursion(int num, ArrayList<Integer> list){

        if(num == 0){
            System.out.println(list);
        }
        else {
            ArrayList<Integer> newList = new ArrayList<>(list);
            newList.add(1);
            recursion(num - 1, newList);
            if (num > 1) {
                ArrayList<Integer> newList2 = new ArrayList<>(list);
                newList2.add(2);
                recursion(num - 2, newList2);
            }
        }
    }
}
