class Pegawai {
    String nama;
    String nip;
    double gajiPokok;

    public Pegawai(String nama, String nip, double gajiPokok) {
        System.out.println("1. Constructor Pegawai dijalankan");
        this.nama = nama;
        this.nip = nip;
        if (gajiPokok < 0) {
            System.out.println("Peringatan: gajiPokok tidak boleh negatif! Diset menjadi 0.");
            this.gajiPokok = 0;
        } else {
            this.gajiPokok = gajiPokok;
        }
    }

    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIP : " + nip);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}

class Manager extends Pegawai {
    private double tunjanganJabatan;

    public Manager(String nama, String nip, double gajiPokok, double tunjanganJabatan) {
        super(nama, nip, gajiPokok);
        System.out.println("2. Constructor Manager dijalankan");
        this.tunjanganJabatan = tunjanganJabatan;
    }

    public double getTunjanganJabatan() {
        return tunjanganJabatan;
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Tunjangan Jabatan : " + tunjanganJabatan);
    }
}

class Staff extends Pegawai {
    private double tunjanganKinerja;

    public Staff(String nama, String nip, double gajiPokok, double tunjanganKinerja) {
        super(nama, nip, gajiPokok);
        System.out.println("2. Constructor Staff dijalankan");
        this.tunjanganKinerja = tunjanganKinerja;
    }

    public double getTunjanganKinerja() {
        return tunjanganKinerja;
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Tunjangan Kinerja : " + tunjanganKinerja);
    }
}

class Direktur extends Manager {
    private double tunjanganSaham;

    public Direktur(String nama, String nip, double gajiPokok, double tunjanganJabatan, double tunjanganSaham) {
        super(nama, nip, gajiPokok, tunjanganJabatan);
        System.out.println("3. Constructor Direktur dijalankan");
        this.tunjanganSaham = tunjanganSaham;
    }

    public double getTunjanganSaham() {
        return tunjanganSaham;
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Tunjangan Saham : " + tunjanganSaham);
    }
}

public class PerusahaanDemo {
    public static void main(String[] args) {
        Manager m = new Manager("Budi", "12345", 5000000, 2000000);
        m.tampilkanData();
        System.out.println("Getter Tunjangan Jabatan: " + m.getTunjanganJabatan());
        System.out.println();

        Staff s = new Staff("Andi", "12346", -3000000, 1000000);
        s.tampilkanData();
        System.out.println("Getter Tunjangan Kinerja: " + s.getTunjanganKinerja());
        System.out.println();

        Direktur d = new Direktur("Citra", "12347", 10000000, 5000000, 4000000);
        d.tampilkanData();
        System.out.println("Getter Tunjangan Jabatan: " + d.getTunjanganJabatan());
        System.out.println("Getter Tunjangan Saham: " + d.getTunjanganSaham());
    }
}