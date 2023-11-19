package tugas3;
import java.util.Scanner;
public class tugas3b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nilai: ");
        int nilai = scanner.nextInt();
        System.out.println("Masukkan nilai minimum: ");
        int nilaiMinimum = scanner.nextInt();
        System.out.println("Masukkan nilai maksimum: ");
        int nilaiMaksimum = scanner.nextInt();
        System.out.println("Masukkan interval: ");
        int interval = scanner.nextInt();
        if (nilaiMaksimum - nilaiMinimum < interval) {
            System.out.println("Interval tidak valid");
        } else {
            int jumlah = 0;
            for (int i = 1; i <= nilai; i++) {
                jumlah += nilaiMinimum;
                nilaiMinimum += interval;
            }
            System.out.println("Jumlah: " + jumlah);
        }
    }


}