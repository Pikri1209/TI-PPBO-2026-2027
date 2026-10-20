class Produk {
    String namaProduk;
    double harga;

    public Produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    public boolean isMahal(double batasHarga) {
        return this.harga > batasHarga;
    }
}

public class Latihan3  {
    public static void main(String[] args) {
        Produk laptop = new Produk("Laptop Apple", 200000);
        double batas = 3000000;

        System.out.println("Nama Produk: " + laptop.namaProduk);
        System.out.println("Harga: Rp " + laptop.harga);
        System.out.println("Apakah lebih mahal dari Rp" + batas + "? " + laptop.isMahal(batas));

    }
}