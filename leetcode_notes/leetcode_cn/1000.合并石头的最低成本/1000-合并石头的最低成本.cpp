class Solution {
public:
    int mergeStones(vector<int>& stones, int K) {
        // Reference: huahua
        // Time: O(nˆ3 / K) Space: O(nˆ2)
        const int n = stones.size();
        if((n - 1) % (K - 1)) return -1;
        
        vector<int> sums(n + 1);
        for(int i = 0; i < stones.size(); i++)
            sums[i + 1] = sums[i] + stones[i];
        
        const int kInf = 1e9;
        vector<vector<int>> cache(n, vector<int>(n, kInf));
        
        std::function<int(int, int)>dp;
        dp = [&stones, &sums, &cache, &dp, K, kInf](int i, int j){
            const int l = j - i + 1;
            if(l < K) return 0;
            if(cache[i][j] != kInf) return cache[i][j];
            int ans = kInf;
            for(int m = i; m < j; m += K -1)
                ans = min(ans, dp(i, m) + dp(m + 1, j));
            if((l - 1) % (K - 1) == 0)
                ans += sums[j + 1] - sums[i];
            return cache[i][j] = ans;
        };
        return dp(0, n - 1);
    }
};