class Solution {
    public boolean hasGroupsSizeX(int[] deck) {      
        
        Arrays.sort(deck);
        int lastd, gcd, i;
        lastd = deck[0];
        i = gcd = 0;
        
        int current_cnt = 0;
        for (int d : deck) {
            if(lastd != d)
            {
                if (current_cnt > 1)
                {
                    gcd = getGCD(current_cnt, gcd);
                    if (gcd < 2) {
                        return false;
                    }
                }
                current_cnt = 1;
            }
            else{
                current_cnt+=1;
            }
            lastd = d;
        }
        gcd = getGCD(current_cnt, gcd);
        return gcd < 2? false : true;
    }
    
    private int getGCD(int a, int b) {
        if (a < 0 || b < 0) {
            return -1;
        }
        if (b == 0) {
            return a;
        }
        return a % b == 0? b: getGCD(b, a%b);        
    }
                                                                     
}
