/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    // 92
    // Reference: cspiration
    public ListNode reverseBetween(ListNode head, int m, int n) {
        // Time: O(n) Space: O(1)
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = dummy.next;
        for(int i = 1; i < m; i++) {
            cur = cur.next;
            pre = pre.next;
        }
        for(int i = 0; i < n - m; i++) {
            ListNode temp = cur.next;
            cur.next = temp.next;
            temp.next = pre.next;
            pre.next = temp;
        }
        return dummy.next;
    }
}