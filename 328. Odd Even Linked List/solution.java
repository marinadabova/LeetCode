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
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode oddList = head;
        ListNode evenList = head.next;

        ListNode curOdd = oddList;
        ListNode curEven = evenList;

        while (curOdd.next != null && curEven.next != null) {
            curOdd.next = curEven.next;
            curOdd = curOdd.next;

            curEven.next = curOdd.next;
            curEven = curEven.next;
        }
        curOdd.next = evenList;

        return oddList;
    }
}
/*
cO  cE
2 -> 1 -> 3 -> 5-> 6 -> 4 -> 7

        cO  cE
     ---------v
2 - 1 - 3 -> 5-> 6 -> 4 -> 7
   ------^
 */
