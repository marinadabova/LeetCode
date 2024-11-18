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
class Solution1 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        if (k == 1) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode cur = head;
        int i = 0;
        while (cur != null) {
            i++;
            if (i % k == 0) {
                prev = reverse(prev, cur.next);
                cur = prev.next;

            } else {
                cur = cur.next;
            }
        }
        return dummy.next;
    }

    private ListNode reverse(ListNode begin, ListNode end) {

        ListNode prev = begin;
        ListNode cur = begin.next;
        ListNode revTail = begin.next;
        ListNode nodeNext = null;

        while (cur != end) {
            nodeNext = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nodeNext;
        }

        begin.next = prev;
        revTail.next = cur;
        return revTail;
    }
}
//b     e
//0-1-2-3-4-5

//b  rT e
//0-2-1-3-4-5

//    b     e
//0-2-1-3-4-5



//
class Solution2 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        if(k==1){
            return head;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;

        ListNode prev=dummy;
        ListNode cur=head;

        while(cur!=null){
            boolean space=checkSpace(k,cur); //checking if we have enough space for reversing
            if(space==true){
                prev=reverse(prev,cur,k);
                cur=prev.next;
            }else{
                break;
            }
        }
        return dummy.next;
    }
    private boolean checkSpace(int k,ListNode cur){
        for(int i=1;i<=k;i++){
            if(cur==null){
                return false;
            }
            cur=cur.next;
        }
        return true;
    }
    private ListNode reverse(ListNode prev,ListNode cur,int k){
        for(int i=0;i<k-1;i++){
            ListNode nodeNext=cur.next;
            cur.next=nodeNext.next;
            nodeNext.next=prev.next;
            prev.next=nodeNext;
        }
        return cur;
    }
}
