public class ScopeDemo {
    public static void metodeA() {
        int x = 10;
        System.out.println("metodeA, x = " + x);
    }
    public static void metodeb() {
        int x = 99;
        System . out . println ( "metodeB, x = " + x );;

    }
    public static void main(String[] args) {
        metodeA();
        metodeb();
    }
}
