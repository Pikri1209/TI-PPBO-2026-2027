package latihan1;

class Hewan {
    protected String nama;

    public void bersuara() {
        System.out.println("...");
    }
}

class Kucing extends Hewan {
}

class Anjing extends Hewan {
}

public class Latihan1 {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        kucing.nama = "Tom";
        System.out.print(kucing.nama + " bersuara: ");
        kucing.bersuara();

        Anjing anjing = new Anjing();
        anjing.nama = "Bruno";
        System.out.print(anjing.nama + " bersuara: ");
        anjing.bersuara();
    }
}