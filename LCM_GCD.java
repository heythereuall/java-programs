public class LCM_GCD {
    public static void main(String[] args) {
        int a = 12, b = 18;
        int x = a, y = b;

        while (x != y) {
            if (x > y)
                x = x - y;
            else
                y = y - x;
        }

        int hcf = x;
        int lcm = (a * b) / hcf;

        System.out.println("HCF = " + hcf);
        System.out.println("LCM = " + lcm);
    }
}
