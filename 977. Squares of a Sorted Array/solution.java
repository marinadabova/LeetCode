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

//two pointers
