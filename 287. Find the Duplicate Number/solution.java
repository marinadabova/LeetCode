//Two ptr-slow&fast O(1) space
/*
1 3 4 2 2
0 1 2 3 4
value - next
index - node

0->1->3->2->4->2->4->..  => 0->1->3->2->4 
                                     ^  |
                                     |<-v
  finding cycle in linked list using slow and fast ptr   which means that duplicate number exists

  slow=nums[0];
  fast=nums[nums[0]];
     s  f
  0->1->3->2->4 |    
          |<---v
slow=nums[slow];
fast=nums[nums[fast]];
        s     f
  0->1->3->2->4 |
          |<---v

  after we find that cycle exists we want to find which number => where cycle enters
  */

//first variation
class Solution11 {
    public int findDuplicate(int[] nums) {
        int slow=nums[0];
        int fast=nums[nums[0]];
        
        //  Detect the cycle
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[nums[fast]];
        }  
        // Find the entrance to the cycle
        fast=0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
//second variation
class Solution12 {
    public int findDuplicate(int[] nums) {
        int slow=nums[0];
        int fast=nums[0];
        
        //  Detect the cycle
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];

        }  while(slow!=fast);

        // Find the entrance to the cycle
        slow=nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}

//Map -O(n) time and space
class Solution2 {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> m = new HashMap<>(n);

        for (int i = 0; i < n; i++) {
            m.put(nums[i], m.getOrDefault(nums[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> i : m.entrySet()) {
            if (i.getValue() >= 2) {
                return i.getKey();
            }
        }
        return -1;
    }
}
//HashSet -O(n) 
class Solution3 {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for(int num:nums){
            if(seen.contains(num)){
                return num;
            }
            seen.add(num);
        }
        return -1;
    }
}
