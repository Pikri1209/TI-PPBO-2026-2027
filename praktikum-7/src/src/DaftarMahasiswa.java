package src;

public class DaftarMahasiswa {
    public static void main(String[] args) {
        Mahasiswa[] Daftar = new Mahasiswa[3];

        Daftar[0] = new Mahasiswa("Budi", "111", 3.50);
        Daftar[1] = new Mahasiswa("Siti", "222", 3.80);
        Daftar[2] = new Mahasiswa("Andi", "333", 3.20);

        for (Mahasiswa m : Daftar) {
            m.tampilkanData();
            System.out.println("---");
        }
    }
}