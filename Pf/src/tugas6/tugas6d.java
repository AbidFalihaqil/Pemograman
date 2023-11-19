package tugas6;

import java.util.Scanner;

import static java.lang.System.out;

public class tugas6d {

    public static void main(String []args) {
        Scanner keyboard = new Scanner(System.in);
        char reply;

        do {
            out.print("Delete evidence? (y/n) ");
            reply =
                    keyboard.findWithinHorizon(".",0).charAt(0);
        } while (reply != 'y' && reply != 'n');

        if (reply == 'y') {
            out.println("Okay, here goes...");

            out.println("The evidence has been deleted.");
        } else {
            out.println("Sorry, buddy. Just asking.");
        }
        keyboard.close();
    }
}
