public class KonversiNilai {
    public static void main(String[] args) {
        int nilai = 78;
        char hurusf;

        if (nilai >= 85) {
            hurusf = 'A';
        } else if (nilai >= 70) {
            hurusf = 'B';
        } else if (nilai >= 55) {
            hurusf = 'C';
        } else {
            hurusf = 'E';
        }
        System.out.println("Nilai huruf :" + hurusf);
    }

    /**
     * Constructs a new object.
     */
    public KonversiNilai() {
        super();
    }
}

