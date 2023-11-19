package tugas3;
import java.util.Scanner;

public class tugas3c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan radius lingkaran: ");
        double radius = input.nextDouble();
        double luas = 3.14 * (radius * radius);
        double keliling = 2 * 3.14 * radius;
        System.out.println("Luas lingkaran: " + luas);
        System.out.println("Keliling lingkaran: " + keliling);
        input.close();
    }
}