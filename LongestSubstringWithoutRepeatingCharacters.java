class LongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            boolean[] seen = new boolean[256];
            for (int j = i; j < s.length(); j++) {
                if (seen[s.charAt(j)])
                    break;
                seen[s.charAt(j)] = true;
                max = Math.max(max, j - i + 1);
            }
        }
        System.out.println(max);
    }
}
