class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length - 1;
        int currentMax = 0;

        while(i < j) {
            int width = j - i;
            int area = width * Math.min(heights[i], heights[j]);
            currentMax = Math.max(currentMax, area);

            if (heights[i] > heights[j]) {
                j--;
            } else {
                i++;
            }
        }

        return currentMax;
    }
}
