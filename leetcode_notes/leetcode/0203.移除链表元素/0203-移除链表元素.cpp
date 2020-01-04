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
    ListNode* removeElements(ListNode* head, int val) {
        if (head == NULL) return NULL;

         ListNode *cur = head, *next = head->next;
         while (next != NULL) {
             if (next->val == val) {
                 cur->next = next->next;
                 delete next;
                 next = cur->next;
             } else {
                 cur = cur->next;
                 next = next->next;
             }
         }
         if (head->val == val) {
             cur = head;
             head = head->next;
             delete cur;
         }
         return head;
     }
};