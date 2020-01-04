class Solution {
    public int getSum(int a, int b) {
        if(a == 0) return b;
        if(b == 0) return a;
        
        int sum = a ^ b;
        int car = (a & b) << 1;
        
        while(car != 0) {
            int curcar = sum & car;
            sum = sum ^ car;
            car = curcar << 1;
        }
        return sum;
    }
}