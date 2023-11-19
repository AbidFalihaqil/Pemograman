package tugas4;
import java.util.Scanner;
public class tugas4a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nilai Huruf : ");
        String huruf = sc.nextLine();

        switch (huruf) {
            case "A" -> System.out.println("Nilai index : 4.0");
            case "B" -> System.out.println("Nilai index : 3.0");
            case "C" -> System.out.println("Nilai index : 2.0");
            case "D" -> System.out.println("Nilai index : 1.0");
            case "E" -> System.out.println("Nilai index : 0");
            default -> System.out.println("Nilai tidak valid.");
        }

    }
}