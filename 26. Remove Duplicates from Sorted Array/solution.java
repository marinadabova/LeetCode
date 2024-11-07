class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}
//two pointers- l for equals, r for non-equals
class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int l=0;
        int r=1;

        while(r<n){
            if(nums[l]==nums[r]){
                r++;
            }else if(nums[l]!=nums[r]){
                l++;
                nums[l]=nums[r];
            }
        }
        return l+1;
    }
}
