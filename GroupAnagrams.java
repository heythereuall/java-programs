class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        boolean[] used = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {
            if (used[i]) continue;

            System.out.print("[");
            System.out.print(strs[i]);
            used[i] = true;

            for (int j = i + 1; j < strs.length; j++) {
                if (!used[j] && isAnagram(strs[i], strs[j])) {
                    System.out.print(", " + strs[j]);
                    used[j] = true;
                }
            }
            System.out.println("]");
        }
    }

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;

        int[] count = new int[26];
        for (int i = 0; i < a.length(); i++) {
            count[a.charAt(i) - 'a']++;
            count[b.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++)
            if (count[i] != 0) return false;

        return true;
    }
}
