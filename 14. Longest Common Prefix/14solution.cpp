class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        string res="";
        sort(strs.begin(),strs.end());
        int n=strs.size();
        string first=strs[0];
        string last=strs[n-1];
        int f=first.size();
        int l=last.size();
        int size=min(f,l);
        for(int i=0;i<size;i++){
            if(first[i]==last[i]){
                res+=first[i];
            }
            else{
                break;
            }

        }
        return res;
    }
};
