class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = 1;

        while (r < n) {
            if (nums[l] != 0) {
                l++;
                r++;
            } else if (nums[r] == 0) {
                r++;
            } else {
                int temp = nums[r];
                nums[r] = nums[l];
                nums[l] = temp;
            }
        }
    }
}
