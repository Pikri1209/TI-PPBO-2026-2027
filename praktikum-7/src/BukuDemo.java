public class BukuDemo {
    public static void main(String[] args) {
        Buku b = new Buku("Pemrograman Java", "Budi Santoso", 2020);
        System.out.println("--- Data awal ---");
        b.tampilkanInfo();

        b.setJudul("Java untuk Pemula");
        b.setPengarang("Siti Aminah");
        System.out.println("\n--- Setelah setJudul dan setPengarang ---");
        b.tampilkanInfo();
        System.out.println("\nTahun terbit (getter): " + b.getTahunTerbit());
    }
}