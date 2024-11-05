class Solution {
    public int minStartValue(int[] nums) {
        int result = 0, min_res = 0;
        for(int x : nums){
            result += x;
            if(result < min_res){
                min_res = result;
            }
        }
        return -min_res + 1;
    }
}

//the same as the upper one but with Math mehtods

class Solution {
    public int minStartValue(int[] nums) {
        int sum = 0;
        int min = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            min = Math.min(min,sum);

        }
        return Math.abs(min) + 1;
        
    }
}

//minPrefixSum!!
class Solution {
    public int minStartValue(int[] nums) {
        int n = nums.length;
        int[] prefixSum = new int[n + 1]; 
        prefixSum[0] = 0; 
        
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }
        
        int minAnswer = prefixSum[0];
        for (int i = 1; i <= n; i++) {
            minAnswer = Math.min(minAnswer, prefixSum[i]);
        }
        
        return Math.abs(minAnswer) + 1;

    }
}
