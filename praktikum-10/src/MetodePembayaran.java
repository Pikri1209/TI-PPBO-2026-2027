public abstract class MetodePembayaran {
    protected String namaMetode;

    public MetodePembayaran(String namaMetode) {
        this.namaMetode = namaMetode;
    }

    public abstract double hitungBiayaAdmin(double jumlah);

    public void prosesPembayaran(double jumlah) {
        double admin = hitungBiayaAdmin(jumlah);
        System.out.println("Metode   : " + namaMetode);
        System.out.println("Belanja  : Rp" + jumlah);
        System.out.println("Admin    : Rp" + admin);
        System.out.println("Total    : Rp" + (jumlah + admin));
    }
}