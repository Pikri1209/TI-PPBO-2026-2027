package latihan2;

class Kendaraan {
    protected String merek;
    protected int kecepatanMaks;
}

class Mobil extends Kendaraan {
    int jumlahPintu;
}

class Motor extends Kendaraan {
    String jenisMotor;   // "Matic" / "Manual"
}

public class latihan2 {
    public static void main(String[] args) {
        Mobil m = new Mobil();
        m.merek = "Toyota";
        m.kecepatanMaks = 180;
        m.jumlahPintu = 4;
        System.out.println("Mobil: " + m.merek + ", " + m.kecepatanMaks + " km/jam, " + m.jumlahPintu + " pintu");

        Motor t = new Motor();
        t.merek = "Honda";
        t.kecepatanMaks = 120;
        t.jenisMotor = "Matic";
        System.out.println("Motor: " + t.merek + ", " + t.kecepatanMaks + " km/jam, " + t.jenisMotor);
    }
}