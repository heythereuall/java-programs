public class EvenSumFibonacci25 {
    public static void main(String[] args) {
        int a = 0, b = 1, c, sum = 0;

        while (a <= 25) {
            if (a % 2 == 0)
                sum += a;

            c = a + b;
            a = b;
            b = c;
        }

        System.out.println("Even sum of Fibonacci series till 25 = " + sum);
    }
}
