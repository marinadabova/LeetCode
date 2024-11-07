class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] ans= new int[n];
        for(int i=0;i<n;i++){
            ans[i]=(int)Math.pow(nums[i],2); //nums[i]*nums[i];
        }
        Arrays.sort(ans);
        return ans;
    }
}

//two pointers -start and end ptr
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int s = 0, e = n - 1;
        int index = e;
        
        while (index >= 0) {
            int leftNum = nums[s] * nums[s];
            int rightNum = nums[e] * nums[e];
            if (leftNum < rightNum) {
                ans[index] = rightNum;
                e--;
                index--;
            } else {
                ans[index] = leftNum;
                s++;
                index--;
            }
        }
        return ans;
    }
}
