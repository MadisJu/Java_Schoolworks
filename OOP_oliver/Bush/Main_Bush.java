package main.OOP_oliver.Bush;

import main.OOP_oliver.Bush.Bush;
import main.OOP_oliver.Bush.Hedge;

public class Main_Bush {

    public static void main(String[] args) {

        Bush bush1 = new Bush(15.1, 3.2);
        Bush bush2 = new Bush(9.2, 1.6);
        Bush bush3 = new Bush(19.3, 4.5);
        Bush bush4 = new Bush(5.5, 2.4);
        Bush bush5 = new Bush(19.35, 4);

        Bush[] list_bushes = new Bush[5];
        list_bushes[0] = bush1;
        list_bushes[1] = bush2;
        list_bushes[2] = bush3;
        list_bushes[3] = bush4;
        list_bushes[4] = bush5;

        Hedge hedge1 = new Hedge("Kuusehekk", list_bushes);

        System.out.println(hedge1.highest());

    }

}
