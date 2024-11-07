class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int f=0;
        int b=n-1;
        for(int i=0;i<n;i++){
            if(numbers[f]+numbers[b]==target){
                return new int[]{f+1,b+1};
            }
            else if(numbers[f]+numbers[b]>target){
                b--;
            }
            else{
                f++;
            }
        }
        return new int[]{-1,-1};
    }
}
