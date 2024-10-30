class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> i : map.entrySet()) {
            if (i.getValue() > n / 2) {
                return i.getKey();
            }
        }
        return -1;

    }
}
