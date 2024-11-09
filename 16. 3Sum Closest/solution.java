class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int gap = Integer.MAX_VALUE;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int start = i + 1;
            int end = n - 1;

            while (start < end) {
                int curSum = nums[i] + nums[start] + nums[end];
                if (curSum == target) {
                    return target;
                } else if (curSum < target) {
                    start++;
                } else {
                    end--;
                }
                int curGap = Math.abs(curSum - target);
                if (curGap < gap) {
                    gap = curGap;
                    ans = curSum;
                }
            }
        }
        return ans;
    }
}
