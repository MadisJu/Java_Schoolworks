package main.Rekursioon_Oliver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class set_thing {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Set<ArrayList> set = new HashSet<>();
        for (int i = 1; i < 4; i++) {
            list.add(i);
        }
        System.out.println(list);
        find_sets(list, set);



    }
    public static ArrayList find_sets(ArrayList<Integer> array, Set<ArrayList> set) {

        if (array.size() == 0){
            return array;
        }
        else{
            for (int i = 0; i < array.size(); i++) {
                ArrayList<Integer> new_array = new ArrayList<>(array);
                new_array.remove(i);
                if (!set.contains(new_array)) {
                    set.add(new_array);
                    System.out.println(new_array);
                }
                find_sets(new_array, set);
            }
        }
        return array;

    }

}
