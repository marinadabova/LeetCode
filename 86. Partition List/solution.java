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
    public ListNode partition(ListNode head, int x) {
        if (head == null) {
            return null;
        }
        ListNode lessPart = new ListNode(0);
        ListNode greaterPart = new ListNode(0);

        ListNode l = lessPart;
        ListNode g = greaterPart;

        ListNode cur = head;

        while (cur != null) {
            if (cur.val >= x) {
                g.next = cur;
                g = g.next;
            } else {
                l.next = cur;
                l = l.next;
            }
            cur = cur.next;
        }
        g.next = null;
        l.next = greaterPart.next;
        return lessPart.next;
    }
}
