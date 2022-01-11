import java.util.Scanner;

public class NimiParool {

    public static void main(String[] args) {

        String name = "Bob";
        String password = "123";

        PassCheck(name, password);

    }

    public static void PassCheck(String name, String password) {

        if (name.equals("Bob") && password.equals("123")) {
            System.out.println("Olete sisse logitud");
        }
        else {
            System.out.print("Nimi: ");
            Scanner sc = new Scanner(System.in);
            String new_name = sc.nextLine();

            System.out.print("Parool: ");
            String new_password = sc.nextLine();
            System.out.println(new_name.equals("Bob") && new_password.equals("123"));
            PassCheck(new_name, new_password);
        }
    }
}
