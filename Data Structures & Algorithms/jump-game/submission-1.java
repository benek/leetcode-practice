class Solution {
    public boolean canJump(int[] nums) {
        if (nums == null && nums.length == 0) return false;
        if (nums.length <= 1) return true;
        int distToTarget = 0;
        boolean result = false;
        int target = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.println("target: " + target);
            System.out.println("i: " + i);
            if (i == 0) {
                return result;
            }
            int prev = nums[i - 1];
            System.out.println("prev: " + prev);
            //if (distToTarget > 0) {
            //    prev += distToTarget;
            //}
            System.out.println("prev + i-1: " + (prev + (i - 1)));
            if (prev + (i-1) >= target) {
                result = true;
                target -= distToTarget + 1;
                continue;
            } else {
                distToTarget++;
                result = false;
            }
            System.out.println("distTT: " + distToTarget);
            System.out.println("result: " + result);
            System.out.println("-");
        }
        return result;
    }
}
