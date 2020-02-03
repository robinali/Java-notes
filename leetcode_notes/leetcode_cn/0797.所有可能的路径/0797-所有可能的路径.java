class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> rtn = new ArrayList<>();
        if(graph == null || graph.length == 0) return rtn;
        ArrayList<Integer> tmp = new ArrayList<>();
        tmp.add(0);
        allPathsSourceTarget(rtn, tmp, graph, 0);
        return rtn;
    }

    private void allPathsSourceTarget(List<List<Integer>> rtn, List<Integer> integers, int[][] graph, int idx) {
        if(graph[idx].length == 0) {
            rtn.add(new ArrayList<>(integers));
            return;
        }
        for(int i: graph[idx]) {
            integers.add(i);
            allPathsSourceTarget(rtn, integers, graph, i);
            integers.remove(integers.size() - 1);
        }
    }
}