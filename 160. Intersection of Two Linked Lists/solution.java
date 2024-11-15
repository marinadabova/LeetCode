/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = listLength(headA);
        int lenB = listLength(headB);
        if (headA == null || headB == null) {
            return null;
        }
        if (lenA < lenB) {
            while (lenB > lenA) {
                headB = headB.next;
                lenB--;
            }
        }
        if (lenA > lenB) {
            while (lenB < lenA) {
                headA = headA.next;
                lenA--;
            }
        }
        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }

    public int listLength(ListNode head) {
        int len = 0;
        ListNode cur = head;
        while (cur!=null) {
            len++;
            cur = cur.next;
        }
        return len;
    }
}
