/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<Integer> postorder(Node root) {
        Deque<Node> stack = new ArrayDeque<>();
        LinkedList<Integer> list = new LinkedList<>();
        if(root == null) return list;

        stack.add(root);
        while(!stack.isEmpty()) {
            Node node = stack.pollLast();
            list.addFirst(node.val);
            for(Node child: node.children) {
                if(child != null) {
                    stack.add(child);
                }
            }
        }
        return list;
    }
}