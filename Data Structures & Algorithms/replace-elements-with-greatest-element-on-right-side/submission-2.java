class Solution {
    public int[] replaceElements(int[] arr) {
        // edge case
        if (arr.length == 1) {
            arr[0] = -1;
            return arr;
        }
        int currMax = 0;

        int[] ans = new int[arr.length];
        for (int i = arr.length-2; i >= 0; i--) {
            currMax = Math.max(currMax, arr[i+1]);
            ans[i] = currMax;
        }
        ans[arr.length-1] = -1;
        return ans;
    }
}