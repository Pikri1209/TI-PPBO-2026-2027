import java.util.Scanner;
public class KalkulatorMethod {
    static double tambah(double a, double b) { return a + b; }
    static double tambah(double a, double b, double c) { return a + b + c; } // overloading
    static double kurang(double a, double b) { return a - b; }
    static double kali(double a, double b) { return a * b; }
    static double bagi(double a, double b) { return a / b; }
    static double pangkat(double a, double b) { return Math.pow(a, b); }
    static double akar(double a) { return Math.sqrt(a); }

 static double riwayatKeMaksimum(double[] riwayatHasil) {
   double max = riwayatHasil[0];
   for (double h : riwayatHasil) {
      if (h > max) max = h;
    }
        return max;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] riwayat = new double[100];
        int jumlah = 0, pilih;
        do {
            System.out.println("\n gitKALKULATOR ");
            System.out.println("1. Tambah (2 angka)  2. Tambah (3 angka)");
            System.out.println("3. Kurang  4. Kali  5. Bagi");
            System.out.println("6. Pangkat  7. Akar Kuadrat  8. Keluar");
            System.out.print("Pilih: ");
            pilih = in.nextInt();

            if (pilih == 8) break;
            if (pilih < 1 || pilih > 7) {
                System.out.println("Pilihan tidak ada!");
                continue;
            }

            // input angka
            System.out.print("Angka pertama: ");
            double a = in.nextDouble(), b = 0, c = 0;
            if (pilih != 7) {                 // akar cuma butuh 1 angka
                System.out.print("Angka kedua: ");
                b = in.nextDouble();
            }
            if (pilih == 2) {                 // tambah 3 angka
                System.out.print("Angka ketiga: ");
                c = in.nextDouble();
            }
    if ((pilih == 5 && b == 0) || (pilih == 7 && a < 0)) {
     System.out.println("Error: operasi tidak valid!");
         continue;
            }

            double hasil = 0;
            switch (pilih) {
                case 1: hasil = tambah(a, b); break;
                case 2: hasil = tambah(a, b, c); break;
                case 3: hasil = kurang(a, b); break;
                case 4: hasil = kali(a, b); break;
                case 5: hasil = bagi(a, b); break;
                case 6: hasil = pangkat(a, b); break;
                case 7: hasil = akar(a); break;
            }
            System.out.println("Hasil: " + hasil);
            if (jumlah < riwayat.length) riwayat[jumlah++] = hasil; // simpan ke riwayat
        } while (true);
        if (jumlah > 0) {
            double[] data = java.util.Arrays.copyOf(riwayat, jumlah);
            System.out.println("Hasil terbesar: " + riwayatKeMaksimum(data));
        } else {
            System.out.println("Belum ada perhitungan.");
        }
        in.close();
    }
}