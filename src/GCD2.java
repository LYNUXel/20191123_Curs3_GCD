import java.util.Scanner;

public class GCD2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Valoare pentru a: ");
        int a = s.nextInt();
        System.out.println("Valoare pentru b: ");
        int b = s.nextInt();

        while (a != b) {
            System.out.println(a);
            if (a > b) {
                a = a - b;
            } else {
                System.out.println(b);
                b = b - a;
            }

        }
        System.out.println(a);
    }
}