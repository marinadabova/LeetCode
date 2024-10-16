class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        auto lowerB = lower_bound(nums.begin(), nums.end(), target);
        
        return (lowerB - nums.begin());
    }
};
