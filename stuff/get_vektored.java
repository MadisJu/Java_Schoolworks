package main.stuff;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class get_vektored {
    public static void main(String[] args) {

        ArrayList<Integer> test = new ArrayList<>();

        test.add(5);
        test.add(3);
        test.add(7);
        test.add(1);


        Collections.sort(test);

        for (Integer i: test) {
            System.out.println(i);
        }


    }
}
