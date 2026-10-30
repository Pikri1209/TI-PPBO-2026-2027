public class BankDemo {
    public static void main(String[] args) {
        RekeningBank a = new RekeningBank("1001", "Fikri", 500000, "Tabungan");
        RekeningBank b = new RekeningBank("2002", "Andi", 300000, "Giro");

        a.setor(200000);
        a.tarik(100000);
        b.setor(50000);
        b.tarik(150000);

        a.transferKe(b, 250000);
        a.transferKe(b, 5000000);

        a.cetakMutasi();
        b.cetakMutasi();
    }
}