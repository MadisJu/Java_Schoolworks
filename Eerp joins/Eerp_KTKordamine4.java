import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Eerp_KTKordamine4 {

    public static void main(String[] args) {
        maatriksid();
    }

    public static void maatriksid(){
        try {
            File fail = new File("C:\\Users\\krist\\IdeaProjects\\InTheBeninnin\\src\\maatriksid.txt");
            Scanner rida = new Scanner(fail);
            int a = 0;
            int kord = 0;
            int[][] matrix = new int[0][0];

            while(rida.hasNextLine()){
                String[] list = rida.nextLine().split(" ");
                if (a == 0){
                    matrix = new int[list.length][list.length];
                }

                if (list[0].equals("")&& kord == 0){
                    print_maatriks(matrix);
                    System.out.println("Nurkade summa: " + nurgad(matrix));
                    System.out.println("Diagonaalide summa: " + diagonaalid(matrix));
                    System.out.println("Kogu summa: " + kogu(matrix));
                    kord++;
                    a = 0;
                }
                else {
                    kord = 0;
                    int[] temp = new int[list.length];

                    for (String arv: list) {
                        matrix[a/list.length][a% list.length] = Integer.parseInt(arv);
                        a++;
                    }
                }
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Faili ei leidnud");
        }
    }

    public static int nurgad(int[][] matrix){
        return matrix[0][0] + matrix[0][matrix.length-1] + matrix[matrix.length-1][0] + matrix[matrix.length-1][matrix.length-1];
    }

    public static void print_maatriks(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }

    public static int diagonaalid(int[][] matrix) {
        int kogu = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (i == matrix.length-1-i){
                kogu = kogu + matrix[i][i];
            }
            else{
                kogu = kogu + matrix[i][i] + matrix[i][matrix.length-1-i];
            }
        }
        return kogu;
    }

    public static int kogu(int[][] matrix){
        int kogu = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                kogu = kogu + matrix[i][j];
            }
        }
        return kogu;
    }
}
