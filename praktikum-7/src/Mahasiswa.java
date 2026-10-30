public class Mahasiswa {
    private String nama;
    private String nim;
    private double ipk;
    public Mahasiswa(String nama, String nim, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }
    public String getNama() {
        return nama;
    }
    public String getNim() {
        return nim;
    }
    public double getIpk() {
        return ipk;
    }
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("budi","111", 3.5 );
        System.out.println("Nama: " + m1.getNama());
        System.out.println("ipk: " + m1.getIpk());
    }
}
