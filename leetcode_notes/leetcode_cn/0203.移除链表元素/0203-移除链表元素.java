/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    // 203
    // Reference: cspiration
    public ListNode removeElements(ListNode head, int val) {
        // Time: O(n) Space: O(1)
        if(head == null) return head;
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }
}