class Solution1 {
    public int removeDuplicates(int[] nums) {
      
        int k = 0;
        for(int num : nums){
            if(k == 0 || k == 1 || nums[k-2] != num){
                nums[k] = num;
                k++;
            }
        }
        return k;
    }
}
//
class Solution2 {
    public int removeDuplicates(int[] nums) {
        int l=2;
        for(int r=2;r<nums.length;r++){
            if(nums[r]!=nums[l-2]){
                nums[l]=nums[r];
                l++;
            }
        }
        return l;
    }
}
//the same as upper one 
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2){
            return nums.length;
        }
        
        int slow = 2, fast = 2;

        while (fast < nums.length) {
            if (nums[slow - 2] != nums[fast]) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        
        return slow;
    }
}
