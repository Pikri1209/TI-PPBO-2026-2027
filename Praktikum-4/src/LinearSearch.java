public class LinearSearch {
    public static void main(String[] args) {
        int[] nilai = {75, 80, 90, 100, 85};

        int cari = 90;
        int posisi = -1;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == cari) {
                posisi = i;
                break;
            }
        }

        if (posisi != -1) {
            System.out.println("Nilai " + cari + " ditemukan di indeks ke-" + posisi);
        } else {
            System.out.println("Nilai " + cari + " tidak ditemukan.");
        }
    }
}