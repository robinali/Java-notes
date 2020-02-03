/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {}

    public Node(int _val,List<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
};
*/
class Solution {
    // 133
    // Reference: cspiration
    public Node cloneGraph(Node node) {
        // Time: O(m + n) m: nodes n: edges Space: O(m)
        if(node == null) return node;
        List<Node> nodes = getNodes(node);
        HashMap<Node, Node> map = new HashMap<>();
        
        for(Node cur : nodes) {
            List<Node> neighbors = new ArrayList<>();
            map.put(cur, new Node(cur.val, neighbors));
        }
        for(Node cur: nodes) {
            Node newNode = map.get(cur);
            for(Node neighbor : cur.neighbors) {
                newNode.neighbors.add(map.get(neighbor));
            }
        }
        return map.get(node);
    }
    
    private List<Node> getNodes(Node node) {
        Queue<Node> queue = new LinkedList<>();
        HashSet<Node> set = new HashSet<>();
        queue.offer(node);
        set.add(node);
        
        while(!queue.isEmpty()) {
            Node cur = queue.poll();
            for(Node neighbor : cur.neighbors) {
                if(!set.contains(neighbor)) {
                    set.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }
        return new ArrayList<>(set);
    }
}