class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int s = 0;
        int e = n - 1;
        int maxArea = Integer.MIN_VALUE;

        while (s < e) {
            int area = Math.min(height[s], height[e]) * (e - s);
            maxArea = Math.max(maxArea, area);
            if (height[s] < height[e]) {
                s++;
            } else {
                e--;
            }

        }
        return maxArea;
    }
}
