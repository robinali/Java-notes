class Solution {
    public int[] anagramMappings(int[] A, int[] B) {
        Map<Integer, Integer> map = new HashMap<>();
        int idx = 0;
        for(int num : B) {
            map.put(num, idx++);
        }
        
        int[] res = new int[A.length];
        idx = 0;
        for(int num: A) {
            res[idx++] = map.get(num);
        }
        return res;
    }
}