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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode cur = head;

        ListNode nextNode = null;

        while (cur != null && cur.next != null) {
            nextNode = cur.next;
            cur.next = nextNode.next;
            nextNode.next = prev.next;
            prev.next = nextNode;

            prev=cur;
            cur=cur.next;
        }

        return dummy.next;

    }
}

/*
p c n
0-1-2-3-4

    p c n
0-2-1-3-4

0-2-1-4-3-null
*/
