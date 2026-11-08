package latihan3;

class Kendaraan {
    protected String merek;
    protected int kecepatanMaks;

    Kendaraan(String merek, int kecepatanMaks) {
        this.merek = merek;
        this.kecepatanMaks = kecepatanMaks;
        System.out.println("Constructor Kendaraan");
    }
}

class Mobil extends Kendaraan {
    int jumlahPintu;

    Mobil(String merek, int kecepatanMaks, int jumlahPintu) {
        super(merek, kecepatanMaks);
        this.jumlahPintu = jumlahPintu;
        System.out.println("Constructor Mobil");
    }
}

class Motor extends Kendaraan {
    String jenisMotor;

    Motor(String merek, int kecepatanMaks, String jenisMotor) {
        super(merek, kecepatanMaks);
        this.jenisMotor = jenisMotor;
        System.out.println("Constructor Motor");
    }
}

public class latihan3 {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota", 180, 4);
        Motor motor = new Motor("Honda", 120, "Matic");
    }
}