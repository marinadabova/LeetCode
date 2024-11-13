class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int start=0;
        int end=n-1;
  
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){ //1,2,3 target=2
                return mid;
            }
          
            //if left part is monotonically increasing, or the pivot point is on the right part
            if(nums[start]<=nums[mid]){ //4,5,6,7,0,1,2  
                //must use "<=" at here since we need to make sure target is in the left part,
                //then safely drop the right part
                if(target>=nums[start] &&target<nums[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{ //6,7,0,1,2,4,5
                if(target>nums[mid] && target<=nums[end]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
