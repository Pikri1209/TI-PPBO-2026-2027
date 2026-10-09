public class Latihan4 {
    static int cariNilaiMinimum(int[] data) {
        int min = data[0];

        for (int i = 1; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }

    static int cariNilaiMaximum(int[] data) {
        int max = data[0];
        for (int i = 1; i < data.length; i++) {

    if (data[i] > max) {
       max = data[i];
            }
        }
        return max;
    }

}
