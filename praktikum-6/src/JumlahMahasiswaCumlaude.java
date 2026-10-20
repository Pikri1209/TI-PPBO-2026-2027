public class JumlahMahasiswaCumlaude {
    public static void main(String[] args) {
        Mahasiswa[] daftar = new Mahasiswa[3];
        daftar[0] = new Mahasiswa("Budi", "111", 3.50);
        daftar[1] = new Mahasiswa("Siti", "222", 3.80);
        daftar[2] = new Mahasiswa("Andi", "333", 3.20);

        int jumlahCumlaude = 0;
        for (Mahasiswa m : daftar) {
            if (m.isCumlaude()) {
                jumlahCumlaude++;
            }
        }

        System.out.println("Jumlah mahasiswa cumlaude: " + jumlahCumlaude);
    }
}