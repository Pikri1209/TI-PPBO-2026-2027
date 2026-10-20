import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {

        Buku[] daftarBuku = new Buku[4];
        daftarBuku[0] = new Buku("Buku A", "Pengarang A", 2014);
        daftarBuku[1] = new Buku("Buku b", "Pengarang b", 2019);
        daftarBuku[2] = new Buku("Buku c", "Pengarang c", 2016);
        daftarBuku[3] = new Buku("Buku d", "Pengarang d", 2015);

        Scanner input = new Scanner("Daftar buku yg terbit setelah tahun 2015: ");
        for (int i = 0; i < daftarBuku.length; i++) {
            if (daftarBuku[i].tahunTerbit > 2015) {
                System.out.println("- " + daftarBuku[i].judul + " (" + daftarBuku[i].tahunTerbit + ")");
            }
        }
    }
}