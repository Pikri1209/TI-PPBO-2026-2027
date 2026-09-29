public class Forbiasa {
    public static void main(String[] args) {
        int[] nilai = {80, 75, 90, 60, 88};

        System.out.println("--- Menggunakan for biasa ---");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Indeks " + i + ": " + nilai[i]);
        }

        System.out.println("--- Menggunakan enhanced for ---");
        for (int n : nilai) {
            System.out.println(n);
        }
    }
}
