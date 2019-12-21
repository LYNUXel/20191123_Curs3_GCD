public class GCD {
    public static void main(String[] args) {
        int a = 84;
        int b = 32;
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }

        }
        System.out.println(a);
    }
}
