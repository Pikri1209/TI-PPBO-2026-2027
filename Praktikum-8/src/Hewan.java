public class Hewan {
    protected String nama;

    public void bersuara() {
        System.out.println("...");
    }
}

class Kucing extends Hewan {
}

class Anjing extends Hewan {
}

class HewanDemo {
    public static void main(String[] args) {
        Kucing k = new Kucing();
        k.nama = "Milo";
        System.out.println("Kucing: " + k.nama);
        k.bersuara();

        Anjing a = new Anjing();
        a.nama = "Danda";
        System.out.println("Anjing: " + a.nama);
        a.bersuara();
    }
}