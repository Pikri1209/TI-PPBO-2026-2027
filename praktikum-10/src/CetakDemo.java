public class CetakDemo {
    public static void main(String[] args) {
        Cetak[] daftar = {
                new Laporan("Laporan Keuangan"),
                new Struk("TRX01", 50000)
        };
        for (Cetak c : daftar) {
            c.cetak();
        }
    }
}