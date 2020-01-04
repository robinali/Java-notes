/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Deque<Integer> s1 = new ArrayDeque<>();
        Deque<Integer> s2 = new ArrayDeque<>();
        while(l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }
        while(l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }
        ListNode cur = new ListNode(0);
        int sum = 0;
        while(!s1.isEmpty() || !s2.isEmpty()) {
            // Add from last digit to first
            if(!s1.isEmpty()) sum += s1.pop();
            if(!s2.isEmpty()) sum += s2.pop();
            cur.val = sum%10;
            // New node to add to head, when sum > 10, head is sum /10
            ListNode head = new ListNode(sum/10);
            head.next = cur;
            cur = head;
            sum /= 10;
        }
        return cur.val == 0 ? cur.next: cur;
    }
}