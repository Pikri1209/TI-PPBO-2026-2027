package latihan5;

class Akun {
    protected String username;
    protected double saldo;

    Akun(String username, double saldo) {
        this.username = username;
        this.saldo = saldo;
    }
}

class AkunPremium extends Akun {
    private double batasKredit;

    AkunPremium(String username, double saldo, double batasKredit) {
        super(username, saldo);
        this.batasKredit = batasKredit;
    }

    void cekLimit() {
        System.out.println("Username: " + username);
        System.out.println("Saldo: " + saldo);
        System.out.println("Batas kredit: " + batasKredit);
    }
}
public class latihan5 {
    public static void main(String[] args) {
        AkunPremium akun = new AkunPremium("fikri", 500000, 2000000);
        akun.cekLimit();
    }
}