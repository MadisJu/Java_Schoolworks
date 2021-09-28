import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Eerp_KTKordamine3 {

    public static void main(String[] args) {
        Nimed();

    }

    public static void Nimed(){

        try {
            File fail = new File("C:\\Users\\krist\\IdeaProjects\\InTheBeninnin\\src\\nimed.txt");
            Scanner rida = new Scanner(fail);

            while (rida.hasNextLine()){
                String[] nimed = rida.nextLine().split(" ");
                for (int i = 0; i < nimed.length; i++) {
                    if (i == nimed.length-1){
                        System.out.println(nimed[i]);
                    }
                    else {
                        System.out.print(nimed[i].split("")[0]+". ");
                    }

                }
            }

        }
        catch (Exception e) {
            System.out.println("Faili ei leidnud.");
        }

    }
}
