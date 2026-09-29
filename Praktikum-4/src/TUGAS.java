import java.util.Scanner;

public class TUGAS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int KKM = 75;

        System.out.print("Masukkan jumlah mahasiswa: ");
        int N = input.nextInt();

        int[] nilai = new int[N];

        for (int i = 0; i < N; i++) {
        System.out.print("Masukkan jumlah mahasiswa  ke-: " + (i+ 1)+ ": ");
        nilai[i] = input.nextInt();
    }

        int tertinggi = nilai[0];
        int terendah = nilai[0];
        int total = 0;
        int jumlahlulus = 0;
        int jumlahtidaklulus= 0;

        for (int i = 0; i < N; i++) {
            total += nilai[i];

            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }

            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }

            if (nilai[i] >= KKM) {
                jumlahlulus++;
            } else {
                jumlahtidaklulus++;
            }
        }

        double ratarata = (double) total / N;

        System.out.printf("\n     - HASIL -  ");
        System.out.printf("Rata-rata     %.2f", ratarata);
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);
        System.out.println("jumlah lulus : " + jumlahlulus);
        System.out.println("Tidak lulus : " + jumlahtidaklulus);

        System.out.println("\n SEBELUM DIURUTKAN ");
        for (int i = 0; i < N; i++) {
            System.out.print(nilai[i] + " ");
        }
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                if (nilai[j] > nilai[j + 1]) {
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }

        System.out.println("\n\n SETELAH DIURUTKAN ");
        for (int i = 0; i < N; i++) {
            System.out.print(nilai[i] + " ");
        }

        System.out.println();
        input.close();
    }
}