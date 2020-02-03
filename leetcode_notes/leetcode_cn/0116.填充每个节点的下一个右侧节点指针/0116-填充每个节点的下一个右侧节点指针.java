/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val,Node _left,Node _right,Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
class Solution {
    // 116
    // REference: cspiration
    public Node connect(Node root) {
        // Time: O(n) Space: O(1)
        Node start = root;
        while(start != null) {
            Node cur = start;
            while(cur != null) {
                if(cur.left != null) {
                    cur.left.next = cur.right;
                }
                if(cur.right != null && cur.next != null) {
                    cur.right.next = cur.next.left;
                }
                cur = cur.next;
            }
            start = start.left;
        }
        return root;
    }
}