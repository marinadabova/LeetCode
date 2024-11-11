class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int i = 0, j = 0;
        int sum = 0;
        int n = nums.length;
        while (j < n) {
            sum += nums[j];
            while (sum >= target) {
                minLength = Math.min(minLength, j - i + 1);
                sum -= nums[i];
                i++;
            }
            j++;

        }
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }
}
