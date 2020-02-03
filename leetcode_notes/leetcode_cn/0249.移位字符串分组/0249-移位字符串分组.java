class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strings) {
            int offset = str.charAt(0) - 'a';
            String key = "";
            for(int i = 0; i < str.length(); i++) {
                char c = (char)(str.charAt(i) - offset);
                if(c < 'a') {
                    c += 26;
                }
                key += c;
            }
            if(!map.containsKey(key)) {
                List<String> list = new ArrayList<>();
                map.put(key, list);
            }
            map.get(key).add(str);
        }
        for(String key : map.keySet()) {
            List<String> list = map.get(key);
            Collections.sort(list);
            res.add(list);
        }
        return res;
    }
}