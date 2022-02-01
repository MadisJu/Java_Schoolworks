package main.Rekursioon_Oliver;

import java.util.*;

public class ListAddingRec {

    public static void ListAdding(String[] list, String[] list2) {
        Set<List<String>> set = new HashSet<List<String>>();
        // new list that consists of list and list2
        List<String> list3 = new ArrayList<>(Arrays.asList(list));
        list3.addAll(Arrays.asList(list2));

        for (int i = 0; i < 1000; i++) {
            Collections.shuffle(list3);
            if (!set.contains(list3)) {
                set.add(list3);
                System.out.println(list3);
            }
        }
    }
    public static void main(String[] args)
    {
            ListAdding(new String[]{"kas", "mina"}, new String[]{"olen", "siin"});
    }
}
