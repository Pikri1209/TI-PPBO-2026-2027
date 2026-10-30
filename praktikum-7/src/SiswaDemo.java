public class SiswaDemo {
    public static void main(String[] args) {
        double[] uji = {95, 75, 65, 55, 30, 105, -10};
        Siswa s = new Siswa("Fikri", 0);

        for (double n : uji) {
            System.out.println("\nSet nilai: " + n);
            s.setNilai(n);
            System.out.println("Nilai tersimpan: " + s.getNilai() + " -> Huruf: " + s.getNilaiHuruf());
        }
    }
}