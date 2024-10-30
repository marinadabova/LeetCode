/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution1 {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> visited=new HashSet<>();
        ListNode cur=head;
        while(cur!=null){
            if(visited.contains(cur)){
                return true;
            }
            visited.add(cur);
            cur=cur.next;
        }
        return false;
    }
}

//two pointers
public class Solution2 {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
