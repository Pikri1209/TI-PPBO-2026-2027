public abstract class Kendaraan {
    protected String nama;
    protected double tarifPerHari;

    public Kendaraan(String nama, double tarifPerHari) {
        this.nama = nama;
        this.tarifPerHari = tarifPerHari;
    }

    public abstract double hitungTotalSewa(int lamaSewa);

    public void tampilkanInfo(int lamaSewa) {
        System.out.println("Kendaraan  : " + nama);
        System.out.println("Tarif/Hari : Rp" + tarifPerHari);
        System.out.println("Total Sewa : Rp" + hitungTotalSewa(lamaSewa));
    }
}