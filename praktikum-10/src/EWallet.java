public class EWallet extends MetodePembayaran implements BisaCashback {
    public EWallet(String namaMetode) {
        super(namaMetode);
    }

    @Override
    public double hitungBiayaAdmin(double jumlah) {
        return 1000;
    }

    @Override
    public double hitungCashback(double jumlah) {
        return Math.min(0.05 * jumlah, 20000);
    }
}