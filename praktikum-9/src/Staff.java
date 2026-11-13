public class Staff extends Pegawai {
    protected double tunjanganKinerja;

    public Staff(String nama, String id, double gajiPokok, double tunjanganKinerja) {
        super(nama, id, gajiPokok);
        this.tunjanganKinerja = tunjanganKinerja;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + tunjanganKinerja;
    }
}