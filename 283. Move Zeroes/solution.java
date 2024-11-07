//two pointers -left for 0 and right for non-zero
class Solution1 {
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
//
class Solution2 {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int index=0;

        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[index++]=nums[i];
            }
        }
        for(int i=index;i<n;i++){
            nums[i]=0;
        }
    }
}
