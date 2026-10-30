import src.LatihanClass;

public class LatihanClass2 {
    private double ipk;

    public void setIpk(double ipk) {
        if (ipk >= 0.0 && ipk <= 4.0) {
            this.ipk = ipk;
        } else {
            System.out.println("IPK tidak valid, harus 0.0 - 4.0");
        }
    }

    public static void main(String[] args) {
        LatihanClass2 m1 = new LatihanClass2();
        m1.setIpk(3.8);
        System.out.println("IPK sekarang "+ m1.ipk);

        m1.setIpk(9.9);
        System.out.println("IPK sekarang "+ m1.ipk);
    }
}
