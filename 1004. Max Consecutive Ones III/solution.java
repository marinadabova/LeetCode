class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxLen = 0;
        int countZero = 0;
        int i = 0;
        int n = nums.length;
        for (int j = 0; j < n; j++) {
            if (nums[j] == 0) {
                countZero++;
            }
            while (countZero > k) {
                if (nums[i] == 0) {
                    countZero--;
                }
                i++;
            }
            maxLen = Math.max(maxLen, j - i + 1);
        }

        return maxLen;
    }
}
