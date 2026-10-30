public class WaktuDemo {
    public static void main(String[] args) {
        System.out.println("--- Nilai valid ---");
        Waktu w = new Waktu(13, 45, 30);
        w.tampilkan();

        System.out.println("\n--- Nilai di luar rentang ---");
        w.setJam(25);
        w.setMenit(60);
        w.setDetik(-5);
        w.tampilkan();

        System.out.println("\n--- Ubah ke nilai valid ---");
        w.setJam(8);
        w.setMenit(5);
        w.setDetik(9);
        w.tampilkan();
    }
}