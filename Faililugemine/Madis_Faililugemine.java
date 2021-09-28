package main.Faililugemine;

import sun.awt.OSInfo;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Madis_Faililugemine {

    public static Scanner scam;

    public File GetFail()
    {
        return new File("C:\\Users\\madis.tamberg\\IdeaProjects\\Java_Schoolworks\\Faililugemine\\Fail.txt");
    }

    //Kordamine ül 1;
    public static int OtsiFailist(String failinimi, String sõna) throws FileNotFoundException {

        int i = 0;

        File fail = new File("C:\\Users\\eston\\IdeaProjects\\Java_Schoolworks\\Faililugemine\\" + failinimi);

        Scanner scam = new Scanner(fail);

        while(scam.hasNext())
        {
            String smallpp = scam.next();
            if(smallpp.contains(sõna))
            {
                i++;
            }
        }

        return i;
    }

    //Jesus christ this is a mess. ÜL2
    public static void Väljasta_noolemängu_tulemused() throws FileNotFoundException {

        File f = new File("C:\\Users\\eston\\IdeaProjects\\Java_Schoolworks\\Faililugemine\\nool.txt");

        TreeMap<Integer, String> t = new TreeMap<Integer, String>();

        Scanner scam = new Scanner(f);

        List<String> tulemused = new ArrayList<String>();

        while(scam.hasNext()) {
            String[] poolitatud = scam.nextLine().split(":");

            //ANYONE HAS ANY IDEA HOW TO DO THIS MORE EFFICIENTLY?
            poolitatud[1] = poolitatud[1].replaceAll("\t", "");
            poolitatud[1] = poolitatud[1].replaceAll("\n", "");

            //i give up idk what to name variables anymore
            Scanner buttcheeks = new Scanner(poolitatud[1]);

            int kogutulemus = 0;

            while (buttcheeks.hasNext()) {
                kogutulemus += buttcheeks.nextInt();
            }

            t.put(kogutulemus, poolitatud[0]);

        }

        Set treemapset = t.entrySet();
        Iterator i = treemapset.iterator();

        while(i.hasNext())
        {
            Map.Entry m = (Map.Entry) i.next();
            System.out.println(m.getValue() + ": " + m.getKey());
        }
    }
    //Kordamine 3
    public static void Nimed() throws FileNotFoundException
    {
        File f = new File("C:\\Users\\eston\\IdeaProjects\\Java_Schoolworks\\Faililugemine\\nimed.txt");

        List<String> nimed = new ArrayList<String>();

        Scanner scam = new Scanner(f);
        while(scam.hasNext())
        {
            String[] temparray = scam.nextLine().split(" ");
            String modifiedname = temparray[0].charAt(0) + ". " + temparray[1];
            nimed.add(modifiedname);
        }

        for (String nimi :
                nimed) {
            System.out.println(nimi);
        }
    }

    public static long matrix_diagonals(int[][] matrix)
    {
        long sum = 0;

        int x_len = matrix.length - 1;
        int x_pos_left = 0;
        int x_pos_right = x_len;
        for (int i = 0; i <= x_len; i++) {

            if(x_pos_left == x_pos_right)
            {
                sum += (matrix[i][x_pos_left]);
            }
            else
            {
                sum += (matrix[i][x_pos_left] + matrix[i][x_pos_right]);
            }
            x_pos_left++;
            x_pos_right--;
        }

        return sum;

    }

    public static int matrix_corners(int[][] matrix)
    {
        return matrix[0][matrix.length - 1] + matrix[0][0] + matrix[matrix.length - 1][0] + matrix[matrix.length - 1][matrix.length - 1];
    }

    public static List<int[][]> Read_Matrixes_From_File() throws FileNotFoundException
    {
        List<int[][]> tempList = new ArrayList<int[][]>();

        File f = new File("C:\\Users\\eston\\IdeaProjects\\Java_Schoolworks\\Faililugemine\\maatriksid.txt");

        Scanner scam = new Scanner(f);

        while(scam.hasNext())
        {
            String curLine = scam.nextLine();
            int[][] tempMatrix;
            while(!curLine.equals(""))
            {
                //Jeez i needa think for a bit
            }
        }

        return  tempList;
    }

    public static void main(String[] args) throws FileNotFoundException {

        /*
        Scanner temp = new Scanner(System.in);
        System.out.println("Sisestage sõna mida proovite leida");
        System.out.println(OtsiFailist("OtsiFailist.txt", temp.nextLine()));
        */

        //Väljasta_noolemängu_tulemused();

        //Nimed();


    }



}
