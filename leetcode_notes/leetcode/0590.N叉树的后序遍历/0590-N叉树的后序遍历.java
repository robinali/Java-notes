/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<Integer> postorder(Node root) {
        LinkedList<Integer> rtn = new LinkedList<Integer>();
        
        if(root == null) {
            return rtn;
        }
        Stack<Node> stack = new Stack<>();
        
        stack.push(root);
        
        while(!stack.isEmpty()) {
            Node node = stack.pop();
            rtn.addFirst(node.val);            
            for(Node child : node.children) {
                stack.push(child);
            }
        }
        return rtn;
    }
}