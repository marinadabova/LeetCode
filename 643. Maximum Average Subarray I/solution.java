class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double maxAvgSum = 0;
        double curSum = 0;

        for (int i = 0; i < k; i++) {
            curSum += nums[i];
        }
        maxAvgSum = curSum;
        for (int i = k; i < n; i++) {
            curSum = curSum - nums[i - k] + nums[i];
            maxAvgSum = Math.max(maxAvgSum, curSum);
        }
        return maxAvgSum / k;
    }

}
