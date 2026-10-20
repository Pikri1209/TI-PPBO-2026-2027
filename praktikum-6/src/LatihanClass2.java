public class LatihanClass2 {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.nama = "fikri";
        m1.nim = "12345";
        m1.ipk = 3.75;

        Mahasiswa m2 = new Mahasiswa();
        m2.nama = "siti";
        m2.nim = "6787";
        m2.ipk = 3.82;

        System.out.println(m1.nama + " - " + m1.ipk);
        System.out.println(m2.nama + " - " + m2.ipk);
    }
}