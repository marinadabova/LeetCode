class Solution1 {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> indexes;
        int sum=0;
        for(int i=0;i<nums.size();i++){
            for(int j=i+1;j<nums.size();j++){
                if(nums[i]+nums[j]==target){
                    indexes.push_back(i);
                    indexes.push_back(j);
                }
            }
        }
        return indexes;
    }
};

class Solution2 {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> indexes;
        map<int, int> m;

        for (int i = 0; i < nums.size(); i++) {
            m.insert({nums[i], i});
        }
        for (int i = 0; i < nums.size(); i++) {
            int temp = target - nums[i];
            if (m.contains(temp) && m.at(temp) != i) {
                indexes.push_back(i);
                indexes.push_back(m.at(temp));
                break;
            }
        }

        return indexes;
    }
};
