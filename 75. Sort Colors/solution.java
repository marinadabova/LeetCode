class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;

        while (mid <= end) {
            if (nums[mid] == 0) {
                swap(nums, mid, start);
                start++;
                mid++;
            } else if (nums[mid] == 2) {
                swap(nums, mid, end);
                end--;
            } else {
                mid++;
            }
        }
    }
    private void swap(int[] nums, int p1, int p2) {
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
    }
}
