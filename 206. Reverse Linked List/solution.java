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
//iterative
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode prev = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head = prev;
        return head;
    }
}
//recursive 
class Solution2 {
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        return reverseListRec(head,null);
    }
    private ListNode reverseListRec(ListNode head,ListNode prev) {
        if(head==null){
            return prev;
        }
        ListNode next=head.next;
        head.next=prev;
        return reverseListRec(next,head);
    }
}
