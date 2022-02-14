package main.stuff;

import java.io.File;
import java.util.Objects;

public class display_files {

    public static void main(String[] args) {

        File folder =  new File("D:\\Desktop\\Koolitööd(homeworks.com)");
        File[] listOfFiles = folder.listFiles();

        assert listOfFiles != null;
        display_files(folder, listOfFiles, "");

    }

    public static void display_files(File folder, File[] listOfFiles, String indent) {

        //recursive method to display all files in a folder
        //and all subfolders


        for (File file : listOfFiles) {
            if (file.isFile()) {
                System.out.println(indent + file.getName());
            }
            else if (file.isDirectory()) {

                System.out.println(indent + file.getName());
                display_files(file, Objects.requireNonNull(file.listFiles()), indent + "  ");

            }

        }


    }

}

