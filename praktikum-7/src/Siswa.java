public class Siswa {
    private String nama;
    private double nilai;

    public Siswa(String nama, double nilai) {
        this.nama = nama;
        setNilai(nilai);
    }

    public String getNama() { return nama; }
    public double getNilai() { return nilai; }

    public void setNilai(double nilai) {
        if (nilai >= 0 && nilai <= 100) {
            this.nilai = nilai;
        } else {
            System.out.println("Nilai ditolak: " + nilai + " (harus 0-100)");
        }
    }

    public char getNilaiHuruf() {
        if (nilai >= 80) return 'A';
        if (nilai >= 70) return 'B';
        if (nilai >= 60) return 'C';
        if (nilai >= 50) return 'D';
        return 'E';
    }
}
