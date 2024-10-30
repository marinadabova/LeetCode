/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    int listLength(ListNode* head) {
        int len = 0;
        ListNode* cur = head;
        while (cur) {
            len++;
            cur = cur->next;
        }
        return len;
    }
    ListNode* getIntersectionNode(ListNode* headA, ListNode* headB) {
        int lenA = listLength(headA);
        int lenB = listLength(headB);
        if (headA == nullptr || headB == nullptr) {
            return nullptr;
        }
        if (lenA < lenB) {
            while (lenB > lenA) {
                headB = headB->next;
                lenB--;
            }
        }
        if (lenA > lenB) {
            while (lenB < lenA) {
                headA = headA->next;
                lenA--;
            }
        }

        while (headA != nullptr && headB != nullptr) {
            if (headA == headB) {
                return headA;
            }
            headA = headA->next;
            headB = headB->next;
        }
        return nullptr;
    }
};
