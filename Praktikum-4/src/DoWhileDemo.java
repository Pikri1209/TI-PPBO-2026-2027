import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;

        do{
            System.out.println("masukkan angka (0 untuk berhenti): ");
            angka = input.nextInt();
            System.out.println("masukkan angka " + angka);
        } while(angka != 0);

        System.out.println("progam berhenti): ");
    }
}

