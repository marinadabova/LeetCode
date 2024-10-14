class Solution {
public:
    bool isPalindrome(int x) {
        if(x<0){
            return false;
        }
        long long reversed;
        long long temp = x;

        while(temp){
            reversed=reversed*10+temp%10;
            temp/=10;
        }
        if(x==reversed){
            return true;
        }
        return false;
        //return x == reversed;
    }
};
