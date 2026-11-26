public class Jeep extends Kendaraan implements BisaOffroad {
    public Jeep(String nama) {
        super(nama, 500000);
    }

    @Override
    public double hitungTotalSewa(int lamaSewa) {
        return tarifPerHari * lamaSewa;
    }

    @Override
    public void jelajahOffroad() {
        System.out.println(nama + " menjelajahi medan offroad!");
    }
}