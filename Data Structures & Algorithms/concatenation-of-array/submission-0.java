class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];

        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            ans[i] = curr;
            ans[i+nums.length] = curr;
        }

        return ans;
    }
}