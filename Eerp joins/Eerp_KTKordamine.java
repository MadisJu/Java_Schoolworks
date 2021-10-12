import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Eerp_KTKordamine {

    public static void main(String[] args) {
        System.out.println(Otsimine());

    }

    public static int Otsimine(){

        try {
            File fail = new File("C:\\Users\\krist\\IdeaProjects\\InTheBeninnin\\src\\OtsiFailist.txt");
            Scanner rida = new Scanner(fail);
            Scanner sisend = new Scanner(System.in);
            int lõpp = 0;

            System.out.println("Sisenda sõne, mida soovid otsida: ");
            String[] sõneL = sisend.nextLine().toLowerCase().split("");

            while(rida.hasNext()){
                String[] ridaL = rida.nextLine().toLowerCase().split("");

                for (int ridaT = 0; ridaT < ridaL.length + 1 - sõneL.length; ridaT++) {
                    int count = 0;

                    for (int sõneT = 0; sõneT < sõneL.length; sõneT++) {
                        if (ridaL[ridaT+sõneT].equals(sõneL[sõneT])){
                            count++;
                            if (count == sõneL.length){
                                lõpp++;
                            }
                        }

                        else {
                            break;
                        }
                    }
                }
            }
            rida.reset();
            return lõpp;

        }
        catch(FileNotFoundException e) {
            System.out.println("Faili ei ole/ ei leidnud.");
            return 0;
        }
    }
}
