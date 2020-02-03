class Solution {
    public int divide(int dividend, int divisor) {
        // Device two integers without using multilication, devision and mod operator
        // 1. +, -
        // 2. Over flow
        // 3. = 0 3/5
        // 4. normal
        // Time: O(logn) Space log(n)
        int sign = 1;
        if((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)) sign = -1;
        long ldividend = Math.abs((long) dividend);
        long ldivisor = Math.abs((long) divisor);
        if(ldividend < ldivisor || ldividend == 0) return 0;
        // if dividend or divisor is 0 throw exception by JVM
        long lres = divide(ldividend, ldivisor);
        if(lres > Integer.MAX_VALUE) {
            return (sign == 1) ?  Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            return (int)(sign * lres);
        }
    }
    
    private long divide(long ldividend, long ldivisor) {
        if(ldividend < ldivisor) return 0;
        long sum = ldivisor;
        long multiple = 1;
        while((sum + sum) <= ldividend) {
            sum += sum;
            multiple += multiple;
        }
        return multiple + divide(ldividend - sum, ldivisor);
    }
}