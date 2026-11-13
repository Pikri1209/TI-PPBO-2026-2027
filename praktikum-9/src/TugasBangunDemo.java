public class TugasBangunDemo {
    public static void main(String[] args) {
        BangunDatar[] daftarBangun = {
                new Lingkaran(7),
                new Persegi(5),
                new PersegiPanjang(8, 4),
                new Lingkaran(3),
                new Persegi(6),
        };

        double totalLuas = 0;
        BangunDatar terbesar = daftarBangun[0];

        for (BangunDatar b : daftarBangun) {
            b.tampilkanInfo();
            totalLuas += b.hitungLuas();
            if (b.hitungLuas() > terbesar.hitungLuas()) {
                terbesar = b;
            }
        }

        System.out.println("Total luas: " + totalLuas);
        System.out.println("Luas terbesar: " + terbesar.namaBangun + " (" + terbesar.hitungLuas() + ")");
    }
}