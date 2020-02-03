class Solution {
    // 212
    // Reference: cspiration
    
    private int[][] DIRECTIONS = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    
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
        dfs(board, i + DIRECTIONS[0][0], j + DIRECTIONS[0][1], p, res);
        dfs(board, i + DIRECTIONS[1][0], j + DIRECTIONS[1][1], p, res);
        dfs(board, i + DIRECTIONS[2][0], j + DIRECTIONS[2][1], p, res);
        dfs(board, i + DIRECTIONS[3][0], j + DIRECTIONS[3][1], p, res);
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