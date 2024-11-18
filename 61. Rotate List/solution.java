/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy, slow = dummy;
        int size = 0;
        while (fast.next != null) {
            size++;
            fast = fast.next;
        }
        int n = size - k % size; //how many times should we traverse to the new headNode
        
        for (int i = n; i > 0; i--) {
            slow = slow.next;
        }
        fast.next = dummy.next;
        dummy.next = slow.next;
        slow.next = null;

        return dummy.next;
    }
}
/*
s         f
0-1-2-3-4-5
      |
size-k% size =5- 2%5= 5-2=3 times

      s   f        
0-1-2-3-4-5

5-1-2-3-4
0-4-5-1-2-3-null

*/
