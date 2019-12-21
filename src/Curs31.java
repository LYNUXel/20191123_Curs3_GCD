public class Curs31 {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        if (a > b) {
            System.out.println(a); // sout - scurtatura
        } else
            System.out.println(b);
        int x = 320;
        int y = 3432;
        int z = 11;
        /** varianta 1 */
        if (x > y) {
            if (x > z) {
                System.out.println(x);
            } else {
                System.out.println(z);
            }
        } else {
            if (y > z) {
                System.out.println(y);
            } else {
                System.out.println(z);
            }
        }
        /** varianta2 */
        int d = 30;
        int e = 32;
        int f = 11;

        int max2;
        if (d > e) {
            max2 = d;
        } else {
            max2 = e;
        }
        if (max2 > f) {
            System.out.println(max2);
        } else {
            System.out.println(e);
        }
    }
}