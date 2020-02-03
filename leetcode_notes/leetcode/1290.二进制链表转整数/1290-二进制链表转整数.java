/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        int rtn = 0;
        ListNode node = head;
        while(node != null) {
            rtn = ( rtn << 1) | node.val;
            node = node.next;
        }
        return rtn;
    }
}