class Solution {
    // https://leetcode.com/problems/fizz-buzz/solution/
    public List<String> fizzBuzz(int n) {
        List<String> rtn = new ArrayList<>();
        for(int num = 1; num <= n; num++) {            
            if(num % 15 == 0) {
                rtn.add("FizzBuzz");
            } else if(num % 3 == 0) {
                rtn.add("Fizz");
            } else if(num % 5 == 0) {
                rtn.add("Buzz");
            } else {
                rtn.add(Integer.toString(num));
            }
        }
        return rtn;
    }
}