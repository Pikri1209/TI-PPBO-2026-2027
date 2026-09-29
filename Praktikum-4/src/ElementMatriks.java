public class ElementMatriks {
    public static void main(String[] args) {
        int[][] matriks = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int totalMatriks = 0;

        for (int baris = 0; baris < matriks.length; baris++) {
            for (int kolom = 0; kolom < matriks[baris].length; kolom++) {
                totalMatriks += matriks[baris][kolom];
            }
        }

        System.out.println("Total elemen matriks: " + totalMatriks);
    }
}