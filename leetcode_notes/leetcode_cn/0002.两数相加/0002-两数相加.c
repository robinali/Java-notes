/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2){
    struct ListNode* result = (struct ListNode*) malloc(sizeof(struct ListNode));
    struct ListNode* head = result;
    int carrybit = 0;
    int sum = 0;
    struct ListNode* c1 = l1;
    struct ListNode* c2 = l2;
    while(c1 || c2) {
        if(!c1) {
            sum = (c2->val + carrybit);
            c2 = c2-> next;
        } else if(!c2) {
            sum = (c1->val + carrybit);
            c1 = c1->next;
        } else {
            sum = (c1->val + c2->val + carrybit);
            c1 = c1->next;
            c2 = c2->next;
        }
        if(sum >= 10)
            carrybit = 1;
        else
            carrybit = 0;
        result->val = sum % 10;
        if(c1 || c2) {
            result->next = (struct ListNode*) malloc(sizeof(struct ListNode));
            result = result->next;
        }
    }
    if(carrybit) {
        result->next = (struct ListNode*) malloc(sizeof(struct ListNode));
        result->next->val = 1;
        result->next->next = NULL;
    } else {
        result->next = NULL;
    }
    return head;
}

