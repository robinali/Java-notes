class Solution {
    // 212
    // Reference: cspiration
    public List<String> findWords(char[][] board, String[] words) {
        // Time: O(m * n * TrieNode) Space: TrieNode
        List<String> res = new ArrayList<>();
        TrieNode root = buildTrie(words);
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                dfs(board, i, j, root, res);
            }
        }
        return res;
    }
    
    private void dfs(char[][] board, int i, int j, TrieNode p, List<String> res) {
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length) return;
        char c = board[i][j];
        if(c == '#' || p.next[c - 'a'] == null) return;
        p = p.next[c - 'a'];
        if(p.word != null) {
            res.add(p.word);
            p.word = null;
        }
        board[i][j] = '#';
        dfs(board, i - 1, j, p, res);
        dfs(board, i + 1, j, p, res);
        dfs(board, i, j - 1, p, res);
        dfs(board, i, j + 1, p, res);
        board[i][j] = c;
    }
    
    private TrieNode buildTrie(String[] words) {
        TrieNode root = new TrieNode();
        for(String word: words) {
            TrieNode p = root;
            for(char c : word.toCharArray()) {
                int i = c - 'a';
                if(p.next[i] == null) {
                    p.next[i] = new TrieNode();
                }
                p = p.next[i];
            }
            p.word = word;
        }
        return root;
    }
    
    class TrieNode {
        TrieNode[] next = new TrieNode[26];
        String word;
    }
}