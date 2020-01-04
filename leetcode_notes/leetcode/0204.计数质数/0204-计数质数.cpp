class Solution {
public:
    int countPrimes(int n) {
         bool *tag = new bool[n];
         int *prime = new int[n];
         int cnt = 0;
         memset(tag, true, sizeof(bool) * n);
         for (int i = 2; i < n; ++i) {
             if (tag[i]) prime[cnt++] = i;
             for (int j = 0; j < cnt && i * prime[j] < n; ++j) {
                 tag[i * prime[j]] = false;
                 if (i % prime[j] == 0) break;
             }
         }
         delete [] tag;
         delete [] prime;
         return cnt;
     }
};