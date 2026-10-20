public class Tugas2 {
    public static void main(String[] args) {
        Tugas1[] data = new Tugas1[5];
        data[0] = new Tugas1("P001", "Laptop ASUS", 12500000, 10);
        data[1] = new Tugas1("P002", "Mouse Wireless", 150000, 50);
        data[2] = new Tugas1("P003", "Keyboard Mechanical", 850000, 20);
        data[3] = new Tugas1("P004", "Monitor Samsung", 2100000, 15);
        data[4] = new Tugas1("P005", "Flashdisk 64GB", 95000, 3);

        System.out.println("Daftar Produk:");
        for (int i = 0; i < data.length; i++) {
            data[i].tampilkanData();
        }
        System.out.println("");
        System.out.println("Simulasi Beli 1");
        System.out.println("Mau beli 2 " + data[0].namaProduk);
        System.out.println("Totalnya: Rp" + data[0].hitungTotalHarga(2));
        data[0].kurangiStok(2);

        System.out.println("");
        System.out.println("Simulasi Beli 2");
        System.out.println("Mau beli 5 " + data[4].namaProduk);
        data[4].kurangiStok(5);

        System.out.println("");
        System.out.println("Produk Paling Mahal:");
        Tugas1 mahal = data[0];
        
        for (int i = 0; i < data.length; i++) {
            if (data[i].harga > mahal.harga) {
                mahal = data[i];
            }
        }

        mahal.tampilkanData();
    }
}