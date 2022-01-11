import java.util.ArrayList;

public class revList {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");

        ArrayList<String> revList = new ArrayList<>();

        reverseList(list, revList);

        System.out.println(revList);


    }

    public static void reverseList(ArrayList<String> list, ArrayList<String> revList) {

        if (list.size() == 0) {
            return;
        }
        else {
            String last = list.remove(list.size() - 1);
            revList.add(last);
            reverseList(list, revList);
        }
    }
}
