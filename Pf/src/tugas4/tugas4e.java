package tugas4;
import java.util.Scanner;

public class tugas4e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nilai Mata Kuliah : ");
        int nilai = sc.nextInt();

        if (nilai >= 80 && nilai <= 100) {
            System.out.println("Nilai Index : 4.0");
        } else if (nilai >= 70 && nilai <= 79) {
            System.out.println("Nilai Index : 3.0");
        } else if (nilai >= 60 && nilai <= 69) {
            System.out.println("Nilai Index : 2.0");
        } else if (nilai >= 50 && nilai <= 59) {
            System.out.println("Nilai Index : 1.0");
        } else if (nilai >= 0 && nilai <= 49) {
            System.out.println("Nilai Index : 0");
        } else {
            System.out.println("Nilai tidak valid.");
        }
    }
}