/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
        ListNode temp = new ListNode();
        temp.next = head;
        ListNode prev = null;
        ListNode slow = temp;
        ListNode fast = temp;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            prev=slow;
            slow=slow.next;

        }
        prev.next=slow.next;
        return temp.next;
    }
}
