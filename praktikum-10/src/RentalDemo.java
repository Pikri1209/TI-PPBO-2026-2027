public class RentalDemo {
    public static void main(String[] args) {
        int lamaSewa = 5;
        Kendaraan[] daftar = {
                new Sepeda("Polygon"),
                new Jeep("Jeep Rubicon")
        };

        for (Kendaraan k : daftar) {
            k.tampilkanInfo(lamaSewa);
            if (k instanceof BisaOffroad) {
                ((BisaOffroad) k).jelajahOffroad();
            }
        }
    }
}