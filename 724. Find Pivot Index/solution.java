class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int leftSum = 0;
        int rightSum = sum;

        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}

//2 arrays approach
class Solution2 {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] sumLeft = new int[n];
        int[] sumRight = new int[n];

        for (int i = 1; i < n; i++) {
            sumLeft[i] = sumLeft[i - 1] + nums[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            sumRight[i] = sumRight[i + 1] + nums[i + 1];
        }

        for (int i = 0; i < n; i++) {
            if (sumLeft[i] == sumRight[i]) {
                return i;
            }
        }
        return -1;
    }
}
