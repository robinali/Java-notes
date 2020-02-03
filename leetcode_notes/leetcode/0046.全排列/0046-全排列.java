class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> rtn = new LinkedList<>();
        int[] visited = new int[nums.length];
        backtrack(rtn, nums, new LinkedList<Integer>(), visited);
        return rtn;
    }

    private void backtrack(List<List<Integer>> rtn, int[] nums, LinkedList<Integer> tmp, int[] visited) {
        if(tmp.size() == nums.length) {
            rtn.add(new LinkedList<>(tmp));
            return;
        }
        for(int i = 0; i < nums.length; i++) {
            if(visited[i] == 1) continue;
            visited[i] = 1;
            tmp.addLast(nums[i]);
            backtrack(rtn, nums, tmp, visited);
            visited[i] = 0;
            tmp.removeLast();
        }
    }
}