/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    // 206
    // Reference: cspiration
    public ListNode reverseList(ListNode head) {
        // Time: O(n) Space: O(1)
        if(head == null || head.next == null) return head;
        ListNode pre = null;
        while(head != null) {
            ListNode temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }
        return pre;
    }
}