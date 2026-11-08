package latihan4;

class Kendaraan {
    protected String merek;
    protected int kecepatanMaks;

    Kendaraan(String merek, int kecepatanMaks) {
        this.merek = merek;
        this.kecepatanMaks = kecepatanMaks;
    }
}

class Mobil extends Kendaraan {
    int jumlahPintu;

    Mobil(String merek, int kecepatanMaks, int jumlahPintu) {
        super(merek, kecepatanMaks);
        this.jumlahPintu = jumlahPintu;
    }

    void tampilkanInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("Kecepatan maks: " + kecepatanMaks);
        System.out.println("Jumlah pintu: " + jumlahPintu);
    }
}

public class latihan4 {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota", 180, 4);
        mobil.tampilkanInfo();
    }
}