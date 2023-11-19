package tugas3;
import static java.lang.System.out;
import java.util.Scanner;

public class tugas3a {
    public static void main (String []abc) {
        Scanner sc = new Scanner(System.in);

        out.print("Masukkan nilai: ");
        double nilai = sc.nextDouble();
        double indeks = 4.0*(nilai/100);

        if (nilai >= 0 && nilai <= 100) {
            out.println("Nilai dalam indeks: " + indeks);
            if (indeks >= 3.2) {
                out.println ("Nilai dalam huruf: A");
            } else if (indeks >= 2.8) {
                out.println ("Nilai dalam huruf: B");
            } else if (indeks >= 2.4) {
                out.println ("Nilai dalam huruf: C");
            } else {
                out.println ("Nilai dalam huruf: D");
            }
        } else {
            out.println("Nilai tidak valid.");
        }
    }
}