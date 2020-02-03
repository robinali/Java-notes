/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] G) {
        Set<Integer> gSet = new HashSet<>();
        for(int num : G)
            gSet.add(num);
        
        ListNode cur = head;
        int ans = 0;
        
        while(cur != null) {
            if(gSet.contains(cur.val) &&
              (cur.next == null || !gSet.contains(cur.next.val)))
                ans++;
            
            cur = cur.next;
        }
        return ans;
    }
}