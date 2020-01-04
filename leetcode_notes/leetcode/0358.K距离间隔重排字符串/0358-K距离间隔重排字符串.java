class Solution {
    public String rearrangeString(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b) -> Integer.compare(b.getValue(), a.getValue()));
        pq.addAll(map.entrySet());
        
        Queue<Map.Entry<Character, Integer>> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        
        while(!pq.isEmpty()) {
            Map.Entry<Character, Integer> cur = pq.poll();
            sb.append(cur.getKey());
            cur.setValue(cur.getValue() - 1);
            queue.offer(cur);
            if(queue.size() < k) continue;
            Map.Entry<Character, Integer> front = queue.poll();
            if(front.getValue() > 0) {
                pq.offer(front);
            }
        }
        return sb.length() == s.length() ? sb.toString() : "";
    }
}