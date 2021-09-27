package main.Faililugemine;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Madis_Faililugemine {

    public static Scanner scam;

    public File GetFail()
    {
        return new File("C:\\Users\\madis.tamberg\\IdeaProjects\\Java_Schoolworks\\Faililugemine\\Fail.txt");
    }

    public static void main(String[] args) throws FileNotFoundException {

        try {
            File myfile =   new File("C:\\Users\\madis.tamberg\\IdeaProjects\\Java_Schoolworks\\Faililugemine\\Fail.txt");
            scam = new Scanner(myfile);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("lol!");
        }



    }

}
