class Solution {
    public int[] twoSum(int[] nums, int target) {
        /* Create a HashMap to store the numbers and their indices,
        * the idea is to start with an empty map, then in every step
        * check if the target complement exists in the map, or put the
        * current value if it doesn't */
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate
        for (int i = 0; i < nums.length; i++) {
            // Calculate the potential complement that would sum up to the target
            int potential = target - nums[i];

            // Check if this potential complement already exists in the map
            if (map.containsKey(potential)) {
                // Return an array containing the indices of the two numbers that sum
                // up to the target, returning the smallest index first
                return new int[]{Math.min(i, map.get(potential)),
                                Math.max(i, map.get(potential))};
            } else {
                // If it doesn't exist in the map, add the current number and its index to the map
                map.put(nums[i], i);
            }
        }
        return new int[]{0}; // No solution found
    }
}
