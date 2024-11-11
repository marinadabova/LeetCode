class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int maxLen = 0;
        int count = 0;
        for (int num : nums) {
            if (num == 0) {
                count = 0;
            } else {
                count++;
                maxLen = Math.max(maxLen, count);
            }
        }
        return maxLen;
    }
}
