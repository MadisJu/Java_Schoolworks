package main.Faililugemine;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Oliver_Faililugemine { // *AHEM* Eerp tegi

    public static void main(String[] args) {
        int b = tähedFailis("false");
        System.out.println(b);
    }


    public static void failist(){
        //Failist lugemine

        // C:\Users\kristen.variksoo\IdeaProjects\käi pikalt\src\test.txt
        // C:\Users\kristen.variksoo\AppData\Roaming\.minecraft\options.txt

        try {
            File fail = new File("C:\\Users\\krist\\IdeaProjects\\InTheBeninnin\\src\\options.txt"); //Pathi pead täielikult kirjutama
            Scanner sisend = new Scanner(fail); //failist sisendi saamiseks

            while (sisend.hasNext()){
                String rida = sisend.nextLine();
                System.out.println(rida); //prindib iga rea failist
            }

        }
        catch(FileNotFoundException e) { // Vajalik, et programm kokku ei paneks, kui fail puudu on
            System.out.println("Fakd, nietu fail.");
        }

    }


    public static int tähedFailis(String täht){
        // leida kõik tähed või sõned failist, mida sa valid
        // Nt: leiab "a"

        try {
            File fail = new File("C:\\Users\\krist\\IdeaProjects\\InTheBeninnin\\src\\options.txt");
            Scanner sisend = new Scanner(fail);

            int a = 0;
            String t = täht.toLowerCase();
            int tt = t.length();

            while (sisend.hasNext()){
                String[] rida = sisend.nextLine().toLowerCase().split("");
                for (int i = 0; i < rida.length; i++){
                    try{
                        String tähed = "";
                        for (int j = 0; j < tt; j++) {
                            tähed += rida[i+j];
                        }
                        if (tähed.equals(t)){
                            a++;
                        }
                    }
                    catch (IndexOutOfBoundsException e){
                        continue;
                    }
                }
            }
            return a;


        }
        catch(FileNotFoundException e) {
            System.out.println("Fakd, nietu fail.");
            return 0;
        }
    }

}
