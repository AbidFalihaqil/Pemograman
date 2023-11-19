package tugas4;
import java.util.Scanner;

public class tugas4c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nilai Angka : ");
        double angka = sc.nextInt();

        if (angka >= 80 && angka <= 100) {
            System.out.println("Nilai Huruf : A");
        } else if (angka >= 70 && angka <= 79.99) {
            System.out.println("Nilai Huruf : B");
        } else if (angka >= 60 && angka <= 69.99) {
            System.out.println("Nilai Huruf : C");
        } else if (angka >= 50 && angka <= 59.99) {
            System.out.println("Nilai Huruf : D");
        } else if (angka >= 0 && angka <= 49.99) {
            System.out.println("Nilai Huruf : E");
        } else {
            System.out.println("Nilai angka tidak valid.");
        }
    }
}