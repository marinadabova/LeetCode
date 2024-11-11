class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] arr=s.toCharArray();
        int n=arr.length;

        int i=0,j=0;
        int maxLenWindow=0;

        Map<Character,Integer> mp=new HashMap<>();
        while(j<n){
            mp.put(arr[j],mp.getOrDefault(arr[j],0)+1);
            while(mp.size()<j-i+1){
                if(mp.get(arr[i])==1){
                    mp.remove(arr[i]);
                }else{
                    mp.put(arr[i],mp.get(arr[i])-1);
                }
                i++;
            }
            maxLenWindow=Math.max(maxLenWindow,j-i+1);
            j++;
        }
       
        return maxLenWindow;
    }
}
