class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int currSum = numbers[left] + numbers[right];
            if (currSum == target) {
                return new int[] { ++left, ++right };
            } else if (currSum > target) {
                right--;
            } else if (currSum < target) {
                left++;
            }
        }

        return new int[] { 0, 0 };
    }
}
