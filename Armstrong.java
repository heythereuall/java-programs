class Armstrong {
    public static void main(String[] args) {
        int n = 153, sum = 0, temp = n;
        while(n > 0) {
            int d = n % 10;
            sum = sum + d*d*d;
            n = n / 10;
        }
        if(temp == sum)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}
