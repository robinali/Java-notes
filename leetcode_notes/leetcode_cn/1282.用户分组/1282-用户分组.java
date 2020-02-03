class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer,List<Integer>> group = new HashMap<>();
        List<List<Integer>> rtn = new ArrayList<>();
        for(int i = 0; i < groupSizes.length; i++) {
            group.computeIfAbsent(groupSizes[i], x -> new ArrayList<>()).add(i);
            if(group.get(groupSizes[i]).size() == groupSizes[i]) {
                rtn.add(group.get(groupSizes[i]));
                group.remove(groupSizes[i]);
            }
        }
        return rtn;
    }
}