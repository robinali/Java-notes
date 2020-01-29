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
    /*private List<Integer> list;

    public List<Integer> preorder(Node root) {
        if(this.list == null) {
            this.list = new ArrayList<>();
        }
        if(root == null) return this.list;
        this.list.add(root.val);
        for( Node child : root.children) {
            preorder(child);
        }
        return this.list;
    }*/

    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;

        Deque<Node> stack = new ArrayDeque<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node node = stack.pop();
            list.add(node.val);
            for(int i = node.children.size() - 1; i >= 0; i--) {
                stack.push(node.children.get(i));
            }
        }
        return list;
    }
}