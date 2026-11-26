public class Sepeda extends Kendaraan {
    public Sepeda(String nama) {
        super(nama, 25000);
    }

    @Override
    public double hitungTotalSewa(int lamaSewa) {
        return tarifPerHari * lamaSewa;
    }
}