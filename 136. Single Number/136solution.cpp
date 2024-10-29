class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int single_num = 0;
        for(auto& num: nums) {
            single_num ^= num; 
        }
        return single_num;
    }
};

class Solution2 {
public:
    int singleNumber(vector<int>& nums) {
        unordered_map<int,int> m;

        for(int i=0;i<nums.size();i++){
            m[nums[i]]++;
        }
        for(auto x: m){
            if(x.second== 1){
                return x.first;
            }
        }
        return -1;
    }
};


class Solution3 {
public:
    int singleNumber(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        for(int i = 1; i < nums.size(); i+=2){
            if(nums[i] != nums[i-1]){
                return nums[i-1];
            }
        }
        return nums[nums.size()-1];
    }
};
