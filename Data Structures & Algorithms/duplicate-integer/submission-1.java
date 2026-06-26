class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums.length == 0) {
            return false;
        }
        Arrays.sort(nums);
        int prev = nums[0] - 1;
        for (int num : nums) {
            if (num == prev) {
                return true;
            } else {
                prev = num;
            }
        }
        return false;
    }
}
