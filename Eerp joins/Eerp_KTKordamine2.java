import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Eerp_KTKordamine2 {

    public static void main(String[] args) {
        Nooled();
    }

    public static int Nooled(){
        ArrayList<Integer> skoorid = new ArrayList<Integer>();
        ArrayList<String> nimed = new ArrayList<String>();

        try{
            File fail5 = new File("C:\\Users\\krist\\IdeaProjects\\InTheBeninnin\\src\\noolemängu_tulemused.txt");
            Scanner rida = new Scanner(fail5);

            while(rida.hasNextLine()) {
                String[] ridaL = rida.nextLine().strip().split(":");
                String nimi = ridaL[0];
                String[] temp = ridaL[1].strip().split(" ");
                int skoor = 0;

                for(String s: temp){
                    skoor = skoor + Integer.parseInt(s);
                }
                skoorid.add(skoor);
                nimed.add(nimi);

            }
            int suurus = nimed.size();
            for (int i = 0; i < suurus; i++) {
                int max = 0;
                int koht = 0;
                for (int j = 0; j < nimed.size(); j++) {
                    if (skoorid.get(j) > max){
                        max = skoorid.get(j);
                        koht = j;
                    }
                }
                System.out.println(nimed.get(koht)+": "+skoorid.get(koht));
                skoorid.remove(koht);
                nimed.remove(koht);
            }
        }
        catch (Exception e) {
            System.out.println("Faili ei ole/ ei leidnud.");

        }
        return 0;
    }
}
