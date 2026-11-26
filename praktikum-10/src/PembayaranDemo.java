import java.util.Scanner;

public class PembayaranDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nominal belanja: ");
        double jumlah = in.nextDouble();

        MetodePembayaran[] daftar = {
                new Tunai("Tunai"),
                new KartuKredit("Kartu Kredit"),
                new EWallet("GoPay"),
                new EWallet("OVO")
        };

        MetodePembayaran terbaik = daftar[0];
        double minBersih = Double.MAX_VALUE;

        for (MetodePembayaran m : daftar) {
            m.prosesPembayaran(jumlah);
            double cb = 0;
            if (m instanceof BisaCashback) {
                cb = ((BisaCashback) m).hitungCashback(jumlah);
                System.out.println("Cashback : Rp" + cb);
            }
            double bersih = jumlah + m.hitungBiayaAdmin(jumlah) - cb;
            System.out.println("Bersih   : Rp" + bersih + "\n");

            if (bersih < minBersih) {
                minBersih = bersih;
                terbaik = m;
            }
        }

        System.out.println("Total bersih terkecil: " + terbaik.namaMetode + " (Rp" + minBersih + ")");
    }
}