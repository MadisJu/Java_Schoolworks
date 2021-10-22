package main.OOP_oliver.lennuk;

public class Main_Lennuk {
    public static void main(String[] args) {
        Lennuk Fokker_F50 = new Lennuk("Fokker F50", 530, 46);
        Lennuk BN2 = new Lennuk("BN-2", 170, 9);
        Reis reis1 = new Reis("Yep", 15, Fokker_F50, 40);
        Reis reis2 = new Reis("Horaatia", 150, BN2, 9);
        Reis reis3 = new Reis("Dirhami",1750,  Fokker_F50, 1);

    }
}
