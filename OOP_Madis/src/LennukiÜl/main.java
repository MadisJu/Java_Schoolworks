package main.OOP_Madis.src.Lennuki‹l;

public class main {

    public static void main(String[] args) {
        Lennuk l1 = new Lennuk("Fokker", 530, 46);
        Lennuk l2 = new Lennuk("B2", 304, 70);

        Reis r1 = new Reis("Bucharest", 700, l1, 30);
        System.out.println(r1.toString());
    }
}
