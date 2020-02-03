public class Codec {
    private Map<String, String> map = new HashMap<>();
    private String alphabet = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private Random rand = new Random();
    private String key = getRand();
    
    private String getRand() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 6; i++) {
            sb.append(alphabet.charAt(rand.nextInt(62)));
        }
        return sb.toString();
    }
    
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        //Create a unique String: count, Hash, Random
        while(map.containsKey(this.key )) {
            this.key = getRand();
        }
        map.put(key, longUrl);
        return "http://tinyurl.com/" + this.key;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        // Get the data from HashMap
        return map.get(shortUrl.replace("http://tinyurl.com/", ""));
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));