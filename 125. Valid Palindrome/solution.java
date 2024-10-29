class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        int start=0;
        int end=s.length()-1;
        while(start<=end){
            char curF=s.charAt(start);
            char curL=s.charAt(end);

            if(!Character.isLetterOrDigit(curF)){
                start++;
            }
            else if(!Character.isLetterOrDigit(curL)){
                end--;
            }
            else{
                if(Character.toLowerCase(curF)!=Character.toLowerCase(curL)){
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}
