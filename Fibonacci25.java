public class Fibonacci25 {
    public static void main(String[] args) {
        int a = 0, b = 1, c;

        System.out.print("Fibonacci Series upto 25: ");
        while (a <= 25) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
