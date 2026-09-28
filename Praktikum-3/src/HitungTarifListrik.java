// Nama: Pikri Ramadhan Maha
// NIM:  2025573010021
// Kelas:TI 2.A

import java.util.Scanner;

public class HitungTarifListrik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 3. Konstanta tarif di awal program
        final double TARIF_450 = 415.0;
        final double TARIF_900 = 1352.0;
        final double TARIF_1300 = 1444.0;
        final double TARIF_2200 = 1444.0;
        final double TARIF_LEBIH_2200 = 1699.53;

        // 1. Baca input golongan daya
        System.out.print("Masukkan golongan daya (450, 900, 1300, 2200, >2200): ");
        int daya = input.nextInt();

        // 2. Baca input pemakaian kWh
        System.out.print("Masukkan jumlah pemakaian listrik (kWh): ");
        double kwh = input.nextDouble();

        // 4. Validasi input pakai operator logika (||) biar nolak minus atau nol
        if (kwh < 0 || kwh == 0) {
            System.out.println("Error: Pemakaian listrik tidak boleh nol atau negatif!");
        } else {
            double tarifPerKwh = 0;

            // 3. Nentuin golongan pake if-else bertingkat
            if (daya == 450) {
                tarifPerKwh = TARIF_450;
            } else if (daya == 900) {
                tarifPerKwh = TARIF_900;
            } else if (daya == 1300) {
                tarifPerKwh = TARIF_1300;
            } else if (daya == 2200) {
                tarifPerKwh = TARIF_2200;
            } else if (daya > 2200) {
                tarifPerKwh = TARIF_LEBIH_2200;
            } else {
                System.out.println("Error: Golongan daya tidak terdaftar!");
                return; // stop program kalau dayanya ngasal
            }

            // nge hitung total
            double totalTagihan = kwh * tarifPerKwh;
            // 5. Nampilin output yang rapi
            System.out.println("\n--- Rincian Tagihan Listrik ---");
            System.out.println("Golongan Daya    : " + daya + " VA");
            System.out.println("Jumlah Pemakaian : " + kwh + " kWh");
            System.out.println("Tarif per kWh    : Rp " + tarifPerKwh);
            System.out.println("Total Tagihan    : Rp " + totalTagihan);
        }

        input.close();
    }
}