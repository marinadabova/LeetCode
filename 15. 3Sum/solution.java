class Solution1 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        
        List<List<Integer>> ans = new ArrayList<>();

        Set<List<Integer>>  uniqueSum = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int start = i+1;
            int end = n - 1;

            while(start<end){
                int curSum=nums[i]+nums[start]+nums[end];
                if(curSum<0){
                    start++;
                }
                else if(curSum>0){
                    end--;
                }
                else{
                  List<Integer> triplets = new ArrayList<>();
                  triplets.add(nums[i]);
                  triplets.add(nums[start]);
                  triplets.add(nums[end]);
                  uniqueSum.add(triplets);
                  start++;
                  end--;

                  while(start<end && nums[start]==nums[start-1]){
                    start++;
                  }
                  while(start<end && nums[end]==nums[end+1]){
                    end--;
                  }
                }
            }
        }
        for(List<Integer> x : uniqueSum){
            ans.add(x);
        }
        return ans;

    }
}
//
class Solution2 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        List<List<Integer>> ans = new ArrayList<>();

        Set<List<Integer>> uniqueSum = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int start = i + 1;
            int end = n - 1;

            while (start < end) {
                int curSum = nums[i] + nums[start] + nums[end];
                if (curSum < 0) {
                    start++;
                } else if (curSum > 0) {
                    end--;
                } else {
                    List<Integer> triplets = new ArrayList<>();
                    triplets.add(nums[i]);
                    triplets.add(nums[start]);
                    triplets.add(nums[end]);
                    uniqueSum.add(triplets);
                    start++;
                    end--;
                }
            }
        }
        for (List<Integer> x : uniqueSum) {
            ans.add(x);
        }
        return ans;

    }
}
//
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i <n; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            
            int start = i + 1;
            int end = n - 1;

            while (start < end) {
                int curSum = nums[i] + nums[start] + nums[end];

                if (curSum > 0) {
                    end--;
                } else if (curSum < 0) {
                    start++;
                } else {
                    ans.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    start++;

                    while (nums[start] == nums[start-1] && start < end) {
                        start++;
                    }
                }
            }
        }
        return ans;        
    }
}
