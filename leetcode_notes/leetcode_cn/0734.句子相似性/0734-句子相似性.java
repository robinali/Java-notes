class Solution {
    public boolean areSentencesSimilar(String[] words1, String[] words2, List<List<String>> pairs) {
        if(words1.length != words2.length) return false;
        Map<String, Set<String>> map = new HashMap<>();
        for(List<String> p : pairs) {
            if(!map.containsKey(p.get(0))) map.put(p.get(0), new HashSet<>());
            map.get(p.get(0)).add(p.get(1));
        }
        
        for(int i = 0; i < words1.length; i++) {
            if(!words1[i].equals(words2[i])
               && !map.getOrDefault(words1[i], new HashSet()).contains(words2[i])
               && !map.getOrDefault(words2[i], new HashSet<>()).contains(words1[i])){
                return false;
            }
        }
        return true;
    }
}