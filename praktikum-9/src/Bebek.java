public class Bebek extends Hewan{
    public Bebek(String name) {
        super(name);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + ": kwek kwek ");
    }
}
