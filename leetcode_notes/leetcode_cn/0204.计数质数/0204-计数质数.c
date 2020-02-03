int countPrimes(int n) {
     bool *tag = NULL;
     int *prime = NULL;
     
     tag = malloc(sizeof(bool) * (n + 1));
     prime = malloc(sizeof(int) * (n + 1));
     int cnt = 0;
     memset(tag, true, sizeof(bool) * n);
     for (int i = 2; i < n; ++i) {
         if (tag[i]) prime[cnt++] = i;
         for (int j = 0; j < cnt && i * prime[j] < n; ++j) {
             tag[i * prime[j]] = false;
             if (i % prime[j] == 0) break;
         }
     }
     free(tag);
     free (prime);
     return cnt;
    
}