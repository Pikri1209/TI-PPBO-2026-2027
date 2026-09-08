import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = sc.nextInt(); // Menggunakan int untuk umur

        System.out.println("Halo " + nama + " umur anda " + umur);
    }
}