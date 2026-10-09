public class Latihan5 {

    static int hitungTotal(int[] data) {
        int total = 0;
        for (int nilai : data) {
            total += nilai;
        }
        return total;
    }
    static int[] filterratarata(int[] data) {
        int total = hitungTotal(data);
        double rataRata = (double) total / data.length;

        int jumlah = 0;

        for (int nilai : data) {
            if (nilai > rataRata) {
                jumlah++;
            }
        }
        int[] hasil = new int[jumlah];
    int index = 0;
    for (int nilai : data) {
            if (nilai > rataRata) {
                hasil[index++] = nilai;
            }
        }

        return hasil;
    }

    public static void main(String[] args) {

        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int total = hitungTotal(data);
        double rataRata = (double) total / data.length;
        int[] hasil = filterratarata(data);

        System.out.println("Data: ");
        for (int nilai : data) {
            System.out.print(nilai + " ");
        }
    System.out.println();
        System.out.println("Total = " + total);
    System.out.println("Total Rata: " + rataRata);
 System.out.println("Nilai atas rata rata:");

        for (int nilai : hasil) {
            System.out.print(nilai + " ");
        }
    }
}