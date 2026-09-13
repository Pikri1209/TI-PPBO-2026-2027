/**
 * Nama: Pikri Ramadhan Maha
 * NIM: 22025573010021
 * Program: Kalkulator Bangun Datar
 * Mata Kuliah: Praktikum Pemrograman Berorientasi Objek
 */
import java.util.Scanner;
public class KalkulatorBangunDatar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menghitung luas dan keliling persegi panjang
        System.out.println("=== KALKULATOR PERSEGI PANJANG ===");
        System.out.print("Masukkan panjang: ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar: ");
        double lebar = input.nextDouble();

        double luasPersegiPanjang = panjang * lebar;
        double kelilingPersegiPanjang = 2 * (panjang + lebar);
        System.out.println("Luas Persegi Panjang: " + luasPersegiPanjang);
        System.out.println("Keliling Persegi Panjang: " + kelilingPersegiPanjang);

        // Menyimpan hasil luas ke variabel boolean (true jika luas > 100)
        boolean luasBesar = luasPersegiPanjang > 100;
        System.out.println("Apakah luas persegi panjang > 100? " + luasBesar);
        System.out.println();

        // Menghitung luas dan keliling lingkaran menggunakan Math.PI
        System.out.println("=== KALKULATOR LINGKARAN ===");
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = input.nextDouble();
        double luasLingkaran = Math.PI * jariJari * jariJari;
        double kelilingLingkaran = 2 * Math.PI * jariJari;
        System.out.println("Luas Lingkaran: " + luasLingkaran);
        System.out.println("Keliling Lingkaran: " + kelilingLingkaran);

        input.close();
    }
}