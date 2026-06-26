class Solution {
    public boolean isSubsequence(String s, String t) {
        // edge cases
        if (s.isEmpty()) return true;
        if (t.isEmpty()) return false;

        String res = "";
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                res += s.charAt(i);
                i++;
                j++;
            } else {
                j++;
            }
        }
        return s.equals(res);
    }
}