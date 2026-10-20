public class Tugas1 {
    String kodeProduk;
    String namaProduk;
    double harga;
    int stok;
    public Tugas1(String kodeProduk, String namaProduk, double harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    public double hitungTotalHarga(int jumlahBeli) {
        return this.harga * jumlahBeli;
    }

    public void kurangiStok(int jumlah) {
        if (this.stok >= jumlah) {
            this.stok -= jumlah;
            System.out.println("Berhasil membeli " + jumlah + " unit. Sisa stok: " + this.stok);
        } else {
            System.out.println("Stok tidak mencukupi");
        }
    }
    public void tampilkanData() {
        System.out.println("Kode: " + this.kodeProduk +
                " | Nama: " + this.namaProduk +
                " | Harga: Rp" + this.harga +
                " | Stok: " + this.stok);
    }
}