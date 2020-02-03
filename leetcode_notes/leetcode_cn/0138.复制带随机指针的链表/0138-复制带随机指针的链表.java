/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};
*/
class Solution {
    // 138
    // Reference: cspiration
    public Node copyRandomList(Node head) {     
        // Time: O(n) Space: O(1)   
        
        if(head == null) return head;
        
        Node cur = head;
        
        //next copy
        while(cur != null) {
            Node copy = new Node(cur.val);
            copy.next = cur.next;
            cur.next = copy;
            cur = copy.next;
        }
        
        cur = head;
        //random copy
        while(cur != null) {
            if (cur.random != null) {
                cur.next.random = cur.random.next;
            }
            cur = cur.next.next;
        }
        
        cur = head;
        Node next = head.next;
        Node rtn = head.next;
        while (cur != null) {
        cur.next = cur.next.next;
        if (next.next != null) {
            next.next = next.next.next;
        }
        cur = cur.next;
        next = next.next;
        }
        return rtn;
    }
}