class Solution {
    public int scoreOfString(String s) {
        int totalSum = 0;
        for (int i = 1; i < s.length(); i++) {
            int curr = s.charAt(i);
            int prev = s.charAt(i-1);
            totalSum += Math.abs(curr - prev);
        }
        return totalSum;
    }
}