class LongestPalindrome {
    public static void main(String[] args) {
        String s = "babad";
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPalindrome(s, i, j) && j - i + 1 > ans.length())
                    ans = s.substring(i, j + 1);
            }
        }
        System.out.println(ans);
    }

    static boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}
