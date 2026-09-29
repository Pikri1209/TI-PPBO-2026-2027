import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int jumlah = input.nextInt();

        int[] angka = new int[jumlah];

        System.out.println("Masukkan " + jumlah + " bilangan:");

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();

        }
        int terbesar = angka[0];
        int terbesarkedua = Integer.MIN_VALUE;

        for (int i = 0; i < jumlah; i++) {
            if (angka[i] == terbesar) {
                terbesarkedua = terbesar;
                terbesar = angka[i];
                }
            }

        System.out.println("\nArray:");
        for (int i = 0; i < jumlah; i++) {
            System.out.print(angka[i] + " ");
        }

if (terbesarkedua == Integer.MIN_VALUE) {
    System.out.print("\nTidak terdapat nilai terbesar kedua yang berbeda.  ");
        } else {
    System.out.print("\nNilai terbesar = " + terbesar);
    System.out.println("Nilai terbesar = " + terbesarkedua);

        }

    }

    }

