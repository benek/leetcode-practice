class Solution {
    public int[] replaceElements(int[] arr) {
        // edge case
        if (arr.length == 1) {
            arr[0] = -1;
            return arr;
        }
        int rightMax = -1;

        // neetcode approach without needing a new array
        for (int i = arr.length-1; i >= 0; i--) {
            int newMax = Math.max(rightMax, arr[i]);
            arr[i] = rightMax;
            rightMax = newMax;
        }
        return arr;
    }
}