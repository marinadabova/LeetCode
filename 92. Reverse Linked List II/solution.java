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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null){
            return null;
        }
        if(left>right){
            return null;
        }
        if(left==right){
            return head;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;

        ListNode cur=head;
        ListNode prev=dummy;
        for(int i=1;i<left;i++){
            prev=cur;
            cur=cur.next;
        }
        int reversing=right-left;
        ListNode nodeNext=cur.next;
        
        for(int i=0;i<reversing;i++){
           cur.next=nodeNext.next;
           nodeNext.next=prev.next;
           prev.next=nodeNext;
           nodeNext=cur.next;
        }

      return dummy.next;

    }
}
// first reversing : dummy->1 - 3 - 2 - 4 - 5; prev = 1, cur = 2, nodeNext = 4
// second reversing: dummy->1 - 4 - 3 - 2 - 5; prev = 1, cur = 2, nodeNext = 5 (finish)
