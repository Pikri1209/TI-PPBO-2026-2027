public class BangunDemo {
    public static void main(String[] args) {
        BangunDatar[] daftar = {
                new Persegi(4),
                new PersegiPanjang(5, 3),
                new Lingkaran(7)
        };

        for (BangunDatar b : daftar) {
            b.tampilkanInfo();
        }
    }
}