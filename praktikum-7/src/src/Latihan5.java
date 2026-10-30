package src;

public class Latihan5 {
    public static void main(String[] args) {
        Persegi[] daftarPersegi = new Persegi[4];
        daftarPersegi[0] = new Persegi(4);
        daftarPersegi[1] = new Persegi(5);
        daftarPersegi[2] = new Persegi(9);
        daftarPersegi[3] = new Persegi(6);
        Persegi persegiTerbesar = daftarPersegi[0];
        for (int i = 1; i < daftarPersegi.length; i++) {
            if (daftarPersegi[i].hitungLuas() > persegiTerbesar.hitungLuas()) {
                persegiTerbesar = daftarPersegi[i];
            }
        }
        System.out.print("persegi dengan luas terbesar memiliki: ");
        System.out.println("panjang Sisi: " + persegiTerbesar.sisi);
        System.out.println("total luas: " + persegiTerbesar.hitungLuas());

    }
}
