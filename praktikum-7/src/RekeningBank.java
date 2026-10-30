public class RekeningBank {
    private String nomorRekening;
    private String pemilik;
    private double saldo;
    private final String jenisRekening;

    public RekeningBank(String nomorRekening, String pemilik, double saldo, String jenisRekening) {
        this.nomorRekening = nomorRekening;
        this.pemilik = pemilik;
        this.saldo = saldo;
        this.jenisRekening = jenisRekening;
    }

    public String getNomorRekening() { return nomorRekening; }
    public String getPemilik() { return pemilik; }
    public double getSaldo() { return saldo; }
    public String getJenisRekening() { return jenisRekening; }

    public void setNomorRekening(String nomorRekening) { this.nomorRekening = nomorRekening; }
    public void setPemilik(String pemilik) { this.pemilik = pemilik; }

    public void setor(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Setor gagal: jumlah harus lebih dari 0");
            return;
        }
        saldo += jumlah;
        System.out.println("Setor Rp" + jumlah + " berhasil");
    }

    public void tarik(double jumlah) {
        if (jumlah <= 0 || jumlah > saldo) {
            System.out.println("Tarik gagal: jumlah tidak valid atau saldo tidak cukup");
            return;
        }
        saldo -= jumlah;
        System.out.println("Tarik Rp" + jumlah + " berhasil");
    }

    public void transferKe(RekeningBank tujuan, double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Transfer gagal: jumlah harus lebih dari 0");
        } else if (saldo < jumlah) {
            System.out.println("Transfer gagal: saldo tidak cukup");
        } else {
            saldo -= jumlah;
            tujuan.saldo += jumlah;
            System.out.println("Transfer Rp" + jumlah + " dari " + pemilik + " ke " + tujuan.pemilik + " berhasil");
        }
    }

    public void cetakMutasi() {
        System.out.println("=============================");
        System.out.println("No. Rekening : " + nomorRekening);
        System.out.println("Pemilik      : " + pemilik);
        System.out.println("Jenis        : " + jenisRekening);
        System.out.println("Saldo        : Rp" + saldo);
        System.out.println("=============================");
    }
}