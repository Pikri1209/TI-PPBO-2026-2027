package src;

class Buku {
    String judul;
    String pegarang;
    int tahunTerbit;
    public Buku(String judul, String pegarang, int tahunTerbit) {
        this.judul = judul;
        this.pegarang = pegarang;
        this.tahunTerbit = tahunTerbit;
    }
    public void tampilakanData(){
        System.out.println("Judul: " + judul + "| pegarang: " + pegarang +  "| tahunTerbit: " + tahunTerbit);

    }
}
public class Latihan1 {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Pemograman java", "budi siduarjo", 2021);
        Buku buku2 = new Buku("Struktur Data", "Rosa A.S", 2018);
        buku1.tampilakanData();
        buku2.tampilakanData();
    }
}
