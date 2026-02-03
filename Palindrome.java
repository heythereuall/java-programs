class Palindrome {
    public static void main(String[] args) {
        int n = 353, rev = 0, temp = n;
        while(n > 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        if(temp == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
