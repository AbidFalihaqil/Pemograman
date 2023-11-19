package tugas2;
import java.util.Scanner;
public class tugas2a{
    public static void main(String[] aaa){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Username: ");
        String username = keyboard.next();

        if (username.equals("bburd")) {
            System.out.print("Password: ");
            String password = keyboard.next();

            if (password.equals("abid")){
                System.out.println("You're in.");
            }else{
                System.out.println("incorrect password");
            }
        }else{
            System.out.println("Unknown user");
        }

        keyboard.close();
    }
}