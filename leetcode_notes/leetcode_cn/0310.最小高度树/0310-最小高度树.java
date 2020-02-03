class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> res = new ArrayList<>();
        if(n == 0) return res;
        if(n == 1) {
            res.add(0);
            
        }
        ArrayList<HashSet<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            graph.add(new HashSet<Integer>());
        }
        for(int[] edge: edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        LinkedList<Integer> leaves = new LinkedList<>();
        for(int i = 0; i < n; i++){
            if(graph.get(i).size() == 1) {
                leaves.offer(i);
            }
        }
        if(leaves.size() == 0) return res;
        while(n > 2) {
            n = n - leaves.size();
            LinkedList<Integer> newLeaves = new LinkedList<>();
            for(int l : leaves) {
                int neighbor = graph.get(l).iterator().next();
                graph.get(neighbor).remove(l);
                if(graph.get(neighbor).size() == 1) {
                    newLeaves.add(neighbor);
                }
            }
            leaves = newLeaves;
        }
        return leaves;
    }
}