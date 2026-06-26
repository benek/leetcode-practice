class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.isEmpty() || s.length() != t.length()) {
            return false;
        }

        char[] seqS = s.toCharArray();
        char[] seqT = t.toCharArray();

        Arrays.sort(seqS);
        Arrays.sort(seqT);

        return Arrays.equals(seqS, seqT);
    }
}
